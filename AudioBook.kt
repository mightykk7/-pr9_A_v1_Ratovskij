class AudioBook(name: String, editor: String, date: String, volume: Int, quality: Int, var duration: Double  ) : Book(name, editor, date, volume, quality) {
    override fun InF(): String {
        val baseInfo = super.InF()
        return "$baseInfo" +
                " Длительность воспроизведения: $duration часов"
    }
    //Метод для расчета времени прослушивания в день.
    fun getListeningTimePerDay(days: Int): String {
        if (days <= 0) return "Количество дней должно быть больше 0."
        val hoursPerDay = duration / days
        return "Чтобы прослушать книгу за $days дней, нужно слушать по $hoursPerDay часа в день."
    }
}