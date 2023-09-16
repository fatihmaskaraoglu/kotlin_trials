package fatihmas.collections


fun main(args: Array<String>){

    val strings = listOf("spring", "summer", "fall", "winter")
    println(strings.javaClass) // class java.util.Arrays$ArrayList

    val emptyList = emptyList<String>()
    println(emptyList.javaClass) // class kotlin.collections.EmptyList

    if(!emptyList.isEmpty()){
        println(emptyList[0])
    }

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList)

    val arrayList = arrayListOf(1,2,3) //class java.util.ArrayList
    println(arrayList.javaClass)

    val mutableList = mutableListOf<Int>(1,2,3) //class java.util.ArrayList
    println(mutableList.javaClass)

    val array = arrayOf("black","white","green")
    val colorList = listOf(array)
    println(colorList) //[[Ljava.lang.String;@3a71f4dd]
    val colorList2 = listOf(*array)
    // val colorList2 = array.toList() same as line 28
    println(colorList2) //[black, white, green]


}