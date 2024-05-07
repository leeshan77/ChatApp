package com.kolee.chatapp.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.kolee.chatapp.fcmapi.NotificationBody
import kotlinx.coroutines.launch

class FirebaseViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: FirebaseRepository = FirebaseRepository()


}