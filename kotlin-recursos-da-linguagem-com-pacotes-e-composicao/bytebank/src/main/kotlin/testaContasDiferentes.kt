package main.kotlin

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
            titular = "Alex",
            numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
            titular = "Fran",
            numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente : ${contaCorrente.saldo}")
    println("saldo após saque poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupanca : ${contaCorrente.saldo}")
    println("saldo poupanca após receber tranferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo poupanca após transferir para poupanca : ${contaPoupanca.saldo}")
    println("saldo corrente após receber tranferencia: ${contaCorrente.saldo}")
}