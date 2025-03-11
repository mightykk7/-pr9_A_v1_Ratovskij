// Базовый класс для всех типов книг
open class Book (var name: String = "",var editor: String = "",var date: String = "",var volume: Int = 0, var quality: Int){
    // Вывод нформации о книге
    open fun InF(): String{
        var price = 0
        if (quality < 100000){
            price = 2 * volume
        }
        else{
            price = 3 * volume
        }
        return "Название книги: $name" +
                " Автор книги: $editor" +
                " Дата издания: $date" +
                " Объём в листах - $volume страниц" +
                " Количество книг: $quality" +
                " Цена книги: $price рублей"
    }
}