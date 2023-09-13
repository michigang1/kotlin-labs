package exceptions

class FloorMoreThanCeilException : Exception() {
    override val message: String
        get() = "Floor must be less than ceil"
}
