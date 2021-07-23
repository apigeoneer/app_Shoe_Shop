package com.gmail.apigeoneer.shoeshop.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gmail.apigeoneer.shoeshop.models.Shoe

class ShoeListViewModel: ViewModel() {

    private val shoes = mutableListOf<Shoe>()      // to be shared between fragments

    /**
     * from ShoeListFragment
     */
    // to observe the list of shoes added in the ShoeListFragment
    private var _shoeList = MutableLiveData<List<Shoe>>()
    val shoeList: LiveData<List<Shoe>>
        get() = _shoeList

    // to observe if a shoe has been added in the ShoeListFragment
    private var _isShoeAdded = MutableLiveData<Boolean>()
    val isShoeAdded: LiveData<Boolean>
        get() = _isShoeAdded

    fun addShoe(newShoe: Shoe) {
        shoes.add(newShoe)
        _isShoeAdded.value = true
        _shoeList.value = shoes
    }

    fun cancelAddingShoe() {
        shoes.clear()
    }

    // Factory not needed since our ViewModel has no constructor args
}