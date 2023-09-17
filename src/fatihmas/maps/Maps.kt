package fatihmas.maps

fun main(args: Array<String>) {


    val setInts = setOf(10, 15, 19, 5, 3, -22)
    println(setInts.plus(20))
    println(setInts.plus(10))
    println(setInts.minus(19))
    println(setInts.average())
    println(setInts.drop(3)) // drop first 3 elements

    val mutableInts = mutableSetOf(1,2,3,4,5)
    mutableInts.plus(10)
    println(mutableInts)


    val immutableMap = mapOf<Int, Car>(1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013))

    println(immutableMap.javaClass)
    println(immutableMap)

    val mutableMap = hashMapOf<String, Car>("John's car" to Car("red", "Range Rover", 2010),
        "Jane's car" to Car("blue", "Hyundai", 2012))
    println(mutableMap.javaClass)
    println(mutableMap)
    mutableMap.put("Mary's car", Car("red", "Corvette", 1965))

    for ((k, v) in mutableMap) {
        println(k)
        println(v)
    }

    val pair = Pair(10, "ten")
    //val firstValue = pair.first
    //val secondValue = pair.second
    val (firstValue, secondValue) = pair
    println(firstValue)
    println(secondValue)

    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("color = $color, model = $model, and year = $year")


}

class Car(val color: String, val model: String, val year: Int) {

    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year

}



