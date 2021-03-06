package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel

data class Bicicleta(
     private val _identificador: String
) : Veiculo(_identificador), Movimentavel {
    override fun requerCarta(): Boolean {
        return false
    }

    override fun moverPara(x: Int, y: Int) {
        super<Veiculo>.moverPara(x, y)
    }

    override fun toString(): String {
        return "Bicicleta | $identificador | $dataDeAquisicao | $posicao"
    }


}