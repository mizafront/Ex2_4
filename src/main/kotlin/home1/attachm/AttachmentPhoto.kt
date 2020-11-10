package home1.attachm

import java.time.LocalDateTime

class AttachmentPhoto(
    override val id: Int = 100,
    override val type: AttachmentType = AttachmentType.PHOTO,
    val text: String = "Photo1",
    val date: LocalDateTime = LocalDateTime.now(),

    ) : Attachment {
}