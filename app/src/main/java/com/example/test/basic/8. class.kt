package com.example.test.basic

// 8. class
// 파일 이름과 class 이름이 일치하지 않아도 됨
// 여러 class를 한 파일에 넣어도 됨

fun main() {
//    val human = Human()
//    human.eatingCake()
//    println("I'm ${human.name}")
//
//    val human2 = Human2("Amanda")
//    println("She is ${human2.name}")
//    val human3 = Human3("Yuya")
//    println("He is ${human3.name}")
//    val stranger = Human3() // default값을 넣어줘서 name을 넣지 않아도 됨
//    println("That guy is ${stranger.name}")

    //val intro = Human3("Julie", 22)
    val korean = Korean()
    korean.singASong()
}

class Human {
    val name = "Julie"
    fun eatingCake() {
        println("This cake is so yummy")
    }
}

class Human2 constructor(name: String){
    val name = name
}

//Korean 클래스에 상속받기 위해 open class 해줌
open class Human3 (val name: String = "Anonymous"){ // Human2와 같은 함수, 다른 점은 default값을 넣어줌
    // 부 생성자
    constructor(name: String, age: Int) : this(){ //this로 name을 받아와야함
        println("I'm ${name}, and I'm ${age}")
    }

    init{ // 주 생성자 생성
        println("New human has been born!!")
    }

    //override를 하기 위해서는 open해주어야 함
    open fun singASong(){
        println("lalala")
    }
}

//코틀린의 클래스는 기본적으로 final class임 -> 아무리 같은 파일에 있더라도 접근 불가
//따라서 상속을 받으려면 클래스를 open해주어야 함
//오버라이딩 : 부모의 클래스를 자식의 클래스에 오버라이딩 한다, 덮어 씌운다
//상속은 하나만 가능!
//fun에서는 : 뒤에 리턴형이 오지만 class에서는 : 뒤에 상속 클래스가 옴
class Korean : Human3(){
    override fun singASong(){
        super.singASong() // 기존의 것을 사용하고 싶을 때는 super 사
        println("랄랄라") // 기존의 singASong을 덮어씌움
        println("You are ${name}") // Human3을 상속받을 때 생성자에 default가 있기 때문에 파라미터를 쓰지 않아도 Anonymous를 name으로 받아옴
    }
}