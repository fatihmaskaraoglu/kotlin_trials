package fatihmas.trycatch

import kotlin.NumberFormatException

fun main(args: Array<String>){
    //println(getNumber("22X") ?:  throw  IllegalArgumentException("Number isn't an Int"))
    println(getNumber("22X") ?:  "I can't print the result")
}


fun getNumber(str: String): Int? {
    return try{
        Integer.parseInt(str)
    }catch (e: NumberFormatException){
        null
    }
    finally {
        println("I'm in the finally block")
    }
}