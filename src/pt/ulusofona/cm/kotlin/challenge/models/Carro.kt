package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Carro(
    private val _identificador: String,
    val motor: Motor
) : Veiculo(_identificador), Ligavel, Movimentavel {

    override fun requerCarta(): Boolean {
        return true
    }

    override fun moverPara(x: Int, y: Int) {
        if (posicao.x != x || posicao.y != y){
            posicao.x  = x
            posicao.y  = y
        }
        else{
            throw AlterarPosicaoException()
        }
    }

    override fun ligar() {
        motor.ligar()
    }

    override fun desligar() {
       motor.desligar()
    }

    override fun estaLigado(): Boolean {
        return motor.ligado
    }

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao"
    }


}