import java.lang.NumberFormatException

fun main()
{
    val str="4a"
    var num1=0
    var num2: Int
    //normal try-catch block
    try
    {
        num1=str.toInt()
    }
    catch(e:NumberFormatException)
    {
        println("Exception:Please input in proper format")
    }
    num1++
    println(num1)

    //try-catch as expression
    num2=try{
        str.toInt()
    }
    catch(e:NumberFormatException)
    {
        -1
    }
    num2++
    println(num2)
}