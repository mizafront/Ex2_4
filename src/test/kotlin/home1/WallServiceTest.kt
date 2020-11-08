package home1

import org.junit.Test

import org.junit.Assert.*

internal class WallServiceTest {
    val firstComments = Comments (
            canPost = false
    )
    val firstReposts = Reposts ()
    val firstVideo = AttachmentVideo (player = null)
    val firstDoc = AttachmentDoc (title = "Новый день")
    val firstAttach = arrayOf(firstVideo, firstDoc)

    val firstPost = Post (
        comments = firstComments,
        reposts = firstReposts,
        attachment = firstAttach
    )

    @Test
    fun add() {
        val wallservice = WallService()
        var testParam = true
        wallservice.add(firstPost)
        if (firstPost.id == 0) testParam = false
        assertEquals(true, testParam)
    }

    @Test
    fun updateTrue() {
        val wallservice = WallService()
        wallservice.add(firstPost)
        assertEquals(true, wallservice.update(firstPost))
    }

    @Test
    fun updateFalse() {
        val wallservice = WallService()
        val firstComments = Comments (
                canPost = true
        )
        val firstReposts = Reposts ()

        val secondPost = Post(
                id = 1,
                comments = firstComments,
                reposts = firstReposts,
                attachment = firstAttach
        )
        assertEquals(false, wallservice.update(secondPost))
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrowTrue() {
        val wallservice = WallService ()
        var comment = Comment (postID = 1, attachment = firstAttach)
        wallservice.createComment(comment)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrowFalse() {
        val wallservice = WallService ()
        var comment = Comment (postID = 3, attachment = firstAttach)
        wallservice.createComment(comment)
    }
}
