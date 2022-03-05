package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.models.*
import java.util.*


fun main() {
    val motor = Motor(20,200)
    val date = Date()
    val veiculo = Veiculo("yes")
    val veiculo1 = Veiculo("yews")
    val carro = Carro("gd",motor)
    val pessoa = Pessoa("ex",date)
    val bike = Bicicleta("kek")
    pessoa.comprarVeiculo(veiculo)
    pessoa.comprarVeiculo(veiculo1)
    veiculo.moverPara(0,1)
    println(pessoa.pesquisarVeiculo("yes"))

    println(carro)
    println(bike)
    println(pessoa)
}

// EXCEPCOES - MenorDeIdadeException | PessoaSemCartaException
// TROCAR FORMATO DE DATA
