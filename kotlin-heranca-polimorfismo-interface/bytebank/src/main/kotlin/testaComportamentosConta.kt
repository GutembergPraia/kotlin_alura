package main.kotlin

import Conta

fun testaComportamentosConta() {
    val contaAlex = ContaCorrente("Alex", 1000)
    contaAlex.deposita(200.0)


    val contaFran = ContaPoupanca("Fran", 1001)
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
    } else println("Falha na transferência")
}