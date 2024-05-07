package com.kolee.chatapp.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.kolee.chatapp.ChatRoomFragment
import com.kolee.chatapp.R
import com.kolee.chatapp.databinding.ItemChatRoomBinding
import com.kolee.chattingapp.models.ChatRoomModel
import com.kolee.chattingapp.models.UserModel
import java.util.*

class ChatRoomRecyclerAdapter : RecyclerView.Adapter<ChatRoomRecyclerAdapter.CustomHolder>() {

    private var chatRoomList = mutableListOf<ChatRoomModel>()
    private var chatRoomKeyList = mutableListOf<String>()

    private lateinit var mContext: Context

    var onItemClickListener: ((String) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
        mContext = parent.context
        val inflater = LayoutInflater.from(mContext)
        val binding = ItemChatRoomBinding.inflate(inflater, parent, false)
        return CustomHolder(binding)
    }

    override fun getItemCount(): Int = chatRoomList.size

    override fun onBindViewHolder(holder: CustomHolder, position: Int) {
        holder.bind(chatRoomList[position], position)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(chatRooms: List<ChatRoomModel>, chatRoomKeys: List<String>) {
        chatRoomList.clear()
        chatRoomKeyList.clear()
        chatRoomList.addAll(chatRooms)
        chatRoomKeyList.addAll(chatRoomKeys)
        notifyDataSetChanged()
    }

    inner class CustomHolder(private val binding: ItemChatRoomBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(chatRoom: ChatRoomModel, position: Int) {
            binding.apply {

            }
        }
    }

}