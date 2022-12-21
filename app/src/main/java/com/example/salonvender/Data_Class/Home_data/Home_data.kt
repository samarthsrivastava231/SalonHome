package com.example.salonvender.Data_Class.Home_data

data class Home_data(
    val banners: List<Banner>,
    val categories: List<Category>,
    val recent_appointment: List<Any>,
    val sales: Sales,
    val status: Boolean,
    val top_services: List<TopService>
)