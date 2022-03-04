package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

class Carro(
    identificador: String,
    val motor: Motor
) : Veiculo(identificador), Ligavel, Movimentavel {

    override fun requerCarta(): Boolean {
        return true
    }

    override fun moverPara(x: Int, y: Int) {
        super<Veiculo>.moverPara(x, y)
    }

    override fun toString(): String {
        return "Carro | $identificador | $dataDeAquisicao | $posicao"
    }


}