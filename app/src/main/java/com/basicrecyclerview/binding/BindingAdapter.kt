package com.basicrecyclerview.binding

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("resourceId")
fun loadImage(view: AppCompatImageView, id: Int = 0) {
    view.setImageResource(id)
}