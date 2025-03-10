package com.example.mycity.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mycity.R
import com.example.mycity.model.Place

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PlaceDetailScreen(
    place: Place,
    onBackButtonClick: () -> Unit,
) {
    Scaffold(
        topBar = {
            ScreenAppBar(
                title = R.string.place_detail,
                showBackButton = true,
                onBackButtonClick = onBackButtonClick,
            )
        }
    ) { innerPadding ->
        DetailScreen(
            place = place,
            contentPadding = innerPadding
        )
    }
}

@Composable
fun DetailScreen(
    place: Place,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    Column(
        modifier = modifier
            .padding(top = contentPadding.calculateTopPadding())
    ) {
        Image(
            painter = painterResource(R.drawable.place_detail),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .height(dimensionResource(R.dimen.place_image_height))
        )
        Text(
            text = place.description,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = dimensionResource(R.dimen.padding_medium),
                    start = dimensionResource(R.dimen.padding_small),
                    end = dimensionResource(R.dimen.padding_small),
                )
        )
    }
}

