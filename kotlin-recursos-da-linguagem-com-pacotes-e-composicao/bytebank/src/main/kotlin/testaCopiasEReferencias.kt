package main.kotlin

fun testaCopiasEReferencias() {

    val contaJoao = ContaCorrente("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = ContaPoupanca("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"
}