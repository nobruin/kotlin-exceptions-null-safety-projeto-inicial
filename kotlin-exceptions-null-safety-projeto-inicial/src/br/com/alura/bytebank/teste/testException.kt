fun TestException() {
    val input: Double? = try {
        "1.1".toDouble()
    } catch (e: NumberFormatException) {
        null
    }

    val input2 = earlyFun(input)

    val input3: String? = when {
        input != null -> "test"
        else -> null
    }

    println(input)
    println(input2)
    println(input3)
}


fun earlyFun(value: Double?): Double? {
    if(value != null) {
        return value + 0.1
    }
    return null
}