fun fib(n: Int): Long {
    return if (n < 2) {
        1
    } else {
        fib(n-1) + fib(n-2)
    }
}//fib

fun main() {

    //Fibonacci 1
    val fibonacci1 = fib(1)
    println("fibonacci 1: "+fibonacci1)

    //Fibonacci 5
    val fibonacci5 = fib(5)
    println("fibonacci 5: "+fibonacci5)

    //Fibonacci 10
    val fibonacci10 = fib(10)
    println("fibonacci 10: "+fibonacci10)

    //Fibonacci 20
    val fibonacci20 = fib(20)
    println("fibonacci 20: "+fibonacci20)

}//main