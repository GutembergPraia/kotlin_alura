package br.com.gutembergpraia.bytebank.model

abstract class Conta(
    val titular: Cliente,
    val numero: Int,
): Autenticavel by titular {
    var saldo = 0.0
        protected set

    companion object{
        var toral = 0
            private set
    }

    init {
        println("Criando conta")
        toral++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

}