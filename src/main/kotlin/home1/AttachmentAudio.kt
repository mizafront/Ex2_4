package home1

class AttachmentAudio (
override val id: Int,
override val type: AttachmentType = AttachmentType.AUDIO,
val artist: String,
val title: String,
val duration: Int,
val url: String,
val date: Int
) : Attachment {


}