package home1.note

class NoteCommetNotFountException (
        id: Int
) : RuntimeException(
    "Note comment with id $id not found"
)