package main.kotlin

import Conta


interface Transferivel {

    fun transfere(valor: Double, destino: Conta): Boolean

}