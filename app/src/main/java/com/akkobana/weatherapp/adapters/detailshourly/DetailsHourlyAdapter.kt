package com.akkobana.weatherapp.adapters.detailshourly

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.akkobana.domain.entities.DetailsHourlyEntity
import com.akkobana.domain.entities.detailshourly.HumidityDetailedEntity
import com.akkobana.domain.entities.detailshourly.PrecipitationDetailedEntity
import com.akkobana.domain.entities.detailshourly.TemperatureDetailedEntity
import com.akkobana.domain.entities.detailshourly.WindDetailedEntity
import com.akkobana.weatherapp.ui.viewpagerui.DetailsHourlyFragment
import com.akkobana.wheatherapp.databinding.ItemDetailsHourlyBinding

class DetailsHourlyAdapter(
    private val fragmentType: DetailsHourlyFragment.FragmentType,
    private val detailsHourlyEntities: List<DetailsHourlyEntity>
) : RecyclerView.Adapter<BaseHourlyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseHourlyHolder {
        val inflate = ItemDetailsHourlyBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return when (fragmentType) {
            DetailsHourlyFragment.FragmentType.HUMIDITY -> HumidityHourlyHolder(inflate)
            DetailsHourlyFragment.FragmentType.TEMPERATURE -> TemperatureHourlyHolder(inflate)
            DetailsHourlyFragment.FragmentType.PRECIPITATION -> PrecipitationHourlyHolder(inflate)
            DetailsHourlyFragment.FragmentType.WIND -> WindHourlyHolder(inflate)
        }
    }

    override fun getItemCount(): Int = detailsHourlyEntities.size

    override fun onBindViewHolder(holder: BaseHourlyHolder, position: Int) {
        when (fragmentType) {
            DetailsHourlyFragment.FragmentType.HUMIDITY ->
                (holder as HumidityHourlyHolder).bind(detailsHourlyEntities[position] as HumidityDetailedEntity)

            DetailsHourlyFragment.FragmentType.TEMPERATURE ->
                (holder as TemperatureHourlyHolder).bind(detailsHourlyEntities[position] as TemperatureDetailedEntity)

            DetailsHourlyFragment.FragmentType.PRECIPITATION ->
                (holder as PrecipitationHourlyHolder).bind(detailsHourlyEntities[position] as PrecipitationDetailedEntity)

            DetailsHourlyFragment.FragmentType.WIND ->
                (holder as WindHourlyHolder).bind(detailsHourlyEntities[position] as WindDetailedEntity)
        }
    }
}