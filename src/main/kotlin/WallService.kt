class WallService {
    private var posts = emptyArray<Post>()
    private var currentPostId = 1

    fun add(post: Post): Post {
        val newPost = post.copy(id = currentPostId)
        posts += newPost
        currentPostId++
        return posts.last()
    }

    fun update(postUpd: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (postUpd.id == post.id) {
                posts [index] = postUpd.copy(ownerId = post.ownerId, date = post.date)

                return true
            }
        }
        return false
    }
}
