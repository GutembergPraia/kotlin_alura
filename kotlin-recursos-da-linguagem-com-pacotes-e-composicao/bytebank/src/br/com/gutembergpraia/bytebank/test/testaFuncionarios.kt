package br.com.gutembergpraia.bytebank.test

import br.com.gutembergpraia.bytebank.model.CalculadoraBonificacao
import br.com.gutembergpraia.bytebank.model.Diretor
import br.com.gutembergpraia.bytebank.model.Gerente
import br.com.gutembergpraia.bytebank.model.Analista

fun testaFuncionarios() {
    val alex = Analista(
            nome = "Alex",
            cpf = "111.111.111-11",
            salario = 1000.0
    )
    println("nome: ${alex.nome}")
    println("cpf: ${alex.cpf}")
    println("salario: ${alex.salario}")
    println("bonificação: ${alex.bonificacao}")

    val katty = Gerente(
            nome = "Katty Nunes",
            cpf = "111.111.111-12",
            salario = 2000.0,
            senha = 123
    )
    println("nome: ${katty.nome}")
    println("cpf: ${katty.cpf}")
    println("salario: ${katty.salario}")
    println("bonificação: ${katty.bonificacao}")
    if (katty.autentica(123)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val gutem = Diretor(
            nome = "Gutemberg Praia",
            cpf = "111.111.111-13",
            salario = 4000.0,
            senha = 123,
            plr = 200.0
    )
    println("nome: ${gutem.nome}")
    println("cpf: ${gutem.cpf}")
    println("salario: ${gutem.salario}")
    println("bonificação: ${gutem.bonificacao}")
    println("plr: ${gutem.plr}")
    if (katty.autentica(123)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticação")
    }

    val maria = Analista(nome = "Maria", cpf = "111.111.111-14", salario = 3000.0)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(katty)
    calculadora.registra(gutem)
    calculadora.registra(maria)

    println("tatal de bonificacao: ${calculadora.total}")
}
