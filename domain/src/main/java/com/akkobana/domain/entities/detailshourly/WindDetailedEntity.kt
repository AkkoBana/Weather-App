package com.akkobana.domain.entities.detailshourly

import com.akkobana.domain.entities.DetailsHourlyEntity

class WindDetailedEntity(
    private val time: String,
    private val imageId: Int,
    private val windSpeed: String
): DetailsHourlyEntity()