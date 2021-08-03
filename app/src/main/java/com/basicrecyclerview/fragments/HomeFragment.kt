package com.basicrecyclerview.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.basicrecyclerview.HomeActivity
import com.basicrecyclerview.R
import com.basicrecyclerview.adapter.ChatAdapter
import com.basicrecyclerview.model.Message
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private val list = ArrayList<Message>().apply {
        add(Message("Hello","11:37 PM",true))
        add(Message("Hii","11:38 PM"))
        add(Message("How are you?","11:39 PM",true))
        add(Message("Fine and you?","11:40 PM"))
        add(Message("fine too.","11:41 PM",true))
        add(Message("what are you doing?","11:42 PM"))
        add(Message("well i am just coding.","11:43 PM",true))
        add(Message("great mee too. which technology?","11:44 PM"))
        add(Message("Android. you?","11:45 PM",true))
        add(Message("Flutter!","11:46 PM"))
        add(Message("Great!","11:47 PM",true))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewChat.adapter = ChatAdapter(list)
    }
}