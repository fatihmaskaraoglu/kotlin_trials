package fatihmas.collections

fun main(args: Array<String>){
    val strings = listOf("spring", "summer", "fall", "winter")
    val colorList = listOf("black","white","red", "red")

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other")
    println(mutableSeasons)

    println(strings.last())
    println(strings.asReversed())

    if(strings.size > 5){
        println(strings[5])
    }

    println(strings.getOrNull(5))

    val ints = listOf(1,2,3,4,5)
    println(ints.max())

    val mergedList = listOf(colorList,strings)
    println(mergedList)

    val combinedList = colorList + strings
    println(combinedList)

    val noDupsList = colorList.union(strings)
    println(noDupsList)

    val noDupColors = colorList.distinct()
    println(noDupColors)

}