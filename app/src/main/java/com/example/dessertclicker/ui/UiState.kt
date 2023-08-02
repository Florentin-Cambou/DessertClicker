package com.example.dessertclicker.ui

data class UiState(
    val revenue: Int = 0,
    val dessertsSold: Int = 0,
    val currentDessertIndex: Int = 0,
    val currentDessertPrice: Int = 0,
    val currentDessertImageId: Int = 0


)


/*
var revenue by rememberSaveable { mutableStateOf(0) }
var dessertsSold by rememberSaveable { mutableStateOf(0) }

val currentDessertIndex by rememberSaveable { mutableStateOf(0) }

var currentDessertPrice by rememberSaveable {
    mutableStateOf(desserts[currentDessertIndex].price)
}
var currentDessertImageId by rememberSaveable {
    mutableStateOf(desserts[currentDessertIndex].imageId)
}*/
