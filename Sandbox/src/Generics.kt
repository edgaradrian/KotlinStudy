class LootBox<T>(item: T) {
    var open = false
    private var loot: T = item

    fun fetch(): T? {
        return loot.takeIf { open }
    }//fetch

    fun <R> fetch(lootModFunction: (T) -> R): R? {
        return lootModFunction(loot).takeIf { open }
    }//fetch

}//LootBox

class Fedora(val name: String, val value: Int)

class Coin(val value: Int)

fun main(args: Array<String>) {
    val lootBoxOne: LootBox<Fedora> = LootBox(Fedora("a generic-looking fedora", 15))
    val lootBoxTwo: LootBox<Coin> = LootBox(Coin(15))

    lootBoxOne.open = true
    lootBoxOne.fetch()?.run {
        println("You retrieve a $name from the box!")
    }

    val coin = lootBoxOne.fetch {
        Coin(it.value * 3)
    }
    coin?.let { println(it.value) }

}//main