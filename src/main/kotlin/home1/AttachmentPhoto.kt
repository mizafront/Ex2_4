package home1

class AttachmentPhoto(
    override val id: Int = 100,
    override val type: AttachmentType = AttachmentType.PHOTO,
    val text: String = "Photo1",
    val date: Int = 0

) : Attachment {
}