package com.drawiin.feature_training.training.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.drawiin.utils.exercises

@ExperimentalMaterialApi
@Composable
fun TrainingDetailsScreen(goToExerciseDetail: () -> Unit) {
    Scaffold(

    ) {
        Column(Modifier.fillMaxSize().padding(it).padding(horizontal = 16.dp)) {
            LazyColumn() {
                items(exercises) { e ->
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
    }
}
