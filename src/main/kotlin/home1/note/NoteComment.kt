package home1.note

import java.time.LocalDateTime

data class NoteComment (
        val id: Int = 0,
        val noteId: Int = 0,
        val message: String = "",
        val date: LocalDateTime = LocalDateTime.now()
)