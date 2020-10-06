import java.util.*

fun main()
{
    val aliens=TreeMap<String,Int>() //TreeMap is a key(here String) and value(Int) pair
    aliens["avishek"]=24
    aliens["bubai"]=25

    for ((name,age) in aliens)
    {
        println("$name : $age")
    }
}