package com.kolee.chatapp.viewmodels

import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging
import com.kolee.chatapp.fcmapi.NotificationBody
import com.kolee.chatapp.fcmapi.RetrofitInstance
import com.kolee.chattingapp.models.UserModel
import okhttp3.ResponseBody
import retrofit2.Response

class FirebaseRepository {


}