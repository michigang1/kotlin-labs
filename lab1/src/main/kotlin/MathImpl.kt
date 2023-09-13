import exceptions.DivisionByZeroException
import exceptions.FloorMoreThanCeilException

class MathImpl : Math {
    override fun getDoubleSum(firstFloor: Float, firstCeil: Int, secondFloor: Float, secondCeil: Int): Float {
        val const = Constants.C
        var i = firstFloor
        var j = secondFloor
        val iCeil = if (firstCeil >= firstFloor) firstCeil else throw FloorMoreThanCeilException()
        val jCeil = if (secondCeil >= secondFloor) secondCeil else throw FloorMoreThanCeilException()
        var resultSum = 0f

        while (i <= iCeil && j <= jCeil) {
            val numerator = i + j
            val denominator = j + const
            if (denominator == 0f) throw DivisionByZeroException(numerator / denominator)
            resultSum += numerator / denominator + resultSum
            j++
            i++
        }
        return resultSum
    }
}
