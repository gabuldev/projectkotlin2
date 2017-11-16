package main

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks

open class StringAlgorithm(title : String, author : String, version : String, description : String) : Algorithm(title, author,version,description){


   //LETRA A

    fun cesarChyper (inputText : String, patternCypher : String){//ESTUDAR WIKIPEDIA

    }

    fun creatPatter () : String{

        val patterCypher: String = "abcdefghijklmnopqrstuvxwyz"
        return patterCypher
    }

    //LETRA B

    fun countOcurrences (inputText: String) : String? {

        var retornotamanho = inputText
        var count : Int? = null
        for (i in 0 until inputText.length){

            count = 0

            for (j in 0 until inputText.length){
                if(inputText[i] == inputText[j]){
                    count++
                }
            }
            retornotamanho += count
            retornotamanho += inputText[i]
        }

        return retornotamanho
    }

    fun cleanInputText (inputText: String) : String? {
        var retornoText : String? = null
        var StringComAcentos : String? = null
        var StringEspeciais : String? = null

        if(inputText.isEmpty() !=  false){
            println(inputText)
        }

        //CRIANDO A STRING COM ACENTOS
        StringComAcentos = "ÁÀÂÃáàâãÈÉÊéèêÌÍÎíìîÚÙÛúùûÓÒÔÕóòôõÇç"
        StringEspeciais = "()/|.,][{}!@#$%& *=?!-_:;"

        //RETIRANDO OS ESPECIAIS

            for (i in 0 until inputText.length){
                for(j in 0 until StringEspeciais.length){
                    if (inputText[i] == StringEspeciais[j]){
                        inputText.removeRange(i.rangeTo(i))//VERIFICAR ISSO AQUI NAO SEI SE FUNCIONA
                    }
                }
            }
                retornoText = inputText
        return retornoText
    }
    init {

    }
}