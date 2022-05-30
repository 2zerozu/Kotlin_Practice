package com.example.test.advanced

// 1. Lambda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드에 파라미터로 넘길 수 있다.
// 2) return값으로 사용할 수 있다.

// 람다의 기본 정의
// val lambdaName : Type = {argumentList -> codeBody}

//타입을 적어놨기 때문에 타입추론 가능
//중괄호를 사용해서 함수를 변수 안에 넣을 수 있다.
val square: (Int) -> (Int) = { number -> number * number }
val square2 = { number: Int -> number * number }

val nameAge = { name: String, age: Int -> "I'm ${name} and I'm ${age}" }

fun main() {
//    println(square(12))
//    println(square2(10))
//    println(nameAge("Julie", 22))
//
//    val a = "Julie said "
//    val b = "Amanda said "
//    println(a.pizzaIsGreat())
//    println(b.pizzaIsGreat())
//
//    println(extendString("Julie", 22))
//
//    println(calculate(90))

    //1-4. 람다를 표현하는 여러가지 방식
    val lambda = { number: Double -> number == 4.123 }
    println(invokeLambda(lambda))

    println(invokeLambda({ it > 1.234 }))

    //함수의 마지막 파라미터가 람다식일 경우 소괄호 생략 가능. it은 하나 들어가는 Int 파라미터
    println(invokeLambda({ it > 1.234  }))
    println(invokeLambda() { it > 1.234 })
    println(invokeLambda { it > 1.234 })
}

//1-2. 확장함수
val pizzaIsGreat: String.() -> String = {
    this + "pizza is the best!!"
}

fun extendString(name: String, age: Int): String {
    val introduceMyself: String.(Int) -> String =
        { "I am ${this}, and I'm ${it} years old" } // this가 가리키는 것은 확장함수가 불러줄 오브젝트(String). Int(파라미터)는 it으로 사용됨
    return name.introduceMyself(22)
}

//1-3. 람다의 return
// Int형은 꼭 소괄호 써주기
val calculate: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//1-4. 람다를 표현하는 여러가지 방식 (main함수에 설명 있음)
fun invokeLambda(lambda: (Double) -> Boolean): Boolean {
    return lambda(3.141592)
}

//1-5. 익명 내부 함수 (LambdaActivity에 설명 있음)
