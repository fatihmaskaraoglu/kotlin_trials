package fatihmas.nullreferences

fun main(args: Array<String>){
    val str: String? = "This isn't null"
    if(str != null){
        println(str.uppercase())
    }
    val str2: String? = null
    println(str2?.uppercase())
    if(str2 == null){
        null
    }else{
        str2.uppercase() //complier can understand we check if null
    }

    // 3 null check in one line code:
    //val countryCode: String? = bankBranch?.address?.country?.countrycCode ?: "US"

    val str3 = str?: "This is the default value"
    println(str3)

    val something: Any = arrayOf(1,2,3,4)
    val str4 = something as? String
    println(str4)

    // !! non null assertion, if str5 null then throw null pointer exception
    val str5: String? = "This isn't null"
    val str6 = str5!!.uppercase()

    str?.let{ printText(it) }

    val str7: String? = null
    val str8 = str7!!
    val str9 = str8.uppercase()
    /*
        Exception in thread "main" java.lang.NullPointerException
        at fatihmas.nullreferences.NullReferencesKt.main(NullReferences.kt:31)
     */
}

fun printText(text: String){
    println(text)
}