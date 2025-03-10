package com.example.mycity.model

import androidx.annotation.DrawableRes

data class Category(
    val id:Int,
    val categoryName: String,
    @DrawableRes val categoryImage: Int,
    val placeList: List<Place>
)