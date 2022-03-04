package pt.ulusofona.cm.kotlin.challenge.exceptions

class VeiculoLigadoException(override val message: String = "Já se encontra ligado") : Exception(message) {
}