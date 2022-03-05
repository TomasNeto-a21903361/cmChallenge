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
        if (ligado == !estaLigado()){
            throw VeiculoLigadoException()
        }
        else {
            ligado = !estaLigado()
        }

    }

    override fun desligar() {
        if (ligado == estaLigado()) {
            throw VeiculoDesligadoException()
        }
           ligado = estaLigado()
    }

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }
}
