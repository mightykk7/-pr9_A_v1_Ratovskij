// Класс электронной книги
class EBook(name: String, editor: String, date: String, volume: Int, quality: Int, var format: String, var fileSize: Double) : Book(name, editor, date, volume, quality) {
    override fun InF(): String {
        val baseInfo = super.InF()
        return "$baseInfo" +
                " Формат файла: $format" +
                " Размер файла: $fileSize МБ"
    }
    // Метод для получения размера файла
    fun getFormattedFileSize(): String {
        return when {
            fileSize < 1 -> "${(fileSize * 1024).toInt()} КБ"
            fileSize < 1024 -> "$fileSize МБ"
            else -> "${(fileSize / 1024).toInt()} ГБ"
        }
    }
    // Метод для расчета времени скачивания файла
    fun getDownloadTime(speed: Double): String {
        val downloadTime = fileSize / speed
        return "Время скачивания файла на скорости $speed МБ/с: $downloadTime секунд"
    }
    // Метод для проверки является ли файл большим
    fun isLargeFile(): String {
        return if (fileSize > 50) "Файл книги '$name' большой и занимает больше 50 МБ." else "Файл книги '$name' небольшой."
    }
}