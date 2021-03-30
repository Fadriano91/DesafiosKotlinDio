package `Desafio(Solucionando Problemas em Kotlin)`

import java.io.EOFException


fun main(args: Array<String>) {
// loop enquanto
    while (true) {
        //O try consegue recuperar erros que possam ocorrer no código fornecido em seu bloco.
        try {
            //atribuir um valor de entrada a variavel l
            val l = readLine()!!.toInt()
            //atribuir um valor de entrada a variavel l
            //split(): Divide essa sequência de caracteres em uma lista de strings em torno das ocorrências dos delimitadores especificados .
            //ru(): Chama o bloco especificado e retorna seu resultado.
            val v= readLine()!!.split(" ").run { this.map{it->it.toInt()}.toIntArray()}
            v.sort()
            //when: define uma expressão condicional com várias ramificações
            when (v.last()) {
                //velocidade menor que 10
                in 0..9-> println("1")
                //velocidade maior ou igual a 10 e menor ou igual que 19
                in 10..19-> println("2")
                else -> println("3")
            }
            // O catch por sua vez faz o tratamento dos erros que aconteceram.
        } catch (f :  Exception) {
            break
        } catch (n : Exception) {
            break
        } catch (e :Exception) {
            break
        }
    }
}