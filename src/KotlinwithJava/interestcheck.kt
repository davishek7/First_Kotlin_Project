@file:JvmName("Interest")
package KotlinwithJava
fun main()
{
    var result1 = calcAmount(70)
    var result2= calcAmount(70,0.03)
    println(result1)
    println(result2)
}
@JvmOverloads                         //this annotation is used so that java can work with default parameter
fun calcAmount(amt:Int,interest:Double=0.04):Int
{
    return (amt+amt*interest).toInt()       //toInt() method is used as the return will be in Double
}