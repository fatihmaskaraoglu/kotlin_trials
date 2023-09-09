package fatihmas.accesmodifiers

fun main(args: Array<String>){

    val emp = Employee("John")
    println(emp.firstName)
    println(emp.fullTime)
    val emp2 = Employee("John2",false)
    println(emp2.firstName)
    println(emp2.fullTime)


    val emp3 = Employee3("John2",false)
    println(emp3.firstName)
    // println(emp3.fullTime) can't access
}



class Employee(val firstName: String){ //don't need writing constructor if it is public
    var fullTime = true
    constructor(firstName: String, fullTime: Boolean): this(firstName){
        this.fullTime = fullTime
    }
}

class Employee2(val firstName: String, var fullTime: Boolean = true){ // short way
}

class Employee3(val firstName: String, private var fullTime: Boolean = true){
}

class Employee4(val firstName: String, fullTime: Boolean = true){
    //custom getter
    var fullTime =  fullTime
    get(){
        println("Running the custom get")
        return field
    }
        set(value){
            println("Running the custom set")
            field = value
        }
}