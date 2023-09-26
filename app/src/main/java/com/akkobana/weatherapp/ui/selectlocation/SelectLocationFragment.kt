package com.akkobana.weatherapp.ui.selectlocation

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.akkobana.wheatherapp.databinding.FragmentSelectLocationBinding
import com.akkobana.weatherapp.viewmodels.selectlocation.SelectLocationViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SelectLocationFragment : Fragment() {
    private val binding by lazy { FragmentSelectLocationBinding.inflate(layoutInflater) }
    private val viewModel: SelectLocationViewModel by viewModels()
}