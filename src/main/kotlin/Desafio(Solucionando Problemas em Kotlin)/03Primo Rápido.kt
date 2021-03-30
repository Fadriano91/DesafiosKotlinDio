package `Desafio(Solucionando Problemas em Kotlin)`

import kotlin.math.sqrt

fun main(args: Array<String>){
    //Entrada de dados tipo inteiro p/ loop for
    for (i in 1.rangeTo(readLine()!!.toInt())){
        //codição retorno metodo valorPrime
        if(valorPrimo(readLine()!!.toDouble())){
            println("Prime")
        }else{
            println("Not Prime")
        }
    }
}
//Metodo para verificar numero Primo.
fun valorPrimo(valor: Double):Boolean{
    if (valor < 2) return false// caso seja verdadeiro retorne a false e sair da função
    if (valor % 2 == 0.0) return valor == 2.0//caso o resto da divisaõ (valor %pegar o resto 2) igual 0 retorne valor igual 2
    //root: recebi o raiz quadrada do valor digitada pelo usuario
    val root = sqrt(valor).toInt()
    //variavel i é atribuido 3
    var i = 3
    //laço enquanto 3 menor ou igual o valor atribuido a root faça
    while (i <= root) {
        if (valor % i == 0.0) return false//retorno o resto da divisão retorna a falso
        //encrementa
        i += 2
    }
    return true
}