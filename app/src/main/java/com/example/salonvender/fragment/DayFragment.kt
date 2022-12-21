package com.example.salonvender.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.salonvender.R
import com.example.salonvender.databinding.FragmentDayBinding
import me.ithebk.barchart.BarChartModel


class DayFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentDayBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_day, container, false)


        binding.Barchart.barMaxValue = 100

        binding.Barchart.bar

        val barChartModel = BarChartModel()
        barChartModel.setBarValue(50);
        barChartModel.setBarColor(Color.parseColor("#9C27B0"));
        barChartModel.setBarTag(null); //You can set your own tag to bar model
        barChartModel.setBarText("50");



        return binding.root
    }


}