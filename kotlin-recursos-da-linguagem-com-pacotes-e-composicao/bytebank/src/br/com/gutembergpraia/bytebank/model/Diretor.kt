package br.com.gutembergpraia.bytebank.model

class Diretor(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int,
        val plr:Double

): FuncionarioAdmin(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
){

    override val bonificacao: Double
        get() {
            return salario + plr
        }
/*
  não e mais necessario pos e o brigatorio a implementação de autentica
    override fun autentica(senha: Int): Boolean{
        return  super<FuncionarioAdmin>.autentica(senha)
    }
*/
}