package br.com.gutembergpraia.bytebank.model

class CalculadoraBonificacao{

    var total:Double = 0.0
        private set

    fun registra(funcionario: Funcionario)
    {
        println("nome ${funcionario.nome}")
        this.total += funcionario.bonificacao
    }



/*
    modelo de any

    fun registra(funcionario: Any)
    {
        if(funcionario is Funcionario) {
            println("nome ${funcionario.nome}")
            this.total += funcionario.bonificacao
        }
    }
*/
}