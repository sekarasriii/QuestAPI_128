package com.example.questapi_128.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.questapi_128.viewmodel.EditViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.questapi_128.viewmodel.provider.PenyediaViewModel
import androidx.compose.material3.Scaffold
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import androidx.compose.foundation.layout.padding

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditSiswaScreen(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EditViewModel = viewModel(factory = PenyediaViewModel.Factory)
)