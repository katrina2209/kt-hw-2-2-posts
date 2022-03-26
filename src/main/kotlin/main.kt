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

data class Post(
    var id: Int, // Идентификатор записи
    val ownerId: Int, // Идентификатор владельца стены, на которой размещена запись
    val fromId: Int, // Идентификатор автора записи (от чьего имени опубликована запись)
    val createdBy: Int, // Идентификатор администратора, который опубликовал запись
    // (возвращается только для сообществ при запросе с ключом доступа администратора).
    // Возвращается в записях, опубликованных менее 24 часов назад.
    val date: Int, // Время публикации записи в формате unixtime
    val text: String, // Текст записи.
    val replyOwnerId: Int, // Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    val replyPostId: Int, // Идентификатор записи, в ответ на которую была оставлена текущая.
    val friendsOnly: Boolean, //  true, если запись была создана с опцией «Только для друзей»
    val comments: String, // Comments, // Информация о комментариях к записи, объект с полями
    val copyright: String, // Copyright, // Источник материала, объект с полями
    val likes: Int, // Likes, // Информация о лайках к записи, объект с полями
    val reposts: Int, // Reposts, // Информация о репостах записи («Рассказать друзьям»), объект с полями
    val views: Int, // Views, // Информация о просмотрах записи. Объект с единственным полем
    val postType: String, // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    val signerId: Int, // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    val canPin: Boolean, // Информация о том, может ли текущий пользователь закрепить запись
    val canDelete: Boolean, // Информация о том, может ли текущий пользователь удалить запись
    val canEdit: Boolean, // Информация о том, может ли текущий пользователь редактировать запись
    val isPinned: Boolean, // Информация о том, что запись закреплена
    val markedAsAds: Boolean, // Информация о том, содержит ли запись отметку «реклама»
    val isFavorite: Boolean, // true, если объект добавлен в закладки у текущего пользователя
    val donut: Boolean, // Donut, // Информация о записи VK Donut
    val postponedId: Int // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
)

//data class Comments(
//    val count: Int, // количество комментариев;
//    val canPost: Boolean, // информация о том, может ли текущий пользователь комментировать запись
//    val groupsCanPost: Boolean, // информация о том, могут ли сообщества комментировать запись
//    val canClose: Boolean, // может ли текущий пользователь закрыть комментарии к записи
//    val canOpen: Boolean // может ли текущий пользователь открыть комментарии к записи.
//)
//
//data class Copyright(
//    val id: Int,
//    val link: String,
//    val name: String,
//    val type: String
//)
//
//data class Likes(
//    val count: Int, // число пользователей, которым понравилась запись
//    val userLikes: Boolean, // наличие отметки «Мне нравится» от текущего пользователя
//    val canLike: Boolean, // информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
//    val canPublish: Boolean, // информация о том, может ли текущий пользователь сделать репост записи
//)
//
//data class Reposts(
//    val count: Int, // число пользователей, скопировавших запись
//    val userReposted: Boolean // наличие репоста от текущего пользователя
//)
//
//data class Views(
//    val count: Int // число просмотров записи
//)
//
//data class Donut(
//    val isDonut: Boolean, // запись доступна только платным подписчикам VK Donut
//    val paidDuration: Int, // время, в течение которого запись будет доступна только платным подписчикам VK Donut
//    val placeholder: Placeholder, // заглушка для пользователей, которые не оформили подписку VK Donut.
//// Отображается вместо содержимого записи.
//    val canPublishFreeCopy: Boolean, // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
//    val editMode: String // информация о том, какие значения VK Donut можно изменить в записи.
//// Возможные значения:all — всю информацию о VK Donut. duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.
//)
//
//class Placeholder