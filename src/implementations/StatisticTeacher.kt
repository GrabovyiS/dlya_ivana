package implementations

import interfaces.Teacher

/**
 * Класс, реализующий интерфейс обучения для статистического анализа.
 * При получении строки, которую программа сразу не смогла распознать, разбивает ее на отдельные слова, и ищет в БД
 * строку, совпадающую с данной не менее чем на заданный в thresholdValue процент. Затем все отличающиеся слова
 * добавляются в таблицу words как контекстные синонимы, чтобы в последствии использовать их для выбора ответа.
 */
class StatisticTeacher : Teacher {
    /**
     * пороговое значение
     */
    val thresholdValue: Double = 1.0
    override fun setThresholdValue(value: Double) {
        TODO("Not yet implemented")
    }
    override fun study(input: String): Boolean {
        TODO("Not yet implemented")
    }
}
