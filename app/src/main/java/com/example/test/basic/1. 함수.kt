package com.example.test.basic

fun main(){
    helloWorld()
    add(2, 3)
}
//1. 함수
private fun helloWorld() { // Unit = void return type 없어도 생략 가능
    println("Hello World! \n");
}

//fun 함수이름(변수명 : 타입) : 리턴타입
private fun add(a: Int, b: Int): Int {
    return a + b
}