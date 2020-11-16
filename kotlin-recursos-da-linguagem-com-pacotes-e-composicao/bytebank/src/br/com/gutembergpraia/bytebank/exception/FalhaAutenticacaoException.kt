package br.com.gutembergpraia.bytebank.exception

class FalhaAutenticacaoException (
        mensagem: String = "Falha na autenticação"
) : Exception(mensagem){
}