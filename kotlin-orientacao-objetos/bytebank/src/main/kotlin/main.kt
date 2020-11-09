fun main() {
    println("Bem vindo ao bytebank")
    val contaAlex = Conta("Alex", 1000)
    contaAlex.deposita(200.0)


    val contaFran = Conta("Fran", 1001)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)


    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Falha na transferência")

    if (contaFran.transfere(destino = contaAlex, valor = 300.1)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println("Transferência sucedida")

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

}

class Conta(
    var titular: String,
    var numero: Int,
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (valor <= this.saldo) {
            this.saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }
}


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


fun testaCondicoes(saldo: Double) {
    when {
        saldo > 0.0 -> println("conta é positiva")
        saldo == 0.0 -> println("conta é neutra")
        else -> println("conta é negativa")
    }
}