import java.lang.Exception
import kotlin.system.exitProcess

class MathImpl : Math {
    override fun getDoubleSum(a: Float, n: Int, b: Float, m: Int): Float {
        val const = Constants.C
        var i = a
        var j = b
        val counterN = if (n >= 0) n else exitProcess(1)
        val counterM = if (m >= 0) m else exitProcess(1)
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
