package pt.ulusofona.cm.kotlin.challenge.exceptions

class VeiculoDesligadoException(override val message: String = "Já se encontra desligado") : Exception(message) {
}