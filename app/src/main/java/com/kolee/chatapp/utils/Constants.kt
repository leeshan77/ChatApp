package com.kolee.chatapp.utils

import android.content.Context
import android.widget.Toast

enum class MessageType {
    TEXT,
    IMAGE
}

const val FCM_SERVER_KEY = "AAAA9EPNqmc:APA91bG6-d6zFBdj9k6ASEMnSAP4Apk0BbWsUMMuRM74mPrvb9QP64cxzgrZwjSr6jY7mdrZcTIUaOtHGFmbKj_IQk0PG1wjdj5x2NiXeXceHGgEh241uxFOmrXJ1ah4aSO2wxw4sT88"
const val FCM_BASE_URL = "https://fcm.googleapis.com"    // retrofit2
const val FCM_CONTENT_TYPE = "application/json"

fun toast(context: Context, msg: String) {
    Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
}