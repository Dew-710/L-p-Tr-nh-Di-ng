println("This is the text to print!")

val age = "19"
val name = "Rover"

var roll = 6
var rolledValue: Int = 4

println("You are already ${age}!")
println("You are already ${age} days old, ${name}!")

fun printHello () {
    println ("Hello Kotlin")
}

printHello()

fun printBorder(border: String, timesToRepeat: Int) {
    repeat(timesToRepeat) {
        print(border)
    }
    println()
}
printBorder("ok\n",10)

fun roll1(): Int {
    val randomNumber = (1..6).random()
    return randomNumber
}
println(roll1())

val diceRange=1..6
fun roll() {
    println(diceRange.random())
}
roll()


fun main() {
    val num = 4
    if (num > 4) {
        println("The variable is greater than 4")
    } else if (num == 4) {
        println("The variable is equal to 4")
    } else {
        println("The variable is less than 4")
    }
}

main()
val rollResult=roll1()
val luckyNumber=roll1()
when (rollResult) {
    luckyNumber -> println("You won!")
    1 -> println("So sorry! You rolled a 1. Try again!")
    2 -> println("Sadly, you rolled a 2. Try again!")
    3 -> println("Unfortunately, you rolled a 3. Try again!")
    4 -> println("No luck! You rolled a 4. Try again!")
    5 -> println("Don't cry! You rolled a 5. Try again!")
    6 -> println("Apologies! you rolled a 6. Try again!")
}
class Dice (val numSides: Int) {

    fun roll(): Int {
        val randomNumber = (1..numSides).random()
        return randomNumber
    }
}
val myFirstDice = Dice(6)
println("my first dice roll: "+myFirstDice.roll())