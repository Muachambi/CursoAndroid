
package course

/** @VARIAVEIS NO KOTLIN( SÃO PARA SALVAR DADOS NA MEMÓRIA DO COMPUTADOR )

var = VARIÁVEL,
val = CONSTANTE

Variável : você consegue alterar o valor
Constante : você não consegue alterar o valor

 */


/** @TIPOS DE VARIÁVEIS

String -> TEXTOS(CPF, RG, NOME DO USUÁRIO)
Int -> NÚMEROS(NÚMERO DE PAGINAS, DATA DE NASCIMENTO)
Long -> NÚMEROS GRANDES COM MAIS 15 NÚMEROS
DOUBLE -> NÚMERO DE REAIS,
BIG DECIMAL -> NÚMERO DE REAIS, SÓ QUE MAIS PRECISO QUE O DOUBLE

 */

/** @CONDICONAIS NO KOTLIN ( BLOQUEAR O SISTEMA BASEADO EM UMA CONDIÇÃO )

if, else, else if, when

 */

/** @FUNÇÕES (É UM PROGRAMA QUE VOCÊ CRIA PARA EXECUTAR UMA AÇÃO.)

fun

 */

fun main() {
    val valor = telaLogin() // Quando clicar no botão da tela vai chamar essa função de autenticação => authentication()

    autenticacao(valor)
}

fun telaLogin() : String {
    println(" ========================== TELA DE LOGIN DO ALUNO =========================================== ")
    val rg = "653554561"
    val cpf = "07667883501"

    return rg
}

fun autenticacao(cpfOrRg : String) {

    var aluno = "GIL"
    aluno = aluno + "SANTOS"

    println(aluno)

    if(cpfOrRg.length == 11) {
        println("AUTENTICADO COM CPF ")
        println("USUÁRIO LOGADO COM SUCESSO.")

    }else if(cpfOrRg.length == 9) {

        println("AUTENTICADO COM RG")
        println("USUÁRIO LOGADO COM SUCESSO.")
    }else {

        println("NÃO AUTENTICADO " + "CPF e RG NÃO ESTÃO CORRETOS")
        println("USUÁRIO INVÁLIDO.")
    }


}