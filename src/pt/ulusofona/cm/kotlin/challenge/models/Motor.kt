package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.interfaces.Ligavel

class Motor(
    val cavalos: Int,
    val cilindrada: Int,
    val ligado: Boolean?
) : Ligavel {
    constructor(cavalos: Int,cilindrada: Int) : this(cavalos,cilindrada,null)

    override fun toString(): String {
        return "Motor | $cavalos | $cilindrada"
    }
}
