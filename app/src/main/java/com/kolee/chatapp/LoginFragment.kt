package com.kolee.chatapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.kolee.chatapp.databinding.FragmentLoginBinding
import com.kolee.chatapp.utils.USER_EMAIL
import com.kolee.chatapp.utils.USER_PWD
import com.kolee.chatapp.utils.getString
import com.kolee.chatapp.utils.putString


class LoginFragment : BaseFragment<FragmentLoginBinding>() {

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLoginBinding {
        return FragmentLoginBinding.inflate(inflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


    override fun onBackPressed() {
        //
    }


}