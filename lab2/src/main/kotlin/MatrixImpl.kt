class MatrixImpl: Matrix {
    override fun toSumTwoMatrixAndGetAverageRow(matrix1: Array<Array<Char>>, matrix2: Array<Array<Char>>): Array<Float> {
        if (matrix1.isEmpty() || matrix2.isEmpty()) {
            throw IllegalArgumentException("Matrices should not be empty")
        }

        if (matrix1.size != matrix2.size || matrix1[0].size != matrix2[0].size) {
            throw IllegalArgumentException("Matrices should have the same dimensions")

        }

        if (matrix1[0].size < 2) {
            throw IllegalArgumentException("Matrices should have at least 2 columns")
        }

        if (matrix1.size < 2) {
            throw IllegalArgumentException("Matrices should have at least 2 rows")
        }

        for (i in matrix1.indices) {
            for (j in matrix1[0].indices) {
                if (matrix1[i][j] !in '0'..'9' || matrix2[i][j] !in '0'..'9') {
                    throw IllegalArgumentException("Matrices should contain only digits")
                }
            }
        }


        val resultMatrix = Array(matrix1.size) { Array(matrix1[0].size) { 0 } }
        val averageRow = Array(matrix1.size) { 0f }

        for (i in matrix1.indices) {
            for (j in matrix1[0].indices) {
                resultMatrix[i][j] = matrix1[i][j].toString().toInt() + matrix2[i][j].toString().toInt()
            }
        }

        println("Result matrix: "+resultMatrix.contentDeepToString())

        for (i in resultMatrix.indices) {
            var sum = 0
            for (j in resultMatrix[0].indices) {
                sum += resultMatrix[i][j]
            }
            averageRow[i] = sum.toFloat() / resultMatrix[0].size
        }

        return averageRow
    }
}