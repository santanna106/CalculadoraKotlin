package com.pasta.inicial

class Calculadora {
    var nome: String = "teste"

    public fun soma(a: Int , b:Int):Int {
        return (a + b)
    }
    public fun subtracao(a: Int , b:Int):Int {
        return (a - b)
    }
    public fun multiplicacao(a: Int , b:Int):Int {
        return (a * b)
    }
    public fun divisao(a: Int , b:Int):Int {
        return (a / b)
    }
    public fun resto(a: Int , b:Int):Int {
        return (a % b)
    }

    public fun fatorial(n:Int):Int {
        if (n == 1){
            return 1;
        }
        return n*fatorial(n-1)
    }




}

