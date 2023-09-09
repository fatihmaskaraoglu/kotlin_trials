package fatihmas.inheritance

fun main(args: Array<String>){
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()
    SomethingElse("whatever")
}



abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of this printer is $modelName")
    abstract  fun bestSellingPrice(): Double
}


open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName){
    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99
}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter (modelName, ppm){

}

open class Something :MySubInterface{
    val someProperty: String
    override val number: Int = 25
    //override val number2: Int = 40

    constructor(someParameter: String){
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse: Something{
    constructor(someOtherParameter: String): super(someOtherParameter){
        println("I'm in the childs's constructor")
    }
}

interface MyInterface{
    val number: Int
    val number2: Int
        get() = 45

    fun myFunction(str: String): String
}

interface MySubInterface: MyInterface{
    fun mySubFunction(num: Int): String
}