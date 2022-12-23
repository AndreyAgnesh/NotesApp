package com.example.notesapp.database.room.dao.repository

import androidx.lifecycle.LiveData
import com.example.notesapp.database.DatabaseRepository
import com.example.notesapp.database.room.dao.NoteRoomDao
import com.example.notesapp.model.Note

class RoomRepository(private val noteRoomDao: NoteRoomDao): DatabaseRepository {
    override val readAll: LiveData<List<Note>>
        get() = noteRoomDao.getAllNotes()

    override suspend fun create(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.addNote(note = note)
    }

    override suspend fun update(note: Note, onSuccess: () -> Unit) {
        noteRoomDao.updateNote(note = note)
    }

    override suspend fun delete(note: Note, onSeccess: () -> Unit) {
        noteRoomDao.deleteNote(note = note)
    }
}