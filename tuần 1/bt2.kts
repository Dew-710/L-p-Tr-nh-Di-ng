import kotlin.math.PI
abstract class Dwelling() {
    abstract val buildingMaterial: String
    abstract fun floorArea(): Double
}

open class RoundHut(residents: Int) {
}

class SquareCabin(override val buildingMaterial: String) : Dwelling() {
    var area = 10000.0
    override fun floorArea(): Double {
        return area
    }

}

val myCabin= SquareCabin("ok")
println(myCabin.floorArea())


val numbers = listOf(1, 2, 3, 4, 5, 6)
println(numbers.size)
println(numbers[0])
var reversedArr=listOf("red", "blue", "green").reversed()
print(reversedArr[0])
val entrees = mutableListOf<String>()
entrees.add("lemon")
println(entrees[0])
entrees[0]="bubble"
println(entrees[0])

for(i in numbers){
    println(i)
}
var index = 0
while (index < numbers.size) {
    println(numbers[index])
    index++
}
val name = "Android"
println(name.length)

val number = 10
println("$number people")
val groups = 5
println("${number * groups} people")
with(myCabin) {
    println("Material: ${buildingMaterial}")
}
val radius=12
val area=kotlin.math.PI * radius * radius