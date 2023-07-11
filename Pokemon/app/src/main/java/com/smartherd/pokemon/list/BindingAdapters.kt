package com.smartherd.pokemon.list

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("loadWithGlide")
fun loadWithGlide(imageView: ImageView, imageUrl: String){
    Glide.with(imageView.context)
        .load(imageUrl)
        .into(imageView)
}