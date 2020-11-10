package home1.note

class NoteNotFountException (
        id: Int
) : RuntimeException(
        "Note with id $id not found"
)