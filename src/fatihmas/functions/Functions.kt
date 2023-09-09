package fatihmas.functions

fun main(args: Array<String>): Unit{
    println(labelMultiply(3,4,"The result is:"))
    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())
    println(labelMultiply3(3,4))
    println(labelMultiply3(operand2 = 3, operand1 = 4)) //assign parameters

    val car1= Car("blue", "Toyoya", 2015)
    val car2= Car("red", "Toyoya", 2016)
    val car3= Car("grey", "Toyoya", 2017)
    printColors(car1,car2,car3, str = "Color: ")
    val manyCars = arrayOf(car1, car2, car3)

    val moreCars = arrayOf(car2, car3)
    printColors(*moreCars, str= "Car")
    val car4 = car2.copy()
    val lotsofCars = arrayOf(*manyCars, *moreCars, car4)
    for(c in lotsofCars){
        println(c)
    }

    println(Utils().upperFirstAndLast("this is all in lowercase"))
    val str = "this is all in lowercase"
    println(str.upperFirstAndLastWithExtension())

}

fun labelMultiply(operand1: Int, operand2: Int, label: String): String{
    return ("$label ${operand1* operand2}")
}

fun labelMultiply2(operand1: Int, operand2: Int, label: String) = "$label ${operand1* operand2}" //short way

fun labelMultiply3(operand1: Int, operand2: Int, label: String = "The answer is:"): String{
    return ("$label ${operand1* operand2}")
}

fun printColors(vararg cars: Car, str: String ){
    for(car in cars){
        println(car.color)
    }
}

fun String.upperFirstAndLastWithExtension(): String{
    val upperFirst = substring(0,1).uppercase() + substring(1)
    return  upperFirst.substring(0, upperFirst.length-1)+ upperFirst.substring(upperFirst.length-1, upperFirst.length).uppercase()
}

class Employee(val firstName: String){
    fun upperCaseFirstName()= firstName.uppercase()
}

data class  Car(val color: String, val model: String, val year: Int){

}