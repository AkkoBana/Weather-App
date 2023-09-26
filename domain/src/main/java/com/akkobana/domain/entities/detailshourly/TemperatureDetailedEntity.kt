package com.akkobana.domain.entities.detailshourly

import com.akkobana.domain.entities.DetailsHourlyEntity

data class TemperatureDetailedEntity(
    val time: String,
    val imageId: Int? = null,
    val temperature: String,
    val precipitationPercent: String
): DetailsHourlyEntity()