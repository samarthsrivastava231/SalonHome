package com.example.salonvender.activity

import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.salonvender.R
import com.example.salonvender.databinding.ActivityHomeDashBinding
import com.example.salonvender.fragment.AccountFragment
import com.example.salonvender.fragment.AppointmentFragment
import com.example.salonvender.fragment.HomeFragment
import com.example.salonvender.fragment.SalesFragment


class HomeActivity_dash : AppCompatActivity() {

    lateinit var binding: ActivityHomeDashBinding

    val homeFragment = HomeFragment()
    val appointmentFragment = AppointmentFragment()
    val salesFragment = SalesFragment()
    val accountFragment = AccountFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home_dash)


        /* val view: View = getWindow().getDecorView()
         var flags: Int = view.getSystemUiVisibility()
         flags = flags and View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR.inv()
         view.setSystemUiVisibility(flags)
         getWindow().setStatusBarColor(Color.parseColor("#7A000066"))*/


        actionBar?.title = Html.fromHtml("<font color='#FFFFFF'>ActionBar-title </font>")


        //val mainFragment = HomeFragment()

        loadFragment(homeFragment)

        binding.bottomNegivation.setOnItemSelectedListener { item ->
            when (item.itemId) {

                R.id.Appointment -> loadFragment(appointmentFragment)
                R.id.sales -> loadFragment(salesFragment)
                R.id.account -> loadFragment(accountFragment)
                R.id.home -> loadFragment(homeFragment)


            }
            true
        }


    }

    private fun loadFragment(fragment: Fragment) {

        val backStateName = fragment.javaClass.name
        val fragmentTag = backStateName
        val manager: FragmentManager = supportFragmentManager
        val fragmentPopped = manager.popBackStackImmediate(backStateName, 1)
        if (!fragmentPopped && manager.findFragmentByTag(fragmentTag) == null) {
            //fragment not in back stack, create it.
            val ft = manager.beginTransaction()
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.replace(binding.container.id, fragment, fragmentTag)
            ft.commit()
        }
    }

}