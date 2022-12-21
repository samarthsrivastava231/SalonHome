package com.example.salonvender.adapter

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.salonvender.Data_Class.Home_data.TopService
import com.example.salonvender.R

import com.example.salonvender.databinding.TopServicesItemBinding

import com.example.salonvender.model.Top_service_Model

class Top_service_Adapter(var context: Context, var list: List<TopService>) :
    RecyclerView.Adapter<Top_service_Adapter.ViewHolder>() {


    inner class ViewHolder(var binding: TopServicesItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding: TopServicesItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.top_services_item, parent, false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var topService = list[position]
//    val image1 = Uri.parse(topService.image)
//        Glide.with(holder.itemView.context).load(image1).placeholder(R.drawable.ic_launcher_background).into(holder.binding.image)
//        val image = Uri.parse(topService.image!!.toString())
        val text = Uri.parse(topService.service_name)

       // Glide.with(holder.itemView.context).load(image).placeholder(R.drawable.ic_launcher_background).into(holder.binding.image)

        holder.binding.text.text = text.toString()

    }


    override fun getItemCount(): Int {
        return list.size
    }
}
