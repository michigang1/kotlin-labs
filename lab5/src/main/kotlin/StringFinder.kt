import models.Text
import models.Word

class StringFinder {
    fun toFindWord(text: Text): Word? {
        if (text.sentences.isEmpty()) {
            throw IllegalArgumentException("Text should not be empty.")
        }

        if (text.sentences.size < 2) {
            throw IllegalArgumentException("Text should contain at least two sentences.")
        }

        val firstSentenceWords = text.sentences.first().words

        val otherSentencesWords = text.sentences.drop(1).flatMap { it.words }

        for (word in firstSentenceWords) {
            if (!otherSentencesWords.contains(word)) {
                return word
            }
        }

        return null
    }
}
