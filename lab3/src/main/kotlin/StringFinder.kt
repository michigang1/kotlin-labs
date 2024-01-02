class StringFinder {
    fun toFindWord(text: String): String {
        if (text == null) {
            throw IllegalArgumentException("Text should not be null.")
        }
        if (text.isBlank()) {
            throw IllegalArgumentException("Text should not be blank.")
        }
        if (text.isEmpty()) {
            throw IllegalArgumentException("Text should not be empty.")
        }
        if (text.length < 4) {
            throw IllegalArgumentException("Text should have at least 2 characters.")
        }

        if (!text.contains(".")) {
            throw IllegalArgumentException("Text should contain dots.")
        }



        val sentences = text.split(". ")
        val firstSentenceWords = sentences[0].split(" ").map { it.replace(Regex("[.,-:]"), "") }
        val otherSentencesWords = sentences.drop(1).flatMap { it.split(" ") }.map { it.replace(Regex("[.,-:;]"), "") }

        for (word in firstSentenceWords) {
            if (word !in otherSentencesWords) {
                return word
            }
        }

        return "No unique word found in the first sentence."
    }
}