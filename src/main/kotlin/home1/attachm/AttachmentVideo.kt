package home1.attachm

import java.time.LocalDateTime

class AttachmentVideo(
    override val id: Int = 1,
    override val type: AttachmentType = AttachmentType.VIDEO,
    val title: String = "Video",
    val description: String = "HD VIDEO",
    val duration: Int = 600,
    val player: String?,
    val date: LocalDateTime = LocalDateTime.now(),
) : Attachment {

}