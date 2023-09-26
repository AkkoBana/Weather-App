package com.akkobana.weatherapp.adapters.pager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.akkobana.weatherapp.ui.viewpagerui.DetailsHourlyFragment

class PagerAdapter(
    private val fragment: Fragment
) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> DetailsHourlyFragment(DetailsHourlyFragment.FragmentType.REVIEW_WEATHER)
            1 -> DetailsHourlyFragment(DetailsHourlyFragment.FragmentType.PRECIPITATION)
            2 -> DetailsHourlyFragment(DetailsHourlyFragment.FragmentType.HUMIDITY)
            else -> DetailsHourlyFragment(DetailsHourlyFragment.FragmentType.WIND)
        }
    }
}