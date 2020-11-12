package br.com.gutembergpraia.bytebank.test

import br.com.gutembergpraia.bytebank.model.Cliente
import br.com.gutembergpraia.bytebank.model.ContaPoupanca
import br.com.gutembergpraia.bytebank.model.ContaCorrente

fun testaCopiasEReferencias() {
    var joao = Cliente(
            nome = "joão",
            cpf = "333.333.333-33",
            senha = 1
    )
    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"
    var contaMaria = ContaPoupanca(Cliente(
            nome = "Maria",
            cpf = "444.444.444-44",
            senha = 2
    ), 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

}