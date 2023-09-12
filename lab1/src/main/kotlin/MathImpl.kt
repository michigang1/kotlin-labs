import java.lang.Exception
import kotlin.system.exitProcess

class MathImpl : Math {
    override fun getDoubleSum(firstFloor: Float, firstCeil: Int, secondFloor: Float, secondCeil: Int): Float {
        val const = Constants.C
        var i = firstFloor
        var j = secondFloor
        val counterN = if (firstCeil >= firstFloor) firstCeil else exitProcess(1)
        val counterM = if (secondCeil >= secondFloor) secondCeil else exitProcess(1)
        var resultSum = 0f
        while (i <= counterN && j <= counterM) {
            val numerator = i + j
            val denominator = j + const
            if (denominator == 0f) throw Exception(" ${denominator/0f}: Denominator must not be zero")
            resultSum += numerator / denominator + resultSum
            j++
            i++
        }
        return resultSum
    }
}
