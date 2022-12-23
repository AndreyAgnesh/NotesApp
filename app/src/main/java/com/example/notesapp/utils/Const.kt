package com.example.notesapp.utils

import com.example.notesapp.database.DatabaseRepository
import com.example.notesapp.database.room.dao.repository.RoomRepository

const val TYPE_DATA_BASE = "type_database"
const val TYPE_ROOM = "type_room"
const val TYPE_FIREBASE = "type_firebase"

lateinit var REPOSYTORY: DatabaseRepository