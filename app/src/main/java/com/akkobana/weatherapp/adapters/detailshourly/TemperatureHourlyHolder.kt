package com.akkobana.weatherapp.adapters.detailshourly

import androidx.recyclerview.widget.RecyclerView
import com.akkobana.domain.entities.detailshourly.HumidityDetailedEntity
import com.akkobana.domain.entities.detailshourly.TemperatureDetailedEntity
import com.akkobana.wheatherapp.databinding.ItemDetailsHourlyBinding

class TemperatureHourlyHolder(
    private val binding: ItemDetailsHourlyBinding
): BaseHourlyHolder(binding) {
    fun bind(item: TemperatureDetailedEntity) = with(binding) {
        tvUpper.text = item.precipitationPercent
        tvLower.text = item.temperature
        tvHour.text = item.time
        //ivIcon.setImageResource(item.imageId!!)
    }
}