package com.akkobana.domain.entities.detailshourly

import com.akkobana.domain.entities.DetailsHourlyEntity

data class HumidityDetailedEntity(
    val time: String,
   // private val imageId: Int, TODO("График")
    val humidityPercent: String
): DetailsHourlyEntity()