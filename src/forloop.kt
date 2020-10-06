fun main(){

    for(a in 1..16)
    {
        println(a)
    }
    for(a in 1..16 step 2)
    {
        println(a)
    }
    for(a in 1 until 16)
    {
        println(a)
    }
    for (a in 16 downTo 1)   //it can also be written as for(a in 16.downTo(to:1)){}
    {
        println(a)
    }
    val nums=1..16
    for (a in nums.reversed())
    {
        println(a)
    }
    println("Count is ${nums.count()}")

    val names= 'A'..'z'
    for (a in names)
    {
        println(a)
    }
    println("The count is : ${names.count()}")
}