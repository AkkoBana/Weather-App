package com.akkobana.weatherapp.ui.viewpagerui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.akkobana.weatherapp.adapters.detailshourly.DetailsHourlyAdapter
import com.akkobana.wheatherapp.databinding.FragmentDetailsHourlyBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsHourlyFragment(
    private val fragmentType: FragmentType
) : Fragment() {
    private val binding by lazy { FragmentDetailsHourlyBinding.inflate(layoutInflater) }
    private val adapter by lazy { DetailsHourlyAdapter(fragmentType, TODO("make enity")) }
    private val viewModel: DetailsHourlyViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //viewModel.
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    enum class FragmentType {
        TEMPERATURE, PRECIPITATION, HUMIDITY, WIND
    }
}