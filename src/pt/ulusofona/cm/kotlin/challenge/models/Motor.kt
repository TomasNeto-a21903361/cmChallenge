package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

data class Motor(
    val cavalos: Int,
    val cilindrada: Int
) : Ligavel {

    var ligado: Boolean = estaLigado() //false


    override fun ligar() {
        if (ligado){
            ligado = !estaLigado()
        }
        else {
            throw VeiculoLigadoException()
        }

    }

    override fun desligar() {
        if (!ligado) {
            ligado = estaLigado()
        }
        else {
            throw VeiculoDesligadoException()
        }
    }

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }
}
