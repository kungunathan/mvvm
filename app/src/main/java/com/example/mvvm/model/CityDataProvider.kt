package com.example.mvvm.model

import com.example.mvvm.R


class CityDataProvider {
    private val cities = arrayListOf<City>()

    init {
        cities.add(City("Bangkok", R.drawable.bangkok, 10_000_000))
        cities.add(City("Beijing", R.drawable.beijing, 21_500_000))
        cities.add(City("London", R.drawable.london, 21_500_000))
        cities.add(City("Newyork", R.drawable.newyork, 21_500_000))
        cities.add(City("Paris", R.drawable.paris, 21_500_000))
        cities.add(City("Rio", R.drawable.rio, 21_500_000))
        cities.add(City("Rome", R.drawable.rome, 21_500_000))
        cities.add(City("Singapore", R.drawable.singapore, 21_500_000))
        cities.add(City("Sydney", R.drawable.sydney, 21_500_000))
        cities.add(City("Tokyo", R.drawable.tokyo, 21_500_000))
    }

    fun getCities() = cities
}