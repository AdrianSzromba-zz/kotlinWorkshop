package testCode

import org.junit.Test

class LambdaTest {

    @Test
    fun testAnonymousFunction() {

        val fun1 = fun() { // assign anonymous fun to variable
            print(123)
        }

        val fun2 = fun(p1: Int): Int {
            return p1 * p1
        }

        fun1()
        println(fun2(1))
    }
}