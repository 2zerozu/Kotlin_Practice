package com.example.test

fun main(){
    helloWorld()
    add(2, 4)

    // 3. String Template
    val firstName = "Julie"
    val lastName = "Lee"
    println("I'm ${firstName + lastName} I'm 24") //${변수명 + 변수명 + ...}
    println("I'm ${firstName} ${lastName}") // 따로따로도 가능
    println("I wanna use \$dollar") // \$ = $표시만
    println("Is this true? ${0==1}")

    
}


//1. 함수
fun helloWorld() { // Unit = void return type 없어도 생략 가능
    println("Hello World! \n");
}

//fun 함수이름(변수명 : 타입) : 리턴타입
fun add(a : Int, b: Int) : Int {
    return a+b
}

//2. val vs var
//val = value (변하지 않는 값)
//var = variable (변할 수 있는 값)
fun hi(){
    val a: Int = 10
    // a = 20 //(오류 : 값 변경 불가능)
    var b: Int = 20
    b = 200 // 값 변경 가능

    // 초기화 해줄 경우 타입 생략 가능
    val c = 100
    var d = 200
    var name = "Yeongju"

    // 초기화하지 않는 경우 타입 생략 불가능
    //var e (오류)
    var e : String
    var f : Int
}

