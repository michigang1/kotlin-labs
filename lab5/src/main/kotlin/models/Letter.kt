package models

data class Letter(val char: Char) {
    override fun toString(): String {
        return char.toString()
    }
}
