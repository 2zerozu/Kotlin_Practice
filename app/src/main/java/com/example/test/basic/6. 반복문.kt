package com.example.test.basic

fun main(){
    for_()
    while_()
}

//6. 반복문
//for and while

private fun for_() {
    val students = arrayListOf("Julie", "Amanda", "Yuya", "Vitor", "Kao", "Han")

    for (name in students) {
        println("${name}")
    }

    var index = 0
    for((index, name) in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum = 0
    for (i in 1..10) {
        sum += i // 55
    }
    println(sum)

    for (i in 1..10 step 2) { //1부터 2 간격으로
        println(i) // 1, 3, 5, 7, 9
    }

    for (i in 10 downTo 1 step 2) { // 10부터 1까지 2 간격으로
        println(i) // 10, 8, 6, 4, 2
    }

    sum = 0
    for (i in 1 until 10) { // 1부터 9까지
        sum += i // 45
    }
    println(sum)
}

private fun while_(){
    var index = 0
    while(index<10){
        println("current index : ${index}")
        index++
    }
}