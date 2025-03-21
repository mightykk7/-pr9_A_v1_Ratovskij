fun main() {
    // Создание объектов различных типов книг
    val book1 = Book("Гарри Поттер", "Ровлинг", "21.03.2002", 400, 200000)
    println(book1.InF())
    println(book1.getDiscountedPrice(10))
    println(book1.isBestSeller())
    println()
    val eBook1 = EBook("Властелин Колец", "Толкин", "15.09.1954", 500, 100000, "PDF", 15.5)
    println(eBook1.InF())
    println(eBook1.getFormattedFileSize())
    println(eBook1.getDownloadTime(10.0))
    println(eBook1.isLargeFile())
    println()
    val audioBook1 = AudioBook("1984", "Оруэлл", "08.06.1949", 300, 50000, 12.3)
    println(audioBook1.InF())
    println(audioBook1.getListeningTimePerDay(3))
    println(audioBook1.getPlaybackSpeed(1.5))
    println(audioBook1.isShortAudioBook())
}