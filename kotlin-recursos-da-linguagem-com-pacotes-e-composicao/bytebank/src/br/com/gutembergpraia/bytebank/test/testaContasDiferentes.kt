package br.com.gutembergpraia.bytebank.test

import br.com.gutembergpraia.bytebank.model.Cliente
import br.com.gutembergpraia.bytebank.model.ContaPoupanca
import br.com.gutembergpraia.bytebank.model.ContaCorrente
import br.com.gutembergpraia.bytebank.model.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
            titular = Cliente(
                    nome = "Alex",
                    cpf = "111.111.111-11",
                    senha = 1,
                    endereco = Endereco(
                            logradouro = "Rua Vergueiro",
                            numero = 227
                    )
            ),
            numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
            titular = Cliente(
                    nome = "Fran",
                    cpf = "222.222.222-22",
                    senha = 2
            ),
            numero = 1001
    )
    println("titular")
    println("nome do titular: ${contaCorrente.titular.nome}")
    println("cpf do titular:${contaCorrente.titular.cpf}")
    println("endereco titular:${contaCorrente.titular.endereco.logradouro}")

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