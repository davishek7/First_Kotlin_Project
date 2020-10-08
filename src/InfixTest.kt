fun main()
{
    var c1=Calc()
    c1.a=5
    c1.b=6
    c1.add()

    var c2=Calc()
    c2.a=8
    c2.b=9
    c2.add()

    var c3=c1 add c2
    c3.add()
}
infix fun Calc.add(calc:Calc):Calc{

    var c=Calc()
    c.a=this.a+calc.a
    c.b=this.b+calc.b
    return c
}
