package com.example.salonvender.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.example.salonvender.R
import com.example.salonvender.fragment.Create_your_Account
import com.example.salonvender.fragment.Fill_Profile
import com.example.salonvender.fragment.HomeFragment
import com.example.salonvender.fragment.LoginFragment


class HomeActivity : AppCompatActivity() {

    lateinit var binding: com.example.salonvender.databinding.ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        this.applicationContext.applicationContext

        val fgTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
        fgTransaction.add(R.id.container, Create_your_Account())
        fgTransaction.commit()

        val fragment =LoginFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment).commit()
        }

//       this.startActivity(Intent(this@HomeActivity, HomeActivity_dash::class.java))

    }
}

