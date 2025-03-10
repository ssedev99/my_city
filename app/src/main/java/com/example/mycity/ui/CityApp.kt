package com.example.mycity.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycity.model.Page

@Composable
fun CityApp() {
    val navController: NavHostController = rememberNavController()
    val viewModel: CityViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    NavHost(
        navController = navController,
        startDestination = Page.CATEGORY.route
    ) {
        composable(Page.CATEGORY.route) {
            CategoryScreen(
                cityData = uiState.categoryList,
                onClick = {
                    viewModel.updateCurrentCategory(it)
                    navController.navigate(Page.PLACE.route)
                }
            )
        }
        composable(Page.PLACE.route) {
            PlaceScreen(
                placeList = uiState.currentCategory.placeList,
                onClick = {
                    viewModel.updateCurrentPlace(it)
                    navController.navigate(Page.PLACE_DETAIL.route)
                },
                onBackButtonClick = {
                    navController.popBackStack()
                }
            )
        }
        composable(Page.PLACE_DETAIL.route) {
            PlaceDetailScreen(
                place = uiState.currentPlace,
                onBackButtonClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}