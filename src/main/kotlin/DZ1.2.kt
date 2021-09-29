fun main() {
    while (true) {
        println("Введите сумму перевода в рублях")
        val a = 100
        val b = 0.75
        var amaun1 = readLine()
        var amaunt2: Int = amaun1!!.toInt()
        var amaunt = amaunt2 * a
        println("Вы хотите перевести $amaun1 рублей. В копейках это будет $amaunt копеек.")
        var comr = amaunt / a * b // расчёт комиссии
        if (comr / a < 35) {
            println("Комиссия составит 3500 копеек.")
        } else {
            println("Комиссия составит $comr копеек.")
        }
        println("")
        println("")
        println("Другой перевод - ENTER. Завершить - введите q и ENTER.")
        var prov = readLine()
        if (prov == "q") break
    }
}