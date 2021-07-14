package subtask1

import java.lang.ArithmeticException

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var result: Long = 1
        var m = array[0].toLong() // number of posters to design
        var n = array[1].toLong() // total number available colors

        if ( m < 0 || n <= 0) {
            return null
        }
        // m = n!/(n-k)!*k!

        try {
            while (m != factorial(n)/(factorial(n-result)*factorial(result))) {
                result++
            }
        } catch (e: ArithmeticException) {
            return null
        }

        return result.toInt()
    }


}

fun factorial(num: Long): Long {
    var factorial = 1L
    for (i in 1..num) {
        factorial *= i
    }
    return factorial
}

fun main(args: Array<String>) {
    var result = 1

    print(factorial(2)/(factorial(2)*factorial(2)))
}
