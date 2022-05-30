package com.example.test.advanced

//property(프로퍼티) : 코틀린에서 클래스 변수, 즉 val과 var로 선언되는 변수들이 프로퍼티임!
//프로퍼티는 getter와 setter가 내장되어 있음.
//프로퍼티를 선언할 때 초깃값과 get(), set()은 선택사항
//var로 선언한 변수는 get(), set()이 추가되고, val로 선언한 변수는 값을 변경할 수 없어서 get()만 추가된다!



data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber: Int)
    //변수를 선언해줘서 이 각각은 클래스의 프로퍼티처럼 사용 가능
    //constructor 만듦
    //toString(), hashCode(), equals(), copy()가 자동으로 만들어짐

class TicketClass(val companyName: String, val name: String, var date: String, var seatNumber: Int)

fun main(){
    val ticketA = Ticket("UnitedAirline", "Julie Lee", "31/May/2022", 20)
    val ticketB = TicketClass("UnitedAirline", "Julie Lee", "31/May/2022", 20)

    println(ticketA) // data class는 우리가 보기 쉽게 변환해서 보여주는 것임
    println(ticketB) // 그냥 class를 print하면 메모리 주소값이 나옴
}