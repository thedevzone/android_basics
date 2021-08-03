package com.basicrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.basicrecyclerview.R
import com.basicrecyclerview.model.Dummy
import com.basicrecyclerview.model.Message
import kotlinx.android.synthetic.main.item_layout.view.*
import kotlinx.android.synthetic.main.item_receiver.view.*
import kotlinx.android.synthetic.main.item_sender.view.*

class ChatAdapter(private val list: ArrayList<Message>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    inner class SenderHolder(v: View) : RecyclerView.ViewHolder(v)
    inner class ReceiverHolder(v: View) : RecyclerView.ViewHolder(v)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == 0)
            SenderHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_sender, parent, false)
            )
        else
            ReceiverHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_receiver, parent, false)
            )
    }

    override fun getItemViewType(position: Int): Int {
        return if (list[position].isSender) 0 else 1
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = list[position]
        if (holder is SenderHolder){
            holder.itemView.apply {
                textViewSenderMessage.text = item.msg
                textViewSenderTime.text = item.time
            }
        }else{
            holder.itemView.apply {
                textViewReceiverMessage.text = item.msg
                textViewReceiverTime.text = item.time
            }
        }
    }

    override fun getItemCount(): Int = list.size
}