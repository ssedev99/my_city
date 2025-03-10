package com.example.mycity.ui

import androidx.lifecycle.ViewModel
import com.example.mycity.data.LocalCityDataProvider
import com.example.mycity.model.Category
import com.example.mycity.model.Page
import com.example.mycity.model.Place
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CityViewModel : ViewModel() {
    private val defaultUiState: CityUiState by lazy {
        CityUiState(
            categoryList = LocalCityDataProvider.getCityData(),
            currentPage = Page.CATEGORY,
            currentCategory = LocalCityDataProvider.defaultCategory,
            currentPlace = LocalCityDataProvider.defaultPlace
        )
    }

    private val _uiState = MutableStateFlow(defaultUiState)
    val uiState: StateFlow<CityUiState> = _uiState.asStateFlow()

    fun updateCurrentCategory(category: Category) {
        _uiState.update {
            it.copy(currentCategory = category)
        }
    }

    fun updateCurrentPlace(place: Place) {
        _uiState.update {
            it.copy(currentPlace = place)
        }
    }
}