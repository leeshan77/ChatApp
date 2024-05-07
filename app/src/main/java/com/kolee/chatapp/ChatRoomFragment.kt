package com.kolee.chatapp


import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.PowerManager
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.kolee.chatapp.adapters.ChatRoomRecyclerAdapter
import com.kolee.chatapp.databinding.FragmentChatRoomBinding
import com.kolee.chatapp.viewmodels.FirebaseViewModel
import com.kolee.chattingapp.models.ChatRoomModel
import com.kolee.chattingapp.models.UserModel
import java.util.*


class ChatRoomFragment : BaseFragment<FragmentChatRoomBinding>() {


    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentChatRoomBinding {
        return FragmentChatRoomBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onResume() {
        super.onResume()

    }

    override fun onBackPressed() {
        activity?.finish()
    }


}