package `Desafio(Introdução a programação em Kotlin)`

fun main(args: Array<String>) {
    //insira as variaveis corretamente
    //variavel recebe 0 ou o zero e atribuito a variavel r
    var r = 0
    //inicio do loop com for(um laço de repetição)
    //que inicia com 1 e vai até o valor de entrada digitado
    //pelo usuario.
    //readLine() : recebe os dados de entrada vindo do teclado
    //Int(): transforma o valor em inteiro
    for (i in 1..readLine()!!.toInt()) {
        //print $i o valor na tela ou saida de dados
        //i*i: multiplicação do valor atribuito a variavel i
        println("$i ${ i *  i } ${ i * i * i }")
        //a cada loop é encrementado um valor: Ex: r= 0 + 1
        r += 0
    }
}