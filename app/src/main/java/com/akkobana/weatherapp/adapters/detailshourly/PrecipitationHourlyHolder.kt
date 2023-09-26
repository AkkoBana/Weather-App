package com.akkobana.weatherapp.adapters.detailshourly

import androidx.recyclerview.widget.RecyclerView
import com.akkobana.domain.entities.detailshourly.HumidityDetailedEntity
import com.akkobana.domain.entities.detailshourly.PrecipitationDetailedEntity
import com.akkobana.wheatherapp.databinding.ItemDetailsHourlyBinding

class PrecipitationHourlyHolder(
    private val binding: ItemDetailsHourlyBinding
): BaseHourlyHolder(binding) {
    fun bind(item: PrecipitationDetailedEntity) = with(binding) {
        // TODO("write bind")
    }
}