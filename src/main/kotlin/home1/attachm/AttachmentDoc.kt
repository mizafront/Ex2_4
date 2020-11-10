package home1.attachm

import java.time.LocalDateTime

class AttachmentDoc(
    override val id: Int = 1,
    override val type: AttachmentType = AttachmentType.DOC,
    val title: String = "New World",
    val size: String = "",
    val url: String = "www.vk.com",
    val ext: String = "",
    val date: LocalDateTime = LocalDateTime.now(),
) : Attachment {

}