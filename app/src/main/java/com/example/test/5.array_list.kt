package com.example.test

//5. Array and List
// Array : 이미 메모리가 할당이 되어서 나옴, mutable(값 변경 가능)
// List : 1. List(변경 불가능) 2. MutableList(변경 가능) - MutableList의 대표적인 예 : arrayList

fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "String", 3.4f) // 어떤 타입으로 넣어도 무관
    val list2 = listOf(2, "string", 11L) // 어떤 타입으로 넣어도 무관

    array[0] = 0 // array는 값 변경 가능
    // list[0] = 0 // list는 값 변경 불가능

    // List는 Array와 다르게 interface. 가져와서 어떤 값에 넣을 수 있지만 변경은 불가능
    var result = list.get(0)

    var arrayList = arrayListOf<Int>(1, 2) // 선언 및 초기화

    // add를 해도 주소값이 바뀌는 것은 아니기 때문에 val도 가능
    val arrayList2 = arrayListOf<Int>() //선언
    arrayList2.add(10) //초기
    arrayList2.add(20)

    // arrayList2 = arrayListOf() // 그러나 새로운 arrayList할당은 불가
}