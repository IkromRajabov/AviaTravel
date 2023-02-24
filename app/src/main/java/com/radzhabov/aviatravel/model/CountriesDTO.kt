package com.radzhabov.aviatravel.model

data class CountriesDTO(
    val countries: List<CountryDTO>
)

data class CountryDTO(
    val code: String,
    val code3: String,
    val name: String
)