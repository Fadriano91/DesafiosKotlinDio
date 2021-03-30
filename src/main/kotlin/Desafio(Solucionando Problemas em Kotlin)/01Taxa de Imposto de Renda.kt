package `Desafio(Solucionando Problemas em Kotlin)`

fun main(args: Array<String>) {
    //continue a solução
    //Float: Recebe um numero real com o tamanho de 32bits.
    //format(): Metodo para formatar String no dados recebido no parametro
    //digitis: Variavel tipo inteiro
    //Inteiro: Inteiro
    //replace(): Retorna uma nova string com todas as ocorrências de oldChar substituídas por newChar .
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    //atribuir um valor do tipo Float a variavel r. Ex: r:10,2
    val r = readLine()!!.toFloat()
    // //atribuir um valor 0 tipo float a variavel i:
    var i = 0F
    //condição ou regra do sistema
    // se r(variavel) maior que 0 e r(variavel) menor que que 2000
    //obs: variavel de entrada no (r)
    if (r>0 && r<=2000 ) {
        //se a condição acima for verdadeira.
        //execute aqui. apos execução sair da condição final
        i = 0F
    }
    //senão teste acima for falso
    else
    //teste essa regra: // se r(variavel) maior que 2000 e r(variavel) menor que ou igual 3000
        if (r>2000 && r <=3000) {
            //se a condição acima for verdadeira.
            //execute aqui:  apos execução sair da condição final
            //r-menor 2000 * multiplicado por 0.08 tipo float (F)
            i = (r-2000)*0.08f
        } else //senão teste acima for falso
        //teste essa regra
            if ( r > 3000 && r<=4500 ) {
                //se a condição acima for verdadeira.
                //execute aqui:  apos execução sair da condição final
                i=1000 * 0.08F + (r-3000)*0.18f
            } //senão teste acima for falso
            else
            //teste essa regra
                if (r > 4500) {
                    //se a condição acima for verdadeira.
                    //execute aqui:  apos execução sair da condição final
                    i = 1000 * 0.08F + 1500 * 0.18F + (r -4500)*0.28F
                }
    //condição de i=0 print isento
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")

}