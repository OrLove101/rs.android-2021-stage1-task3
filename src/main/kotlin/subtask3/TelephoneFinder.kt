package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        val number = number.toCharArray()
        val result = mutableListOf<String>()
        val adjacentDigits = mapOf<String, String>(
            "0" to "8",
            "1" to "24",
            "2" to "135",
            "3" to "26",
            "4" to "157",
            "5" to "2648",
            "6" to "359",
            "7" to "48",
            "8" to "7590",
            "9" to "86"
        )

        for ((index, element) in number.withIndex()) {
            if ( element in '0'..'9' ) {
                val adjacent: String = adjacentDigits[element.toString()] ?: ""

                for (char in adjacent) {
                    val tempNumber = number.copyOf()
                    var adjacentNumber = ""

                    tempNumber[index] = char
                    for (element in tempNumber) {
                        adjacentNumber += element
                    }
                    result.add(adjacentNumber)
                }
            } else {
                return null
            }
        }
        return result.toTypedArray()
    }
}
