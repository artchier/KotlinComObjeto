package br.digital.com.exemplo

fun main(){
    val cachorro = Cachorro("cachorro", "raça")
    val pessoa = Pessoa("nome", "sobrenome", 24)
    //pessoa.jantar()
    pessoa.passearComDog(cachorro)
}