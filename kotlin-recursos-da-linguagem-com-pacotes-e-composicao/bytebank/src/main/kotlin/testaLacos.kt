package main.kotlin

fun testaLacos() {
    for (i in 1..5) {
        val titular = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 1.0
        // saldo = 100.0
        // saldo += 100

        println("titular $titular")
        println("numero da conta $numeroConta")
        println("saldo da conta $saldo")
    }
}