package fatihmas.singleton

import java.time.Year

fun main(args: Array<String>){
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}


object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine()= "Out company rocks!"
    fun getCopyrightLine() = "Copyright \u00a9 $currentYear Our Company. All rights reserved."
}