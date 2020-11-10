package home1

import home1.attachm.Attachment

data class Post(
        var id: Int = 0,
        val ownerId: Long = 0,
        val title: String = "",
        var text: String = "",
        val friendsOnly: Boolean = true,
        var comments: Comments = Comments(),
        var reposts: Reposts = Reposts(),
        val link: String = "",
        var likes: Int = 0,
        val views: Int = 1,
        val postType: String = "",
        val singerId: Int = 0,
        val canPimn: Boolean = true,
        val canEdit: Boolean = true,
        val canDelete: Boolean = true,
        val isPin: Boolean = true,
        val markedAsAds: Boolean = false,
        val isFavorite: Boolean = false,
        val postponedId: Int = 1,
        var attachment: Array<Attachment>
        )