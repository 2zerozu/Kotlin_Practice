package com.example.test

//7. Nullable / NonNull

fun nullCheck() {
    //NPE : Null Pointer Exception

    var name: String = "Julie"
    // var nullName : String = null // String 타입은 null일 수 없음
    var nullName: String? = null // ?만 붙여주면 nullable 타입이 . ?를 넣어줘야하기 때문에 타입 생략 불가능
    var nameInUpperCase = name.uppercase()
    var nullNameInUpperCase =
        nullName?.uppercase() //nullName이 null이면 null을 반환하고 null이 아니면 uppercase를 실행해라.

    // ?: -> 엘비스 연산자
    val lastName: String? = "Lee"
    val fullName =
        name + " " + (lastName ?: "No lastName") // lastName이 null이면 옆에 문구 반환, null이 아니면 lastName 출력
    println(fullName)
}

// !!
fun ignoreNull(str: String?) { // str은 null일 수도 있고 아닐 수도 있다.
    // val mNotNull : String = str // str이 null일 수도 있기 때문에 에러
    val mNoteNull: String = str!! // !!을 붙여주면 null이 아니라는 것을 보증
    val upper = mNoteNull.uppercase() // ?를 쓰지 않아도 됨
    println(upper)
    //!!는 정말 확실하지 않는 이상 사용을 지양할

    val email: String? = "yungju9982@naver.com "
    // let : 자신의 receiver 객체를 람다식 내부로 옮겨서 실행하는 구문
    email?.let{ //email이 null이 아니면 let을 실행해라 (null인 경우 실행되지 않아 안전함)
        println("My email is ${email}")
        println("My email is ${it}") // it으로도 사용 가능하다
    }

}