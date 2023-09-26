package com.akkobana.weatherapp.adapters.detailshourly

import androidx.recyclerview.widget.RecyclerView
import com.akkobana.domain.entities.detailshourly.HumidityDetailedEntity
import com.akkobana.wheatherapp.databinding.ItemDetailsHourlyBinding

class HumidityHourlyHolder(
    private val binding: ItemDetailsHourlyBinding
) : BaseHourlyHolder(binding) {
    fun bind(item: HumidityDetailedEntity) = with(binding) {
        tvHour.text = item.time
        tvUpper.text = item.humidityPercent
    }
}
