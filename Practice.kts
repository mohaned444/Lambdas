fun unless(condition:Boolean,code: ()->Unit) (
if(!condition){
    code()
}
)


fun main(args: Array<string>) {
    val option = arrayOf("Red","Amber","Green")
    var crossWalk = options[(Math.random()* options.size).tolnt()]
    if (crossWalk == "Green") {
        println("Walk")
    }
}
unless(crossWalk == "Green") {
    println("Stop")
}

val mShoppingSet = mShoppingList.toMutableset()
println("mShoppingSet: $mShoppingSet")
val moreShopping = setOf("Chives","spinch","Milk")
mShoppingSet.addAll(moreShopping)
println("mshoppingSet items added: $mShoppingSet")
moShoppingList = mShoppingSet.toMutableList()
println("mShoppingList new version: $shoppingList")

