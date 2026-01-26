suspend fun getValue(): Double {
    return 123.0
}

object DataProviderManager {
    private var blue="green"
    fun getBlue():String{
        return blue
    }
}
var obj=DataProviderManager
println(obj.getBlue())
try{

}
catch (exception: Exception){

}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}