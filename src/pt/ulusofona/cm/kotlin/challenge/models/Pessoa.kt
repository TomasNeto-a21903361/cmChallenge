package pt.ulusofona.cm.kotlin.challenge.models


import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException
import pt.ulusofona.cm.kotlin.challenge.exceptions.PessoaSemCartaException
import pt.ulusofona.cm.kotlin.challenge.exceptions.VeiculoNaoEncontradoException
import pt.ulusofona.cm.kotlin.challenge.interfaces.Movimentavel
import java.util.*

data class Pessoa(
    val nome: String,
    val dataDeNascimento: Date
) : Movimentavel {

    val veiculos = mutableListOf<Veiculo>()
    val carta: Carta? = null
    val posicao: Posicao = Posicao()


    fun comprarVeiculo(veiculo: Veiculo) {
        veiculos.add(veiculo)
    }

    fun pesquisarVeiculo(identificador: String): Veiculo {
        for (veiculo in veiculos){
            if (identificador == veiculo.identificador){
                return veiculo
            }
        }
          throw VeiculoNaoEncontradoException()
    }

    fun venderVeiculo(identificador: String, comprador: Pessoa) {
        for (veiculo in veiculos) {
            if (identificador == veiculo.identificador) {
                veiculo.dataDeAquisicao = Date()
                comprador.veiculos.add(veiculo)
                veiculos.remove(veiculo)
            }
        }
    }

    fun moverVeiculoPara(identficador: String, x: Int, y: Int) {
        for (veiculo in veiculos){
            if (veiculo.identificador == identficador){
                if (veiculo.requerCarta() == true && !temCarta())
                {
                    throw PessoaSemCartaException(nome)
                }

                if (veiculo.posicao.x == x || veiculo.posicao.y == y){
                    throw AlterarPosicaoException()
                }

                 veiculo.posicao.alterarPosicaoPara(x,y)
            }
        }
    }

    fun temCarta(): Boolean{
        if (carta != null){
            return true
        }
        return false
    }

    fun tirarCarta(){
        if (!temCarta()){
            temCarta()
        }
        temCarta()
    }

    override fun moverPara(x: Int, y: Int) {
        if (posicao.x != x || posicao.y != y){
            posicao.x = x
            posicao.y = y
        }
        else{
             throw AlterarPosicaoException()
        }
    }

    override fun toString(): String {
        return "Pessoa | $nome | $dataDeNascimento | Posicao | $posicao"
    }


}