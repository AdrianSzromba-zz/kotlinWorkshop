package testCode

import org.junit.Test

class LambdaTest {

    @Test
    fun testAnonymousFunction() {

        val fun1 = fun() { // assign anonymous fun to variable
            print(123)
        }


//        val fun2 = fun(p1: Int): Int {
//            return p1 * p1
//        }
        val fun2 = fun(p1: Int) = p1 * p1 //One state fun can be shorter


        fun1()
        println(fun2(1))

        useFunctions(fun1)
        useFunctions2(fun1, fun2)
    }

    @Test
    fun testLambdaFunction() {

    }

    fun useFunctions(f1: () -> Unit) { // takes one argument of type: function
        f1() // call function that is passed as arg
    }

    fun useFunctions2(f1: () -> Unit, f2: (Int) -> Int) {
        f1()
        println(f2(10))
    }
}