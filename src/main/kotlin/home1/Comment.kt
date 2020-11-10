package home1

import home1.attachm.Attachment
import java.time.LocalDateTime

data class Comment (
    val id: Int = 100,
    val postID: Int = 1,
    val fromId: Int = 300,
    val date: LocalDateTime = LocalDateTime.now(),
    var text: String = "New comment",
    var attachment: Array<Attachment>,
    var count: Int = 3,
    var canPost: Boolean = true,
    var groupsCanPost: Boolean = false
)