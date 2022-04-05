sealed class Attachments(val type: String) {
data class PhotoAttachment(val photo: Photo) : Attachments("Photo")
data class VideoAttachment(val video: Video) : Attachments("Video")
data class FileAttachment(val file: File) : Attachments("File")
data class AudioAttachment(val audio: Audio) : Attachments("Audio")
data class LinkAttachment(val link: Link) : Attachments("Link")
}
data class Photo(
    val id: Int = 0, // Идентификатор фотографии.
    val albumId: Int = 0, // Идентификатор альбома, в котором находится фотография.
    val ownerId: Int = 0, // Идентификатор владельца фотографии.
    val userId: Int = 0, // Идентификатор пользователя, загрузившего фото (если фотография размещена в сообществе). Для фотографий, размещенных от имени сообщества, user_id = 100.
    val text: String = "", // Текст описания фотографии.
    val date: Int = 0, // Дата добавления в формате Unixtime.
    val width: Int = 0, // Ширина оригинала фотографии в пикселах.
    val height: Int = 0, // Высота оригинала фотографии в пикселах.
)

data class Video(
    val id: Int = 0, // Идентификатор видеозаписи.
    val ownerId: Int = 0, // Идентификатор владельца видеозаписи.
    val title: String = "", // Название видеозаписи.
    val description: String = "", // Текст описания видеозаписи.
    val duration: Int = 0 // Длительность ролика в секундах.
)

data class File(
    val id: Int = 0, // Идентификатор файла.
    val ownerId: Int = 0, // Идентификатор пользователя, загрузившего файл.
    val title: String = "", // Название файла.
    val size: Int = 0, // Размер файла в байтах.
    val ext: String = "", // Расширение файла.
    val url: String = "", // Адрес файла, по которому его можно загрузить.
    val date: Int = 0, // Дата добавления в формате Unixtime.
    val type: Int = 0 // Тип файла.  Возможные значения: 1 — текстовые документы; 2 — архивы; 3 — gif; 4 — изображения;
// 5 — аудио; 6 — видео; 7 — электронные книги; 8 — неизвестно.
)

data class Audio(
    val id: Int = 0, // Идентификатор аудиозаписи.
    val ownerId: Int = 0, // Идентификатор владельца аудиозаписи.
    val artist: String = "", // Исполнитель.
    val title: String = "", // Название композиции.
    val duration: Int = 0, // Длительность аудиозаписи в секундах.
    val url: String = "", // Ссылка на mp3.
    val lyricsId: Int = 0, // Идентификатор текста аудиозаписи (если доступно).
    val albumId: Int = 0, // Идентификатор альбома, в котором находится аудиозапись (если присвоен).
    val genreId: Int = 0, // Идентификатор жанра из списка аудио жанров.
    val date: Int = 0, // Дата добавления.
    val noSearch: Boolean = false, // включена опция «Не выводить при поиске». Если опция отключена, поле не возвращается.
    val isHq: Boolean = false //  если аудио в высоком качестве.
)

data class Link(
    val url: String = "", // URL ссылки.
    val title: String = "", // Заголовок ссылки.
    val caption: String = "", // Подпись ссылки (если имеется).
    val description: String = "", // Описание ссылки.
    val previewPage: String = "", // Идентификатор вики-страницы с контентом для предпросмотра содержимого страницы. Возвращается в формате "owner_id_page_id".
    val previewUrl: String = "", // URL страницы с контентом для предпросмотра содержимого страницы.
)