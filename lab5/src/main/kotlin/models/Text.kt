package models

data class Text(val sentences: List<Sentence> = emptyList()) {
    override fun toString(): String {
        return sentences.joinToString(separator = " ")
    }
}
