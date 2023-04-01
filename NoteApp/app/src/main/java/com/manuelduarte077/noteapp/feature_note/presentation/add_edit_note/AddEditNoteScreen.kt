package com.manuelduarte077.noteapp.feature_note.presentation.add_edit_note

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun AddEditNoteScreen(
    navController: NavController,
    noteColor: Int,
    viewModel: AddEditNoteViewModel = hiltViewModel()
    ) {
}