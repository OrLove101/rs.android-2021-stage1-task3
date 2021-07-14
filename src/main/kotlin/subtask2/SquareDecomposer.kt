package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if ( number < 5 ) {
            return null
        }

        val squareNumber = number * number

        return decomposer(squareNumber, number-1)
    }

    private fun decomposer(squareNumber: Int, prevDigit: Int): Array<Int>? {
        for ( decomposedDigit in prevDigit downTo 1 ) {
            val numResult = squareNumber - decomposedDigit * decomposedDigit

            if ( numResult == 0 ) return arrayOf(decomposedDigit)
            else if ( numResult < 0 ) return null

            val nextNumber = sqrt(numResult.toDouble()).toInt()
            val result = if ( nextNumber >= decomposedDigit ) {
                decomposer(numResult, decomposedDigit - 1)
            } else {
                decomposer(numResult, nextNumber)
            }
            if (result != null) return result + arrayOf(decomposedDigit)
        }
        return null
    }
}
