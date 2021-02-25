package com.pasta.inicial

public class Menu(private val calculadora: Calculadora) {



    private fun interacaoMenuDoisInteiros() : RetornoFuncConsole{
        var n1: Int = 0
        var n2: Int = 0
        println()
        println("Digite o primeiro numero: ")
        n1 = Integer.valueOf(readLine())
        println("Digite o segundo numero: ")
        n2 = Integer.valueOf(readLine())

        var retorno = RetornoFuncConsole(n1,n2)

        return retorno
    }

    private fun interacaoMenuUmInteiros() : RetornoFuncConsole{
        var n1: Int = 0
        println()
        println("Digite o numero: ")
        n1 = Integer.valueOf(readLine())

        var retorno = RetornoFuncConsole(n1,null)

        return retorno
    }

    fun executaOperacao(n: String?)  {
        when (n) {
            "1" -> {
                val (n1, n2) =    interacaoMenuDoisInteiros()

                var resultado = calculadora.soma(n1,n2 ?: 0)
                imprimirResultado(resultado)
            }
            "2" -> {
                val (n1, n2:Int?) =    interacaoMenuDoisInteiros()
                var resultado = calculadora.subtracao(n1,n2 ?: 0)
                imprimirResultado(resultado)
            }
            "3" -> {
                val (n1, n2) =    interacaoMenuDoisInteiros()
                var resultado = calculadora.multiplicacao(n1,n2 ?: 0)
                imprimirResultado(resultado)
            }
            "4" -> {
                val (n1, n2) =    interacaoMenuDoisInteiros()
                var resultado = calculadora.divisao(n1,n2 ?: 0)
                imprimirResultado(resultado)
            }
            "5" -> {
                val (n1, n2) =    interacaoMenuDoisInteiros()
                var resultado = calculadora.resto(n1,n2 ?: 0)
                imprimirResultado(resultado)
            }
            "6" -> {
                val (n1) =    interacaoMenuUmInteiros()
                var resultado = calculadora.fatorial(n1)
                imprimirResultado(resultado)
            }
            else -> { // Note the block
                print("Fim")
            }
        }
    }

    fun imprimirResultado(resultado:Int){
        println("")
        println("Resutado:  $resultado" )
        println("")
    }

    fun menu() {
        var escolha: String? = ""
        do {
            println("Escolha a operação:")
            println("");
            println("[1] - Soma")
            println("[2] - Subtração")
            println("[3] - Multiplicação")
            println("[4] - Divisão")
            println("[5] - Resto")
            println("[6] - Fatorial")
            println("[7] - Sair")
            println("");
            println("Digite a opção: ")
            escolha = readLine()

            executaOperacao(escolha)

        } while (escolha != "7")
    }

}