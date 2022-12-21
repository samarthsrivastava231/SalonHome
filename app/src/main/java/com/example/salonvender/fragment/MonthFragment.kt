package com.example.salonvender.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.salonvender.R
import com.example.salonvender.databinding.FragmentHomeBinding
import com.example.salonvender.databinding.FragmentMonthBinding


class MonthFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentMonthBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_month, container, false)

        return binding.root
    }


}