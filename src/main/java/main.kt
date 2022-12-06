import implementations.StatisticAnswerChooser
import implementations.database.DAO
import interfaces.AnswerChooser
import interfaces.DAOConnection

fun main() {
    val dao: DAOConnection = DAO()
    dao.openConnection("wordsdb.db")
    val answerChooser: AnswerChooser = StatisticAnswerChooser()
    println(answerChooser.getAnswer("запрос пользователя"))
}
