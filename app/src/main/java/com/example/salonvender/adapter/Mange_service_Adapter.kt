package com.example.salonvender.adapter

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.salonvender.Data_Class.Home_data.Category

import com.example.salonvender.R
import com.example.salonvender.databinding.ManageServicesItemsBinding
import com.example.salonvender.model.Manage_service_model

class Mange_service_Adapter(val context: Context, val list: List<Category>) :
    RecyclerView.Adapter<Mange_service_Adapter.ViewHOlder>() {




    inner class ViewHOlder(var binding: ManageServicesItemsBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHOlder {
        var binding:ManageServicesItemsBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.manage_services_items,parent,false)
        return ViewHOlder(binding)
    }

    override fun onBindViewHolder(holder: ViewHOlder, position: Int) {
        var category = list[position]
//        holder.binding.kaichi.setImageResource(list[position].image)
        val serviceIcon = Uri.parse(category.image)
        val servicetext = Uri.parse(category.name)
        Glide.with(holder.itemView.context).load(serviceIcon).circleCrop().placeholder(R.drawable.ic_launcher_background).into(holder.binding.kaichi)
        holder.binding.kaichiText.text = servicetext.toString()





    }

    override fun getItemCount(): Int {
        return list.size
    }
}
