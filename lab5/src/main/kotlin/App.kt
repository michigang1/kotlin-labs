import models.*

// C3 = 2 C17 = 2
// Знайти таке слово в першому реченні заданого тексту, якого не має в жодному з наступних.
fun main() {
    // Create an instance of StringFinder
    val stringFinder = StringFinder()

    // Create a models.Text object
    val text =
        Text(
            listOf(
                Sentence(
                    listOf(
                        Word(listOf(Letter('H'), Letter('e'), Letter('l'), Letter('l'), Letter('o'))),
                        Word(listOf(Letter('m'), Letter('y'))),
                        Word(listOf(Letter('w'), Letter('o'), Letter('r'), Letter('l'), Letter('d'))),
                    ),
                    listOf(Punctuation('.')),
                ),
                Sentence(
                    listOf(
                        Word(listOf(Letter('H'), Letter('e'), Letter('l'), Letter('l'), Letter('o'))),
                        Word(listOf(Letter('w'), Letter('o'), Letter('r'), Letter('l'), Letter('d'))),
                    ),
                    listOf(Punctuation('.')),
                ),
            ),
        )

    val result = stringFinder.toFindWord(text)

    if (result != null) {
        println(result.toString())
    } else {
        println("models.Word not found.")
    }
}
