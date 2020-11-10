package main.kotlin

class Gerente(
        nome: String,
        cpf: String,
        salario: Double,
        senha: Int

): FuncionarioAdmin(
        nome = nome,
        cpf = cpf,
        salario = salario,
        senha = senha
){

    override val bonificacao: Double
        get() {
            return salario
        }
/*
Não e mais necessario pos a interface não implementa a função autentica
    override fun autentica(senha: Int): Boolean {
        return super<Autenticavel>.autentica(senha)
    }
*/
}