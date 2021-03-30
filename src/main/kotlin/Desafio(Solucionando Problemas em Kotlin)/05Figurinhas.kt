package `Desafio(Solucionando Problemas em Kotlin)`

fun main(args: Array<String>) {
    //variavel
    val lista = mutableListOf<Int>()
    //laço de repetição 1 a valor de entrada
    for (i in 1..readLine()!!.toInt()) {
        //variavel
        val input = readLine()!!.split(" ").map { it.toInt() }
        //tamanho igual a 2
        if (input.size==2){
            //passar o valor a fun mdc, posicao 0 e 1
            val valor = mdc(input[0], input[1])
            //adicionar a lista
            lista.add(valor)
        }
    }
    //for exibir posição da lista
    for (i in lista){
        //saida de dados
        println(i)
    }
}
// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int {
    //declaração de variavel tipo Inteiro
    var restoDiv: Int
    var valor1 = n1 //valor1 recebe o valor recebido no parametro da fun mdc
    var  valor2 = n2 //valor2 recebe o valor recebido no parametro da fun mdc
    do {
        //atribuir o resto da divisão a variavel restoDiv
        restoDiv = valor1 % valor2
        //valor1 passa a receber o valor 2
        valor1 = valor2
        //valo2 agora vazio passa a receber o valor do resto da divisão
        valor2 = restoDiv
    }while (restoDiv!=0)//loop finaliza quando o resto da divisão for diferente de zero
    return valor1
}