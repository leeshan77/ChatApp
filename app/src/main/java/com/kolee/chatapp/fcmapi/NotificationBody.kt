package com.kolee.chatapp.fcmapi

data class NotificationBody(
    val to: String,
    val data: NotificationData,
    val priority: String
) {
    data class NotificationData(
        val title: String,
        val message: String,
        val fromUserUid: String,
        val timeStamp: Long
    )
}
