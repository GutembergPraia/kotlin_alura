package br.com.gutembergpraia.bytebank

import br.com.gutembergpraia.bytebank.model.Endereco


fun main(args : Array<String>) {
    val endereco = Endereco(
            logradouro = "Rua vergueiro",
            complemento = "Alura",
            cep = "000000-000"
    )
    val enderecoNovo = Endereco(
            logradouro = "Rua vergueiro",
            complemento = "Alura",
            cep = "000000-000"
    )

    println(endereco.equals(endereco))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)

    println("${endereco.javaClass}@${
        Integer.toHexString(endereco.hashCode())
    }")

    println("${enderecoNovo.javaClass}@${
        Integer.toHexString(enderecoNovo.hashCode())
    }")
}















