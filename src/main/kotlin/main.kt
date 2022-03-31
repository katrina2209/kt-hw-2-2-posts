fun main() {
}


class WallService {
    private var posts = emptyArray<Post>()
    private var currentPostId = 1

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
}