package br.com.gutembergpraia.bytebank.model


interface Transferivel {

    fun transfere(valor: Double, destino: Conta): Boolean

}