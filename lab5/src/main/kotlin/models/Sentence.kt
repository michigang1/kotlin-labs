package models

data class Sentence(val words: List<Word> = emptyList(), val punctuation: List<Punctuation> = emptyList()) {
    override fun toString(): String {
        return words.joinToString(separator = " ") { it.toString() } + punctuation.joinToString(separator = "") { it.toString() }
    }
}
