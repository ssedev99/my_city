package com.example.mycity.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycity.R
import com.example.mycity.data.LocalCityDataProvider
import com.example.mycity.model.Category
import com.example.mycity.ui.theme.MyCityTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CategoryScreen(
    cityData: List<Category>,
    onClick: (Category) -> Unit
) {
    Scaffold(
        topBar = {
            ScreenAppBar(
                title = R.string.app_name,
                showBackButton = false,
                onBackButtonClick = {}
            )
        }
    ) { innerPadding ->
        CategoryList(
            categoryList = cityData,
            onClick = onClick,
            contentPadding = innerPadding,
            modifier = Modifier
                .padding(
                    top = dimensionResource(R.dimen.padding_medium),
                    start = dimensionResource(R.dimen.padding_medium),
                    end = dimensionResource(R.dimen.padding_medium)
                )
        )
    }
}


@Composable
private fun CategoryList(
    categoryList: List<Category>,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_medium)),
        modifier = modifier
    ) {
        items(categoryList, key = { category -> category.id }) { category ->
            CategoryListItem(
                category = category,
                onItemClick = onClick
            )
        }
    }
}


@SuppressLint("ResourceType")
@Composable
private fun CategoryListItem(
    category: Category,
    onItemClick: (Category) -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        onClick = { onItemClick(category) },
        modifier = modifier
    ) {
        Row {
            Image(
                painter = painterResource(category.categoryImage),
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(R.dimen.card_image_height))
            )
            Box(
                modifier = Modifier
                    .height(dimensionResource(R.dimen.card_image_height))
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = category.categoryName,
                    style = MaterialTheme.typography.titleMedium,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    textAlign = TextAlign.Center
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryListItemPreview() {
    MyCityTheme {
        CategoryListItem(
            category = LocalCityDataProvider.defaultCategory,
            modifier = Modifier.fillMaxWidth(),
            onItemClick = {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryScreenPreview() {
    MyCityTheme {
//        CategoryScreen()
    }
}