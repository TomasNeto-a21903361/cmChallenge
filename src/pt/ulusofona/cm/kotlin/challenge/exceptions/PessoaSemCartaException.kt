package pt.ulusofona.cm.kotlin.challenge.exceptions

class PessoaSemCartaException(val nome: String,override val message: String = "$nome não tem carta para " +
        "conduzir o veículo indicado") : Exception(message) {
}
