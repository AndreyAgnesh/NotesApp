package com.example.notesapp.utils

import com.example.notesapp.database.DatabaseRepository

const val TYPE_DATA_BASE = "type_database"
const val TYPE_ROOM = "type_room"
const val TYPE_FIREBASE = "type_firebase"

lateinit var REPOSITORY: DatabaseRepository

object Constants {

    object Keys {
        const val NOTE_DATABASE = "notes_database"
        const val NOTE_TABLE = "notes_table"
        const val ADD_NEW_NOTE = "Add new note"
        const val NOTE_TITLE = "Note title"
        const val NOTE_SUBTITLE = "Note subtitle"
        const val NOTE_NOTE = "Add note"
        const val TITLE = "title"
        const val SUBTITLE = "subtitle"
        const val WHAT_DATABASE_USE = "Что хотите использовать?"
        const val ROOM_DATABASE = "Room"
        const val FIREBASE_DATABASE = "Firebase"
        const val ID_NOTE = "id"
        const val NONE = "none"
        const val UPDATE = "UPDATE"
        const val DELETE = "DELETE"
        const val NAV_BACK = "BACK"
        const val EDIT_NOTE = "Edit note"
        const val EMPTY = ""
        const val UPDATE_NOTE = "UPDATE NOTE"

    }

    object Screens {
        const val START_SCREEN= "start_screen"
        const val MAIN_SCREEN= "main_screen"
        const val ADD_SCREEN= "add_screen"
        const val NOTE_SCREEN = "note_screen"
    }


}