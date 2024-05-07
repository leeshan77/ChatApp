package com.kolee.chattingapp.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserModel(
    var userName: String = "",
    var userUid: String = "",
    var userImageUri: String? = "",
    var pushToken: String? = ""
) : Parcelable

    // constructor no need in Kotlin
    // through Parcelize data class can be sent to another activity and fragment at once
