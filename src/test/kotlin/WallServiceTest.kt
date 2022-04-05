import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun add_check_id() {
        val newPost = Post(
            id = 0,
            ownerId = 15,
            fromId = 24,
            createdBy = 56,
            date = 89,
            text = "",
            replyOwnerId = 68,
            replyPostId = 78,
            friendsOnly = true,
            comments = "",
            copyright = "",
            likes = 73,
            reposts = 6,
            views = 55,
            postType = "",
            signerId = 123,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = false,
            postponedId = 54,
            postSource = null,
            geo = Geo("", "", null),
            copyHistory = null,
            attachments = null
        )
        val service = WallService()

        val unexpectedResult = 0
        assertNotEquals(unexpectedResult, service.add(newPost).id)
    }


    @Test
    fun updateExisting() {
        val service = WallService()
        service.add(
            Post(
                id = 1,
                ownerId = 15,
                fromId = 24,
                createdBy = 56,
                date = 89,
                text = "",
                replyOwnerId = 68,
                replyPostId = 78,
                friendsOnly = true,
                comments = "",
                copyright = "",
                likes = 73,
                reposts = 6,
                views = 55,
                postType = "",
                signerId = 123,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = false,
                postponedId = 54,
                postSource = null,
                geo = Geo("", "", null),
                copyHistory = null,
                attachments = null
            )
        )
        service.add(
            Post(
                id = 2,
                ownerId = 15,
                fromId = 24,
                createdBy = 56,
                date = 89,
                text = "",
                replyOwnerId = 68,
                replyPostId = 78,
                friendsOnly = true,
                comments = "",
                copyright = "",
                likes = 73,
                reposts = 6,
                views = 55,
                postType = "",
                signerId = 123,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = false,
                postponedId = 54,
                postSource = null,
                geo = Geo("", "", null),
                copyHistory = null,
                attachments = null
            )
        )
        service.add(
            Post(
                id = 3,
                ownerId = 15,
                fromId = 24,
                createdBy = 56,
                date = 89,
                text = "",
                replyOwnerId = 68,
                replyPostId = 78,
                friendsOnly = true,
                comments = "",
                copyright = "",
                likes = 73,
                reposts = 6,
                views = 55,
                postType = "",
                signerId = 123,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = false,
                postponedId = 54,
                postSource = null,
                geo = Geo("", "", null),
                copyHistory = null,
                attachments = null
            )
        )

        val update = Post(
            id = 1,
            ownerId = 26,
            fromId = 24,
            createdBy = 56,
            date = 66,
            text = "",
            replyOwnerId = 68,
            replyPostId = 78,
            friendsOnly = true,
            comments = "",
            copyright = "",
            likes = 73,
            reposts = 6,
            views = 55,
            postType = "",
            signerId = 123,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = false,
            postponedId = 54,
            postSource = null,
            geo = Geo("", "", null),
            copyHistory = null,
            attachments = null
        )

        val result = service.update(update)

        assertTrue(result)
    }

    @Test
    fun updateUnExisting() {

        val service = WallService()

        service.add(
            Post(
                id = 1,
                ownerId = 15,
                fromId = 24,
                createdBy = 56,
                date = 89,
                text = "",
                replyOwnerId = 68,
                replyPostId = 78,
                friendsOnly = true,
                comments = "",
                copyright = "",
                likes = 73,
                reposts = 6,
                views = 55,
                postType = "",
                signerId = 123,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = false,
                postponedId = 54,
                postSource = null,
                geo = Geo("", "", null),
                copyHistory = null,
                attachments = null
            )
        )
        service.add(
            Post(
                id = 2,
                ownerId = 15,
                fromId = 24,
                createdBy = 56,
                date = 89,
                text = "",
                replyOwnerId = 68,
                replyPostId = 78,
                friendsOnly = true,
                comments = "",
                copyright = "",
                likes = 73,
                reposts = 6,
                views = 55,
                postType = "",
                signerId = 123,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = false,
                postponedId = 54,
                postSource = null,
                geo = Geo("", "", null),
                copyHistory = null,
                attachments = null
            )
        )
        service.add(
            Post(
                id = 3,
                ownerId = 15,
                fromId = 24,
                createdBy = 56,
                date = 89,
                text = "",
                replyOwnerId = 68,
                replyPostId = 78,
                friendsOnly = true,
                comments = "",
                copyright = "",
                likes = 73,
                reposts = 6,
                views = 55,
                postType = "",
                signerId = 123,
                canPin = true,
                canDelete = true,
                canEdit = true,
                isPinned = false,
                markedAsAds = false,
                isFavorite = false,
                donut = false,
                postponedId = 54,
                postSource = null,
                geo = Geo("", "", null),
                copyHistory = null,
                attachments = null
            )
        )

        val update = Post(
            id = 4,
            ownerId = 26,
            fromId = 24,
            createdBy = 56,
            date = 66,
            text = "",
            replyOwnerId = 68,
            replyPostId = 78,
            friendsOnly = true,
            comments = "",
            copyright = "",
            likes = 73,
            reposts = 6,
            views = 55,
            postType = "",
            signerId = 123,
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = false,
            markedAsAds = false,
            isFavorite = false,
            donut = false,
            postponedId = 54,
            postSource = null,
            geo = Geo("", "", null),
            copyHistory = null,
            attachments = null
        )

        val result = service.update(update)

        assertFalse(result)
    }
}