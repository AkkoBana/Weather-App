package com.akkobana.domain.entities.detailshourly

import com.akkobana.domain.entities.DetailsHourlyEntity

class PrecipitationDetailedEntity(
    private val time: String,
    private val imageId: Int,
    private val precipitationPercent: String
): DetailsHourlyEntity()