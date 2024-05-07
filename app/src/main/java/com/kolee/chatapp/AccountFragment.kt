package com.kolee.chatapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import coil.load
import coil.transform.CircleCropTransformation
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import com.kolee.chatapp.activities.MainActivity
import com.kolee.chatapp.databinding.FragmentAccountBinding
import com.kolee.chatapp.utils.ENDLESS_ALARM
import com.kolee.chatapp.utils.getBoolean
import com.kolee.chatapp.utils.putBoolean
import com.kolee.chatapp.utils.toast
import com.kolee.chattingapp.models.UserModel
import com.theartofdev.edmodo.cropper.CropImage
import com.theartofdev.edmodo.cropper.CropImageView


@Suppress("DEPRECATION")
class AccountFragment : BaseFragment<FragmentAccountBinding>() {


    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentAccountBinding {
        return FragmentAccountBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onBackPressed() {
    }

}