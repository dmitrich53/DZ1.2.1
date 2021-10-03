fun main() {
    while (true) {
        println("Введите сумму перевода в рублях")
        val kopeckInRubles = 100
        val commissionPercent = 0.75
        val amount = readLine()?.toIntOrNull() ?: 0
        val amountKopeck = amount * kopeckInRubles
        println("Вы хотите перевести $amount рублей. В копейках это будет $amountKopeck копеек.")
        val commission = amount / kopeckInRubles * commissionPercent // расчёт комиссии
        if (amountKopeck / kopeckInRubles < 35) {
            println("Комиссия составит 3500 копеек.")
        } else {
            println("Комиссия составит $commission копеек.")
        }
        println("")
        println("")
        println("Другой перевод - ENTER. Завершить - введите q и ENTER.")
        if (readLine() == "q") break
    }
}