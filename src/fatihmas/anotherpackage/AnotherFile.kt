package fatihmas.anotherpackage

import fatihmas.singleton.Department.IT
import fatihmas.singleton.Department.SALES
import fatihmas.functions.upperFirstAndLastWithExtension as ufal
import fatihmas.singleton.CompanyCommunications as Comm


fun main(args: Array<String>) {
    println(Comm.getCopyrightLine())
    println(IT.getDeptInfo())
    println(SALES.getDeptInfo())
    println("some string".ufal())
}