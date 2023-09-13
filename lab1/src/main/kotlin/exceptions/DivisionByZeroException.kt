package exceptions

class DivisionByZeroException(private val result: Float) : Exception() {
    override val message: String?
        get() = "Division by zero: Result is $result"
}
