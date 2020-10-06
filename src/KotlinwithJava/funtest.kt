@file:JvmName("Fun")        //this annotation is used for changing the compiled class file name.
package KotlinwithJava
fun main()
{
    val result=add(6,7)
    println(result)
    val check=max(5,7)
    println(check)
}
//Incline functions
fun add(a:Int,b:Int):Int=a+b
fun max(a:Int,b:Int):Boolean = a>b