package br.com.gutembergpraia.bytebank.exception

class SaldoInsuficienteException(
        mensagem: String = "O saldo é insuficiente"
) : Exception(mensagem) {
}