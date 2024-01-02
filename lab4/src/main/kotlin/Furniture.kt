import java.util.*

/**
 * Клас `Furniture` представляє меблі.
 * @property name Name of furniture.
 * @property material Material of furniture.
 * @property color Color of furniture.
 * @property weight Weight of furniture.
 * @property price Price of furniture.
 */
class Furniture(
    val name: String = "",
    val material: String = "",
    val color: String = "",
    val weight: Double = 0.0,
    val price: Double = 0.0,
) {
    /**
     * Overrided method `toString` for class `Furniture`.
     * @return String representation of the object.
     */
    override fun toString(): String {
        return "Furniture(name='$name', material='$material', color='$color', weight=$weight, price=$price)"
    }

    /**
     * Method `execute` for class `Furniture`.
     * Sorts array of `Furniture` objects by weight in ascending order and by price in descending order.
     * @return `true` if objects are equal, `false` otherwise.
     */
    fun execute() {
        // Створюємо масив об'єктів `Furniture`.
        val furnitureArray = arrayOf(
            Furniture("Chair", "Wood", "Brown", 7.5, 120.0),
            Furniture("Table", "Metal", "Black", 20.0, 300.0),
            Furniture("Bed", "Wood", "White", 50.0, 500.0),
            Furniture("Wardrobe", "Wood", "Brown", 75.0, 700.0),
            Furniture("Desk", "Metal", "Black", 25.0, 350.0),
        )

        // Сортуємо масив за вагою за зростанням.
        Arrays.sort(furnitureArray, compareBy { it.weight })

        println("Sorted by weight (ascending):")
        furnitureArray.forEach { println(it) }

        // Сортуємо масив за ціною за спаданням.
        Arrays.sort(furnitureArray, compareByDescending { it.price })

        println("\nSorted by price (descending):")
        furnitureArray.forEach { println(it) }
    }
}