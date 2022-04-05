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

    @Test(expected = PostNotFoundException::class)
    fun create_comment_should_throw() {
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
        service.createComment(Comment(), 96)
    }

    @Test
    fun create_comment_should_create() {
        val service = WallService()
        val commentsSizeBefore = service.comments.size
        val comment = Comment()
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
        service.createComment(comment, 1)
        val commentsSizeAfter = service.comments.size
        assertTrue(commentsSizeAfter == commentsSizeBefore + 1)
    }

    @Test(expected = CommentNotFoundException::class)
    fun report_comment_should_throw_CommentNotFoundException() {
        val service = WallService ()
        service.comments += Comment (id = 25)
        service.reportComment(Comment(id = 12), 2)
    }

    @Test(expected = ReasonNotFoundException::class)
    fun report_comment_should_throw_ReasonNotFoundException() {
        val service = WallService ()
        service.comments += Comment (id = 25)
        service.reportComment(Comment(id = 25), 22)
    }
    @Test(expected = ReasonNotFoundException::class)
    fun report_comment_should_throw_ReasonNotFoundException2() {
        val service = WallService ()
        service.comments += Comment (id = 25)
        service.reportComment(Comment(id = 25), -9)
    }
    @Test(expected = ReasonNotFoundException::class)
    fun report_comment_should_throw_ReasonNotFoundException3() {
        val service = WallService ()
        service.comments += Comment (id = 25)
        service.reportComment(Comment(id = 25), 7)
    }

    @Test
    fun report_comment_should_report() {
        val service = WallService()
        val commentsSizeBefore = service.complaintComments.size
        service.comments += Comment(id = 25)
        service.reportComment(Comment(id = 25), 5)
        val commentsSizeAfter = service.complaintComments.size
        assertTrue(commentsSizeAfter == commentsSizeBefore + 1)
    }
}