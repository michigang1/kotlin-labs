import exceptions.DivisionByZeroException
import exceptions.FloorMoreThanCeilException


// C2 = 0(+) C3 = 2 C5 = 3(+) C7 = 5(float)
class MathImpl : Math {
    override fun getDoubleSum(firstFloor: Float, firstCeil: Int, secondFloor: Float, secondCeil: Int): Float {
        val const = Constants.C
        var iFloor = firstFloor
        var jFloor = secondFloor
        val iCeil = if (firstCeil >= firstFloor) firstCeil else throw FloorMoreThanCeilException()
        val jCeil = if (secondCeil >= secondFloor) secondCeil else throw FloorMoreThanCeilException()
        var resultSum = 0f
        for (i in iFloor.toInt()..iCeil) {
            for (j in jFloor.toInt()..jCeil) {
                val numerator = i + j
                val denominator = i + const
                if (denominator != 0f) {
                    resultSum += numerator / denominator
                } else  {
                    throw DivisionByZeroException(resultSum)
                }
            }
        }
        return resultSum
    }

}
