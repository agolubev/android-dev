package com.udacity.shoestore.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeModelView() : ViewModel(){
    val _shoes = MutableLiveData<List<Shoe>>()
    val shoes: LiveData<List<Shoe>>
        get() = _shoes
    init{
        _shoes.value = listOf(
            Shoe("Afterburn", 10.0, "Scetchrs", "...", listOf()),
            Shoe("Moccasin", 10.0, "Merrel", "...", listOf()),
            Shoe("Breathable Sneakers", 10.0, "FiveStoresCity", "...", listOf())
        )
    }
}