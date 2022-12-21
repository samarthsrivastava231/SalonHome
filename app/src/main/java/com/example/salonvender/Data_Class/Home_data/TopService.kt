package com.example.salonvender.Data_Class.Home_data

data class TopService(
    val category_id: String,
    val created_at: String,
    val deleted_at: Any,
    val discount_percent: Double,
    val gender: String,
    val id: Int,
    val image: String,
    val mrp: Int,
    val payable_amount: Int,
    val service_name: String,
    val status: Int,
    val updated_at: String,
    val vendor_id: String
)