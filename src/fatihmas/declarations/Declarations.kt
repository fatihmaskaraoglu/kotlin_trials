package fatihmas.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>){
    val number = 25
    val number2: Int
    val number3:Short = 25

    number2 = 10
    //number2 = 20 can't assign a val variable for second time

    var number4: Int
    number4 = 10
    number4 = 20

    val employee1 = Employee("Fatih Mas", 500)
    employee1.name = "Fatih Maskaraoglu"

    val employee2: Employee
    val number5 =100
    if(number4 < number5){
        employee2 = Employee("Jane", 400)
    }else{
        employee2 = Employee("Mike", 150)
    }

    val employees: EmployeeSet

    val employeeOne = Employee("Mary",1)
    val employeeTwo = Employee("John",2)
    val employeeThree = Employee("John", 2)
    println(employeeOne == employeeTwo) //check structural equality
    println(employeeTwo == employeeThree) //check structural equality
    println(employeeOne.equals(employeeTwo)) //check structural equality
    println(employeeTwo.equals(employeeTwo)) //check structural equality
    println(employeeOne === employeeTwo) //check referential equality
    println(employeeTwo === employeeThree) //check referential equality
    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo) //check referential equality

    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)

    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)

    val x = 0x00101101
    val y = 0x11010112
    var something : Any = employeeFour
    if(something is Employee){
        println("It is Employee")
        val newEmployeeSome = something as Employee //just check cast work
        println(newEmployeeSome.name)
    }
    //without cast
    if(something is Employee){
        println(something.name)
    }
    if(something is Employee){
        something = employeeOne
        println(something.name)
    }

}

class Employee(var name: String, val id: Int){

    override fun equals(obj: Any?): Boolean{
        if(obj is Employee){
            return name == obj.name && id ==obj.id
        }
        return false
    }
}