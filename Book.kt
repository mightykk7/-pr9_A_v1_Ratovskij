// Базовый класс для всех типов книг
open class Book(var name: String = "", var editor: String = "", var date: String = "", var volume: Int = 0, var quality: Int = 0) {
    // Вывод информации о книге
    open fun InF(): String {
        var price = 0
        if (quality < 100000) {
            price = 2 * volume
        } else {
            price = 3 * volume
        }
        return "Название книги: $name" +
                " Автор книги: $editor" +
                " Дата издания: $date" +
                " Объём в листах - $volume страниц" +
                " Количество книг: $quality" +
                " Цена книги: $price рублей"
    }
    // Метод для расчета цены со скидкой
    fun getDiscountedPrice(discount: Int): String {
        var price = 0
        if (quality < 100000) {
            price = 2 * volume
        } else {
            price = 3 * volume
        }
        val discountedPrice = price - (price * discount / 100)
        return "Цена со скидкой $discount%: $discountedPrice рублей"
    }
    // Метод для проверки является ли книга бестселлером
    fun isBestSeller(): String {
        return if (quality > 500000) "Книга '$name' является бестселлером!" else "Книга '$name' не является бестселлером."
    }
}