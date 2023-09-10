package fatihmas.loops

fun main(args: Array<String>){

    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"

    println(3 in range)
    println('q' in charRange)
    println("CCC" in stringRange)
    println("CCCCCC" in stringRange)
    println("ZZZZZZ" in stringRange)

    val backwardRange = 5.downTo(1)
    println(5 in backwardRange)

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    val reversedRange = range.reversed()

    for(i in range){
        println(i)
    }

    for(num in 0..20 step 4){
        println(num)
    }

    for(num in 20 downTo 0 step 4){
        println(num)
    }

    for (i in 1 until 10){
        println(i) //exclude 10
    }


    val seasons = arrayOf("spring", "summer","winter", "fall")
    for (season in seasons){
        println(season)
    }

    val notASeason = "whatever" !in seasons
    println(notASeason)

    val notInRange = 32 !in 1..10
    println(notInRange)

    val str = "Hello"
    println("e" in str)
    println("e" !in str)

    for (i in 1..3){
        println("i = $i")
        jloop@ for(j in 1..4){
            println("j= $j")
            for(k in 5..10) {
                println("k= $k")
                if(k == 7){
                    break@jloop
                    //continue@jloop
                }
            }
        }
    }


}