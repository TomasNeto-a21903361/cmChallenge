package pt.ulusofona.cm.kotlin.challenge.exceptions

class MenorDeIdadeException(override val message: String = "não tem idade para " +
        "tirar a carta") : Exception(message) {
}