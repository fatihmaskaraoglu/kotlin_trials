package fatihmas.singleton

import java.time.Year

fun main(args: Array<String>){
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string is",false)
    println(someClass1.someString)
    println(someClass2.someString)

    var thisIsMutable = 45
    wantsSomeInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })
    println(thisIsMutable)

    println(Department.ACCOUNTING.getDeptInfo())
}

enum class Department(val fullName: String, val numEmployees: Int){
    HR("Humen Resources",5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20);

    fun getDeptInfo() = "The $fullName department has $numEmployees"
}

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine()= "Out company rocks!"
    fun getCopyrightLine() = "Copyright \u00a9 $currentYear Our Company. All rights reserved."
}

class SomeClass private constructor(val someString: String){
    companion object{
        private var privateVar = 6
        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if(lowerCase){
                return SomeClass(str.lowercase())
            }else{
                return SomeClass(str.uppercase())
            }
        }
    }
}

interface SomeInterface{
    fun mustImplement(num: Int):String
}

fun wantsSomeInterface(si: SomeInterface){
    println("Printing from wantSomeInterface ${si.mustImplement(22)}")
}


