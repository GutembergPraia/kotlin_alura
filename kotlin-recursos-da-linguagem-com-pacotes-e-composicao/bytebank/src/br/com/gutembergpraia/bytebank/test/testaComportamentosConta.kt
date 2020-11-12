package br.com.gutembergpraia.bytebank.test

import br.com.gutembergpraia.bytebank.model.Cliente
import br.com.gutembergpraia.bytebank.model.ContaPoupanca
import br.com.gutembergpraia.bytebank.model.ContaCorrente

fun testaComportamentosConta() {

    var alex = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1)
    val contaAlex = ContaCorrente(alex, 1000)
    contaAlex.deposita(200.0)

    var fran = Cliente(nome = "Fran", cpf =  "222.222.222-22", senha = 2)
    val contaFran = ContaPoupanca(fran, 1001)
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