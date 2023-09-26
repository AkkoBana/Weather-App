package com.akkobana.weatherapp.adapters.detailshourly

import androidx.recyclerview.widget.RecyclerView
import com.akkobana.domain.entities.DetailsHourlyEntity
import com.akkobana.domain.entities.detailshourly.HumidityDetailedEntity
import com.akkobana.domain.entities.detailshourly.WindDetailedEntity
import com.akkobana.wheatherapp.databinding.ItemDetailsHourlyBinding

class WindHourlyHolder (
    private val binding: ItemDetailsHourlyBinding
): BaseHourlyHolder(binding) {
    fun bind(item: WindDetailedEntity) = with(binding) {
        // TODO("write bind")
    }
}
