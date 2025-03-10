package com.example.mycity.ui

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.mycity.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScreenAppBar(
    @StringRes title: Int,
    showBackButton: Boolean,
    onBackButtonClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = {
            Text(stringResource(title))
        },
        modifier = modifier,
        navigationIcon = {
            if (showBackButton){
                IconButton(onClick = onBackButtonClick) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.app_bar_back)
                    )
                }
            }
        }
    )
}
