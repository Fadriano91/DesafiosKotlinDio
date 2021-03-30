package `Desafio(Introdução a programação em Kotlin)`

fun main(args: Array<String>) {
    /** loop com for
     * i: variavel
     * in: é usado como um operador infixo para verificar se um valor
     * pertence a um intervalo.
     * rangeTo(): Metodo Cria um intervalo deste valor ao outro valor especificado .
     * readLine(): Metodo p/ receber dados de entrada
     * toInt(): Metodo p/ converter dados de entrada em Inteiro
     * step(): metodo pula uma etapa ex: 1, 3, 5
     * print: saida de dados
     */
    for (i in 1.rangeTo(readLine()!!?.toInt()).step(2))println(i) //complete o codigo com os valores corretos
}