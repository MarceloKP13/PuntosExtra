package com.example.calculadora.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.databinding.ItemRecyclerBinding
import com.example.myapplication.model.User

class UserViewHolder(layout: View):RecyclerView.ViewHolder(layout){

    val binding= ItemRecyclerBinding.bind(layout)


      fun holderUser(user: User){
        binding.name.text=user.name
        Glide.with(binding.imageView).load(user.image).into(binding.imageView)
    }
}