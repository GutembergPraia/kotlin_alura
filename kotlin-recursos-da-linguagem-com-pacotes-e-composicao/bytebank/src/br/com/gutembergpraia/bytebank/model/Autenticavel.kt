package br.com.gutembergpraia.bytebank.model

interface Autenticavel {

    fun autentica(senha:Int):Boolean
/*
removido pois senha e um dado sensílvel e seus acesso não pode ser publico com a interface obriga

    val senha: Int

    fun autentica(senha: Int): Boolean {
        println("autentica")
        return this.senha == senha
    }

 */
}