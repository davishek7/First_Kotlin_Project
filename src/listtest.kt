fun main()
{
    var lst= listOf(1,2,3,4)
    println(lst)
    //printing the values of the list
    for(i in lst)
    {
        println(i)
    }
    //printing list values with their indexes using withIndex() method

    for((i,e) in lst.withIndex())
    {
        println("$i : $e")
    }
}