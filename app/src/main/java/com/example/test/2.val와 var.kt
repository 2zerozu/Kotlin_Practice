package com.example.test

fun main(){
    hi()
}

//2. val vs var
//val = value (변하지 않는 값)
//var = variable (변할 수 있는 값)
private fun hi() {
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
    var e: String
    var f: Int
}