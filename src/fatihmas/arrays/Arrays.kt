package fatihmas.arrays

import fatihmas.javacode.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {
    val names = arrayOf("John", "Jane", "Jill", "Joe")

    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1,2,3,4)

    println(longs1[2])

    val evenNumbers = Array(16) { i -> i * 2 }

    for(number in evenNumbers){
        println(number)
    }

    val lotsOfNumbers = Array(100000){ i -> i + 1}
    val allZeroes = Array(100){0}

    var someArray: Array<Int>
    someArray =  arrayOf(1,2,3,4)
    for(number in someArray){
        println(number)
    }
    someArray = Array(6){ i -> (i + 1) * 10 }
    for(number in someArray){
        println(number)
    }

    val mixedArray = arrayOf("hello", 22, BigDecimal(0.5),'a')
    for(element in mixedArray){
        println(element)
    }

    /* can't call like that
    val myIntArray = arrayOf(3, 4, 5, 6, 7)
    DummyClass().printNumbers(myIntArray)
     */
    //can call with toIntArray
    val myIntArray = arrayOf(3, 4, 5, 6, 7)
    DummyClass().printNumbers(myIntArray.toIntArray())
    val myIntArray2 = intArrayOf(3, 4, 5, 6, 7)
    DummyClass().printNumbers(myIntArray2)

    var someOtherArray = IntArray(5)
    for(number in someOtherArray){
        println(number)  //print zeros
    }


}