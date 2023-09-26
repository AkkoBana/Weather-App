package com.akkobana.weatherapp.adapters.detailshourly

import androidx.recyclerview.widget.RecyclerView
import com.akkobana.wheatherapp.databinding.ItemDetailsHourlyBinding

abstract class BaseHourlyHolder(
    private val binding: ItemDetailsHourlyBinding
): RecyclerView.ViewHolder(binding.root)