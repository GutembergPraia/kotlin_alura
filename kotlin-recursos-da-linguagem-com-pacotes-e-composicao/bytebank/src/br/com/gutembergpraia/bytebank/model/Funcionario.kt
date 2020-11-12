package br.com.gutembergpraia.bytebank.model

abstract class Funcionario(
        val nome: String,
        val cpf: String,
        val salario: Double,
) {
    abstract val bonificacao: Double

 /*

     Tem o mesmo efeito

    utilizando property
    open val bonificacao: Double
        get() {
            return salario * 0.1
        }
     ou

    utilizando função
    open fun getBonificacao(): Double {
        return salario * 0.1
    }


  */
}