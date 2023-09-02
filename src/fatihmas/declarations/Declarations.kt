package fatihmas.declarations

fun main(args: Array<String>){
    val number = 25
    val number2: Int
    val number3:Short = 25

    number2 = 10
    //number2 = 20 can't assign e val variable for second time

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
}

class Employee(var name: String, val id: Int){

}