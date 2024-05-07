package com.kolee.chatapp

import android.os.Bundle
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
import com.kolee.chatapp.adapters.FriendListRecyclerAdapter
import com.kolee.chatapp.databinding.FragmentFriendListBinding
import com.kolee.chatapp.utils.toast
import com.kolee.chatapp.viewmodels.FirebaseViewModel
import com.kolee.chattingapp.models.ChatRoomModel

class FriendListFragment : BaseFragment<FragmentFriendListBinding>() {


    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentFriendListBinding {
        return FragmentFriendListBinding.inflate(inflater, container, false)
    }

    override fun onBackPressed() {

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


}