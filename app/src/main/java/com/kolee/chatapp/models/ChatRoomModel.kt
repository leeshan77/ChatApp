package com.kolee.chattingapp.models

data class ChatRoomModel(
    var roomUsers: MutableMap<String, Boolean> = mutableMapOf(),
    var chats: MutableMap<String, ChatModel> = mutableMapOf()
) {
    companion object {
        data class ChatModel(
            val fromUid: String = "",
            val message: String = "",
            val msgType: String = "",
            val timeStamp: Long = 0L,
            val readUsers: MutableMap<String, Boolean> = mutableMapOf()
        )
    }

}
