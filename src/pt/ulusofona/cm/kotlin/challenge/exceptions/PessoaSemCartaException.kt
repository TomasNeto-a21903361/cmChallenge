package pt.ulusofona.cm.kotlin.challenge.exceptions

class PessoaSemCartaException(override val message: String = "Precisa de carta para conduzir este veículo")
    : Exception(message) {

}