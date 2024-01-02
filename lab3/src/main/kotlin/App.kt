//C3 = 2 C17 = 2
// Знайти таке слово в першому реченні заданого тексту, якого не має в жодному з наступних.
fun main(){
    val stringFinder = StringFinder()
    val text = "This is the second sentence, the first. This is the second sentence, the end "
    val result = stringFinder.toFindWord(text)
    println(result)
}