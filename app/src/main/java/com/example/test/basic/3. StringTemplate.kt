package com.example.test.basic

fun main(){
    stringTemplate()
}

private fun stringTemplate(){
    // 3. String Template
    val firstName = "Julie"
    val lastName = "Lee"
    println("I'm ${firstName + lastName} I'm 24") //${변수명 + 변수명 + ...}
    println("I'm ${firstName} ${lastName}") // 따로따로도 가능
    println("I wanna use \$dollar") // \$ = $표시만
    println("Is this true? ${0 == 1}")
}