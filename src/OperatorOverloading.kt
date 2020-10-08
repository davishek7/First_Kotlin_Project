fun main()
{
    var c1=Calc()
    c1.a=10
    c1.b=12
    c1.add()

    var c2=Calc()
    c2.a=5
    c2.b=8
    c2.add()

    var c3=c1 + c2
    c3.add()

    var c4=c1 - c2
    c4.sub()
}
infix operator fun Calc.plus(calc:Calc):Calc{

    var c=Calc()
    c.a=this.a+calc.a
    c.b=this.b+calc.b
    return c
}
infix operator fun Calc.minus(calc: Calc):Calc{

    var c=Calc()
    c.a=this.a+this.b
    c.b=calc.a+calc.b
    return c
}