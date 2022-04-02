data class Comment(
    val id: Int = 0, // Идентификатор комментария.
    val fromId: Int = 0, // Идентификатор автора комментария.
    val date: Int = 0, // Дата создания комментария в формате Unixtime.
    val text: String = "", // Текст комментария.
    val donut: Boolean = false, // Информация о VK Donut. Объект со следующими полями:
//is_don (boolean) — является ли комментатор подписчиком VK Donut.
//placeholder (string) — заглушка для пользователей, которые не оформили подписку VK Donut.
    val replyToUser: Int = 0, // Идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо).
    val replyToComment: Int = 0, // Идентификатор комментария, в ответ на который оставлен текущий (если применимо).
    val attachments: Array<Attachments>? = null, //object Медиавложения комментария (фотографии, ссылки и т.п.). Описание массива attachments находится на отдельной странице.
    val parentsStack: IntArray? = null, // array Массив идентификаторов родительских комментариев.
    val thread: String = "", // :Thread // Информация о вложенной ветке комментариев
)

//data class Thread (
//val count: Int = 0, //  количество комментариев в ветке.
//val items: Array<Comment>? = null, // (array) — массив объектов комментариев к записи (только для метода wall.getComments).
//val canPost: Boolean = false, //  (boolean) – может ли текущий пользователь оставлять комментарии в этой ветке.
//val showReplyButton: Boolean = false, //  (boolean) – нужно ли отображать кнопку «ответить» в ветке.
//val groupsCanPost: Boolean = false, //  (boolean) – могут ли сообщества оставлять комментарии в ветке.
//)