package home1

class AttachmentLink(
    override val id: Int,
    override val type: AttachmentType = AttachmentType.LINK,
    val url: String,
    val title: String,
    val caption: String?

) : Attachment {
}