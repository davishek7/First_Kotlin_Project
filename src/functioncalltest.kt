fun main()
{
   val result=add(6,7)
    println(result)
    val check=max(5,7)
    println(check)
    val dif=sub(7,5)
    println(dif)
}
//Incline functions
fun add(a:Int,b:Int):Int=a+b
fun max(a:Int,b:Int):Boolean =if(a>b) true else false

//normal function calling
fun sub(a:Int,b:Int):Int    // here :Int outside () is return type.
{
    return (a-b)
}