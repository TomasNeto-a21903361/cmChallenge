package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.models.*
import java.util.*


fun main() {
    val motor = Motor(20,200)
    val posicao = Posicao()
    val date = Date()
    val veiculo = Veiculo("yes",posicao,date)
    val carro = Carro("gd",motor)
    val pessoa = Pessoa("ex",date)
    val bike = Bicicleta("kek")
    veiculo.moverPara(0,1)

    println(carro)
    println(bike)
    println(pessoa)
    print(AlterarPosicaoException("lmao"))
}

// EXCEPCOES - MenorDeIdadeException | PessoaSemCartaException
// TROCAR FORMATO DE DATA
