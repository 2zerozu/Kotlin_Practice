package com.example.test

fun main() {
    maxBy(2, 4)
    maxBy2(3, 5)
    checkNum(1)

}

//4. 조건식
private fun maxBy(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}

private fun maxBy2(a: Int, b: Int) = if (a > b) a else b // return 타입 생략 가능

private fun checkNum(score: Int) {
    when (score) {
        0 -> println("This is 0")
        1 -> println("This is 1")
        2, 3 -> println("This is 2 or 3")
        else -> println("I don't know") //else 생략 가능
    }
    var b = when (score) {
        1 -> 10
        2 -> 20
        else -> 100 //else 생략 불가능
    }

    println("b : ${b}")

    when (score) {
        in 0..50 -> println("not good")
        in 50..90 -> println("not bad")
        in 90..100 -> println("Nice!")
        else -> println("I don't know") // else 생략 가능
    }
}