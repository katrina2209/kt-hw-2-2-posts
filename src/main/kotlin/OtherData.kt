data class Geo(
    val type: String, // тип места;
    val coordinates: String, //  координаты места;
    val place: Place?, //описание места (если оно добавлено)
)

data class Place(
    val id: Int, // Идентификатор места
    val title: String, // Название места
    val latitude: Int, // Географическая широта, заданная в градусах (от -90 до 90).
    val longitude: Int, // Географическая широта, заданная в градусах (от -90 до 90).
    val created: Int, // Дата создания места в Unixtime.
    val icon: String, // Иконка места, URL изображения.
    val checkins: Int, // Число отметок в этом месте.
    val updated: Int, // Дата обновления места в Unixtime.
    val type: Int, // Тип места.
    val country: Int, // Идентификатор страны.
    val city: Int, // Идентификатор города.
    val address: String // Адрес места.
)

data class PostSource(
    val type: String, // Тип источника. Возможные значения:
//vk — запись создана через основной интерфейс сайта https://vk.com/;
//widget — запись создана через виджет на стороннем сайте;
//api — запись создана приложением через API;
//rss — запись создана посредством импорта RSS-ленты со стороннего сайта;
//sms — запись создана посредством отправки SMS-сообщения на специальный номер.
    val platform: String, // Название платформы, если оно доступно. Возможные значения: android; iphone; wphone
    val data: String, //Тип действия (только для type = vk или widget). Возможные значения:
//profile_activity — изменение статуса под именем пользователя (для type = vk);
//profile_photo — изменение профильной фотографии пользователя (для type = vk);
//comments — виджет комментариев (для type = widget);
//like — виджет «Мне нравится» (для type = widget);
//poll — виджет опросов (для type = widget).
    val url: String, // URL ресурса, с которого была опубликована запись.
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