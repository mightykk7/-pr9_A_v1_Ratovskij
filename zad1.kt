fun main(){
    // Создание объектов различных типов книг
    val book1 = Book("Гарри Поттер", "Ровлинг", "21.03.2002", 400, 200000)
    println(book1.InF())
    println()
    val eBook1 = EBook("Властелин Колец", "Толкин", "15.09.1954", 500, 100000, "PDF", 15.5)
    println(eBook1.InF())
    println(eBook1.getFormattedFileSize()) // Дополнительный метод для EBook
    println()
    val audioBook1 = AudioBook("1984", "Оруэлл", "08.06.1949", 300, 50000, 12.3)
    println(audioBook1.InF())
    println(audioBook1.getListeningTimePerDay(3)) // Дополнительный метод для AudioBook
}