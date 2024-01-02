package models

data class Word(val letters: List<Letter> = emptyList()) {
    override fun toString(): String {
        return letters.joinToString(separator = "") { it.toString() }
    }
}
