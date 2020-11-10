import main.kotlin.*

fun main(args : Array<String>) {

    //testaAutenticacao()

    val contaSalario = ContaSalario("gutem", 10001)
    val contaPoupanca = ContaPoupanca(titular = "julio", numero = 1002)
    contaSalario.deposita(1000.0)
    println("contaSalario ${contaSalario.saldo}")

}












