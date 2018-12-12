package testCode

import org.junit.Test

class LambdaTest {

    @Test
    fun testAnonymousFunction() {

        // later, We can pass this variable to other functions
        val fun1 = fun() { // assign anonymous fun to variable (anonymous because don't have a name)
            print(123)
        }

//        val fun2 = fun(p1: Int): Int {
//            return p1 * p1
//        }
        val fun2 = fun(p1: Int) = p1 * p1 //One state fun can be shorter

        useFunctions2(fun1, fun2)
        useFunctions2(fun() {print(123)}, fun(p1) = p1 * p1)
    }

    @Test
    fun testLambdaFunction() {
        val fun1 = { print(123) } //like anonymous fun, but delete word fun() if no args

        val fun2 = { p1:Int -> p1 * p1 }

        useFunctions2(fun1, fun2)
        useFunctions2({print(123)}, { p1:Int -> p1 * p1 }) //if there is one argument, can replace p1 by word 'it'
        useFunctions2({print(123)}, { it * it }) // and skip first part
    }

    fun useFunctions(f1: () -> Unit) { // takes one argument of type: function
        f1() // call function that is passed as arg
    }

    fun useFunctions2(f1: () -> Unit, f2: (Int) -> Int) {
        f1()
        println(f2(10))
    }
}