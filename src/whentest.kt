fun main() {
    val num1 = 6
    val num2 = 2

    when (num1) {
        1 -> println("one")
        2 -> println("two")
        3 -> println("three")
        4 -> println("four")
        else ->println("Give proper input")
    }
    val result=when (num2) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        4 -> "four"
        else ->"Give proper input"
    }
    println("The result is : $result")
}