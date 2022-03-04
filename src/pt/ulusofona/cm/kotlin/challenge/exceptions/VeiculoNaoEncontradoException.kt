package pt.ulusofona.cm.kotlin.challenge.exceptions

class VeiculoNaoEncontradoException(override val message: String = "Não possuí esse veículo") : Exception(message) {
}