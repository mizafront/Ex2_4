package home1

data class Comment (
    val id: Int = 100,
    val postID: Int = 1,
    val fromId: Int = 300,
    val date: String = "08.11.2000",
    var text: String = "New comment",
    var attachment: Array<Attachment>,
    var count: Int = 3,
    var canPost: Boolean = true,
    var groupsCanPost: Boolean = false
)