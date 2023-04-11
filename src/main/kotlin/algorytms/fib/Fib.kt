import java.math.BigInteger

val fibMap = mutableMapOf<BigInteger, BigInteger>()
val zero = "0".toBigInteger()
val one = "1".toBigInteger()
val two = "2".toBigInteger()
var counter = 0
fun main() {
    val number = readln().toBigInteger()
    println("Fib Old")
    println(fib2(number))
    println(counter)
    counter = 0
    fibMap.clear()
    println("Fib New")
    println(fib(number))
    println(counter)
    //println(fibMap)
}

fun fib(number: BigInteger): BigInteger {
    counter += 1;
    when (number) {
        zero -> {
            fibMap[number] = zero
            return zero
        }

        one -> {
            fibMap[number] = one
            return one
        }

        else -> {
            if (fibMap[number] != null) {
                return fibMap[number]!!
            }

            val n1 = fibMap[number - two]
            val n2 = fibMap[number - one]
            if (n1 != null && n2 != null) {
                val n = n1 + n2
                fibMap[number] = n
                return n
            } else {
                if (n1 != null) {
                    val n = n1 + fib(number - one)
                    fibMap[number] = n
                    return n
                }
                if (n2 != null) {
                    val n = fib(number - two) + n2
                    fibMap[number] = n
                    return n
                }
                val n = fib(number - two) + fib(number - one)
                fibMap[number] = n
                return n
            }
        }
    }
}

fun fib2(number: BigInteger): BigInteger {
    counter += 1;
    when (number) {
        zero -> {
            fibMap[number] = zero
            return zero
        }

        one -> {
            fibMap[number] = one
            return one
        }

        else -> {
            if (fibMap[number] != null) {
                return fibMap[number]!!
            }
            val n = fib(number - two) + fib(number - one)
            fibMap[number] = n
            return n
        }
    }
}