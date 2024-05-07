package com.kolee.chatapp.fcmapi

import com.kolee.chatapp.utils.FCM_CONTENT_TYPE
import com.kolee.chatapp.utils.FCM_SERVER_KEY
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface FcmInterface {

    @Headers("Authorization: key=$FCM_SERVER_KEY", "Content-type:$FCM_CONTENT_TYPE")
    @POST("fcm/send")
    suspend fun sendNotification(
        @Body notification: NotificationBody
    ): Response<ResponseBody>
}