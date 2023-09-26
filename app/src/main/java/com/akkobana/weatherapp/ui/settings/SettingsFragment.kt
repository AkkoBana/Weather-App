package com.akkobana.weatherapp.ui.settings

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.akkobana.weatherapp.viewmodels.settings.SettingsViewModel
import com.akkobana.wheatherapp.databinding.FragmentSettingsBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingsFragment : Fragment() {
    private val binding by lazy { FragmentSettingsBinding.inflate(layoutInflater) }
    private val viewModel: SettingsViewModel by viewModels()

}