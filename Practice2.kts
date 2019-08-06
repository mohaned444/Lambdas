fun main (args): Array<string>) {

    val mShoppingList = mutableListOf("Tea","Eggs","Milk")
    println("mshoppingList original: $mShoppingList")
    val extraShopping = listOf ("cookies","Sugar","Eggs")
    mShoppingList.addAll(extrashopping)
    println("mShoppingList items added:$mShoppingList")
    if (mShoppingList.contains("Tea")) {
    mShoppingList.set(mShoppingList.indexOf("Tea"),"Coffe")
    }

    mutableSetOf.sort()
    println("mShoppingList sorted: $mShoppingList")
    mutableSetOf.reverse()
    println("mShoppingList reversed: $mShoppingList" )
}

