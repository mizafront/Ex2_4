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
        id = 1,
        comments = firstComments,
        reposts = firstReposts,
        attachment = firstAttach
    )

    @Test
    fun add() {
        var testParam = true
        WallService.add(firstPost)
        if (firstPost.id == 0) testParam = false
        assertEquals(true, testParam)
    }

    @Test
    fun updateTrue() {
        WallService.add(firstPost)
        assertEquals(true, WallService.update(firstPost))
    }

    @Test
    fun updateFalse() {
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
        assertEquals(false, WallService.update(secondPost))
    }
}
