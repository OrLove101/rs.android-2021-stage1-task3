package subtask2

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val result = mutableListOf<Int>()
        var resultSquareSum: Int = 0
        var tempNumber: Int = number

        val squareNumber: Int = number*number

        while ( resultSquareSum != squareNumber ) {
            tempNumber--
            if ( resultSquareSum+tempNumber*tempNumber <= squareNumber ) {
                result.add(tempNumber*tempNumber)
            }
        }
        return result.asReversed().toTypedArray()
    }
}
