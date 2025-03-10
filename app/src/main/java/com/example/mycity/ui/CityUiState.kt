package com.example.mycity.ui

import com.example.mycity.model.Category
import com.example.mycity.model.Page
import com.example.mycity.model.Place

data class CityUiState(
    val categoryList: List<Category>,
    val currentPage: Page,
    val currentCategory: Category,
    val currentPlace: Place,
)