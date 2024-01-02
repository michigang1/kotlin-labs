
//C5 = 3 C7 = 5 C11 = 8
fun main() {
    val matrix = MatrixImpl()
    val matrix1 = arrayOf(
        arrayOf('3', '2', '1'),
        arrayOf('6', '8', '6'),
        arrayOf('5', '8', '3')
    )
    val matrix2 = arrayOf(
        arrayOf('1', '2', '3'),
        arrayOf('4', '5', '6'),
        arrayOf('7', '8', '9')
    )
    val result = matrix.toSumTwoMatrixAndGetAverageRow(matrix1, matrix2)
    println(result.contentToString())
}