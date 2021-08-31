package br.com.alura.bytebank

import br.com.alura.bytebank.modelo.Endereco

fun main() {

    var enderecoNullable: Endereco? = null
    val endereco: Endereco = Endereco(logradouro = "Rua Ita", cep = "25946595")
   enderecoNullable = endereco


    enderecoNullable?.let { endereco ->
        println(endereco.cep)
    }
    println(endereco.logradouro)
}
