package com.kolee.chatapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kolee.chatapp.databinding.FragmentChatLogBinding


class ChatLogFragment : BaseFragment<FragmentChatLogBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentChatLogBinding {
        return FragmentChatLogBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onResume() {
        super.onResume()


    }

    override fun onPause() {
        super.onPause()

    }

    override fun onBackPressed() {

    }

}