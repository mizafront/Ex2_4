package home1

import home1.attachm.AttachmentDoc
import home1.attachm.AttachmentVideo

fun main() {
    val wallservice = WallService ()
    val firstComments = Comments ()
    val firstReposts = Reposts ()
    val firstVideo = AttachmentVideo (player = null)
    val firstDoc = AttachmentDoc (title = "Новый день")
    val firstAttach = arrayOf(firstVideo, firstDoc)

    val firstPost = Post (
        comments = firstComments,
        reposts = firstReposts,
        attachment = firstAttach
    )

    println(firstPost)
    wallservice.add(firstPost)
    println(wallservice.update(firstPost))
    println(firstPost)

    /* val comment = Comment (postID = 1, attachment = firstAttach)
    wallservice.createComment(comment)
    println(comment) */



}