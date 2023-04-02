package com.manuelduarte077.cleanarchitecturenoteapp.feature_note.domain.use_case

import AddNote
import DeleteNote
import GetNote

data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote,
)
