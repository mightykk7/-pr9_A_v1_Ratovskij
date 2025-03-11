class EBook(name: String, editor: String, date: String, volume: Int, quality: Int, var format: String, var fileSize: Double) : Book(name, editor, date, volume, quality) {
    override fun InF(): String {
        val baseInfo = super.InF()
        return "$baseInfo" +
                " Формат файла: $format" +
                " Размер файла: $fileSize МБ"
    }
    //Метод для получения размера файла.
    fun getFormattedFileSize(): String {
        return when {
            fileSize < 1 -> "${(fileSize * 1024).toInt()} КБ"
            fileSize < 1024 -> "$fileSize МБ"
            else -> "${(fileSize / 1024).toInt()} ГБ"
        }
    }
}