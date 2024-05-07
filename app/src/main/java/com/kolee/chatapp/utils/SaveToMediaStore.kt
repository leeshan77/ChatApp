package com.kolee.chatapp.utils

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.media.MediaScannerConnection
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.io.OutputStream
import java.text.SimpleDateFormat

object SaveToMediaStore {

    @SuppressLint("SimpleDateFormat")
    fun getImageUri(context: Context, bitmap: Bitmap?): Uri? {
        // Generating a file name
        val timeStamp = SimpleDateFormat("yyyyMMdd_HHmmss").format(System.currentTimeMillis())
        val fileName = "Image_${timeStamp}.jpg"
        val folderName = "CHATTING_APP"

        var imageUri: Uri? = null
        var imageFile: File? = null
        // Output stream
        var fos: OutputStream? = null

        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                // getting the contentResolver
                context.contentResolver?.also { resolver ->
                    // Content resolver will process the contentvalues
                    val contentValues = ContentValues().apply {
                        // putting file information in content values
                        put(MediaStore.MediaColumns.DISPLAY_NAME, fileName)
                        put(MediaStore.MediaColumns.MIME_TYPE, "image/jpg")
                        put(
                            MediaStore.MediaColumns.RELATIVE_PATH,
                            Environment.DIRECTORY_PICTURES + File.separator + folderName
                        )
                    }

                    // Inserting the contentValues to contentResolver and getting the Uri
                    imageUri =
                        resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)

                    // Opening an outputstream with the Uri that we got
                    fos = imageUri?.let { resolver.openOutputStream(it) }
                }
            } else {
                val imagesDir = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).toString()
                        + File.separator + folderName
                )

                if (!imagesDir.exists()) imagesDir.mkdir()
                imageFile = File(imagesDir, fileName)
                fos = FileOutputStream(imageFile)
            }

            if (bitmap != null) {
                fos?.use { stream ->
                    if (!bitmap.compress(Bitmap.CompressFormat.JPEG, 70, stream)) {
                        throw IOException("Failed to save bitmap!")
                    }
                    stream.flush()
                }
            }

        } finally {
            fos?.close()
        }

        // For devices running android < Q
        if (imageFile != null) {
            MediaScannerConnection.scanFile(context, arrayOf(imageFile.toString()), null, null)
            imageUri = Uri.fromFile(imageFile)
        }

        return imageUri
    }
}