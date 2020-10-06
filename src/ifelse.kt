fun main(args:Array<String>)
{
    var num1:Int=4
    var num2:Int=8
    var result:Int=0

    if (num1>num2)
        println(num1)
    else if(num2>num1)
        println(num2)
    else
        println("Same")

    //if-else as expression

    result=if(num1>num2)
            num1
        else
            num2
    println("The bigger number is : $result")
}