package pt.ulusofona.cm.kotlin.challenge

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.models.*
import java.util.*


fun main() {
    val motor = Motor(20,200)
    val veiculo = Veiculo("yes")
    val carro = Carro("gd",motor)
    val pessoa = Pessoa("ex",Date())
    val bike = Bicicleta("kek")


    println(motor.estaLigado())
    motor.ligar()



}

// EXCEPCOES - MenorDeIdadeException | PessoaSemCartaException
// TROCAR FORMATO DE DATA
