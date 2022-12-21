package com.example.salonvender.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.salonvender.fragment.DayFragment
import com.example.salonvender.fragment.HomeFragment
import com.example.salonvender.fragment.MonthFragment
import com.example.salonvender.fragment.YearFragment
import java.time.Month
import java.time.Year

class View_Pager_Adapter(fragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

       return when(position){

            0-> DayFragment()
            1-> MonthFragment()
            2-> YearFragment()

            else-> Fragment()
        }
    }
}