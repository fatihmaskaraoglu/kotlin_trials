package fatihmas.stings

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>){
    var number : Int
    number = 10
    number = 20


    val employeeOne = Employee("Lynn Jones",500)
    employeeOne.name = "Lynn Smith"

    println(employeeOne)

    val change = 4.22
    println("To show the value of change, we use $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator divided by $denominator is " +
            "${numerator/denominator}")

    val filePath = """"c:\somedir\somedir2""""

    val nurseryRhyme = """Humpty Dumpty sat on the wall
                          *try try try
                          *try try try"""
    println(nurseryRhyme)

    val nurseryRhymeWithMargin = """Humpty Dumpty sat on the wall
                                    *try try try
                                    *try try try""".trimMargin("*")
    println(nurseryRhymeWithMargin)

    val eggName = "Humpty"
    val nurseryRhymeWithVal = """$eggName Dumpty sat on the wall
                                    *$eggName try try
                                    *try try $eggName""".trimMargin("*")
    println(nurseryRhymeWithVal)
}

class Employee(var name: String, val id: Int){
    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }
}