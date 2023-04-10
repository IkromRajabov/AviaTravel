package com.radzhabov.aviatravel.data.dto

data class CitiesDTO(
    val cities: List<CityDTO>
)

data class CityDTO(
    val city_code: String,
    val country_code: String,
    val lat: Double,
    val lng: Double,
    val name: String
)
