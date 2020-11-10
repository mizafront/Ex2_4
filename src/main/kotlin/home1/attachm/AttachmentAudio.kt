package home1.attachm

import java.time.LocalDateTime

class AttachmentAudio (
    override val id: Int,
    override val type: AttachmentType = AttachmentType.AUDIO,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
    val date: LocalDateTime = LocalDateTime.now(),
) : Attachment {


}