package fatihmas.ifexpression

fun main(args: Array<String>){

    //num = someCondition ? 50 : 592 can't do this kotlin

    val someCondition = 69 < 22

    val num = if (someCondition) 50 else 592

    println(num)

    val num2 = if(someCondition){
        println("something")
        50
    }
    else{
        println("something else")
        592
    }
    println(num2)

    if(someCondition){
        println("something")
    }

    println("the result of the if expression is ${if(someCondition){
        println("something")
        50
    }
    else{
        println("something else")
        592
    }}")

}