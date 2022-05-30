package com.example.test.advanced

// 3. companion object
// companion object는 자바의 static 대신에 사용됨
// 정적인 메소드나 정적인 변수를 선언할 때 사용됨

class Book private constructor(
    val serialNum: Int,
    val name: String
) { // private를 통해 다른 곳에서는 객체를 생성하지 못하게 할 수 있음

    //companion object는 private 프로퍼티나 메소드를 읽어올 수 있게끔 한다
    companion object BookFactory: IDProvider{
        override fun getID(): Int {
            return 33
        }

        val myBook = "new book"
        fun create() = Book(22, "누가 내 머리에 똥 쌌어")
        fun create2() = Book(getID(), myBook)
    }
}

interface IDProvider {
    fun getID(): Int
}

fun main() {
    // val book = Book(1, "Hello") // private로 선언해서 사용할 수 없음
    val book = Book.create()
    val book2 = Book.create2()
    val bookID = Book.BookFactory.getID()

    println("${book.serialNum}, ${book.name}")
    println("${book2.serialNum}, ${book2.name}")
}