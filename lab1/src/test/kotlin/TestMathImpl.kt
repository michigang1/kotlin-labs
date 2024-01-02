import exceptions.DivisionByZeroException
import exceptions.FloorMoreThanCeilException
import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertNotNull

class TestMathImpl {
    val math = MathImpl()

    @Test
    fun `denominator equals to zero`() {
        val thrown = assertThrows<DivisionByZeroException> {
            math.getDoubleSum(1f, 5, -2f, 5)
        }
        assertNotNull(thrown.message)
    }

    @Test
    fun `floor is more than ceil`() {
        val thrown = assertThrows<FloorMoreThanCeilException> {
            math.getDoubleSum(1f, -5, 2f, 1)
        }
        assertNotNull(thrown.message)
    }

    @Test
    fun `first exception in stacktrace is FloorMoreThanCeilException`() {
        val thrown = assertThrows<FloorMoreThanCeilException> {
            math.getDoubleSum(1f, -5, -2f, 1)
        }
        assertNotNull(thrown.message)
    }

    @Test
    fun `cheking the correctness of the result`() {
        val result1 = math.getDoubleSum(3f, 13, -5f, 7)
        assert(result1 == 126.9f)
    }
}
