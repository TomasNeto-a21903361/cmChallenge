package pt.ulusofona.cm.kotlin.challenge.interfaces

import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoDesligadoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoLigadoException

interface Ligavel {
    fun ligar(){
        if (estaLigado()) {
            !estaLigado()
        }
        else {
            throw VeiculoLigadoException()
        }
    }

    fun desligar(){
        if (!estaLigado()) {
            estaLigado()
        }
        else {
            throw VeiculoDesligadoException()
        }
    }

    fun estaLigado(): Boolean{
        return false
    }
}