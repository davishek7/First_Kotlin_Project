fun main()
{
    var bubai1=Bubai()
    bubai1.skills="Java"
    bubai1.show()

    var bubai2=Bubai()
    bubai2.skills="Python"
    bubai2.show()

    var bubai3=bubai1.plus(bubai2)
    bubai3.show()
}
fun Bubai.plus(bubai: Bubai):Bubai
{
    var b=Bubai()
    b.skills=this.skills+ " " +bubai.skills
    return b
}