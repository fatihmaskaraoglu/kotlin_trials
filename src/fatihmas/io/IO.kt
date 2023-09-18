package fatihmas.io

import java.io.File

fun main (args: Array<String>){

    //val lines = File("testfile.txt").reader().readLines()

    // entire file
    //File("testfile.txt").reader().readText()

    //lines.forEach{ println(it) }

    /*
    val reader = File("testfile.txt").reader()
    val lines = reader.readText()
    println(lines)
    reader.close()
    */

    /*
    val lines = File("testfile.txt").reader().use { it.readText()}
    println(lines)
    */

    /*
    val lines = File("testfile.txt").bufferedReader().use { it.readText()}
    println(lines)
    */

    /*
    val lines = File("testfile.txt").readText()

     */

    File("testfile.txt").reader().forEachLine { println(it) }
}