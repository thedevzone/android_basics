package com.basicrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.basicrecyclerview.R
import com.basicrecyclerview.model.User
import kotlinx.android.synthetic.main.item_layout.view.*

class DummyAdapter(private val list:ArrayList<User>):RecyclerView.Adapter<DummyAdapter.ViewHolder>() {

    inner class ViewHolder(v:View):RecyclerView.ViewHolder(v)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        with(holder.itemView){
            imageView.setImageResource(item.image)
            textView.text = item.name
        }
    }

    override fun getItemCount(): Int = list.size
}