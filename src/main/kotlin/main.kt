fun main() {
    var attachmentsArray = emptyArray<Attachments>()
    val photo = Attachments.PhotoAttachment(Photo())
    val video = Attachments.VideoAttachment(Video())
    attachmentsArray += photo
    attachmentsArray += video

    val service = WallService()
    service.add(
        Post(
            id = 256,
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

    service.createComment(Comment(), 4)

}


class WallService {
    private var posts = emptyArray<Post>()
    private var currentPostId = 1
    var comments = emptyArray<Comment>()
    var complaintComments = emptyArray<Comment>()


    fun findPostId(postId: Int): Boolean {
        for (post in posts) {
            if (post.id == postId) {
                return true
            }
        }
        return false
    }

    fun findCommentById(commentId: Int): Boolean {
        for (comment in comments) {
            if (comment.id == commentId) {
                return true
            }
        }
        return false
    }

    fun createComment(comment: Comment, postId: Int) {
        if (!findPostId(postId)) {
            throw PostNotFoundException()
        } else comments += comment
    }

    fun add(post: Post): Post {
        posts += post
        post.id = currentPostId
        currentPostId++
        return posts.last()
    }

    fun update(postUpd: Post): Boolean {
        for (post in posts) {
            if (postUpd.id == post.id) {
                post.copy(ownerId = postUpd.ownerId, date = postUpd.date)
                return true
            }
        }
        return false
    }

    fun reportComment(comment: Comment, reason: Int) {
        if (!findCommentById(comment.id)) {
            throw CommentNotFoundException()
        } else if (reason < 0 || reason > 8 || reason == 7) {
            throw ReasonNotFoundException()
        } else complaintComments += comment
    }
}