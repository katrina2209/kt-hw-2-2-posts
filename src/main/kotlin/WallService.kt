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
        val newPost = post.copy(id = currentPostId)
        posts += newPost
        currentPostId++
        return posts.last()
    }

    fun update(postUpd: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (postUpd.id == post.id) {
                posts[index] = postUpd.copy(ownerId = post.ownerId, date = post.date)

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
