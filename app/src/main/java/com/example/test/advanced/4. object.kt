package com.example.test.advanced

// 4. object
// object는 일반 class와 다르게 모든 앱을 실행할 때 딱 한 번 만들어진다. (Singleton Pattern)
// CarFactory라는 객체는 Car를 만들 때 사용된다.
// 이 때 CarFactory에 새로운 객체를 계속 만드는 게 아니라 실행이 될 때 class파일을 읽어와 그 때 딱 한 번 객체를 생성하고 다시는 객체를 생성하지 않음
// 불필요하게 사용되는 메모리를 막을 수 있다.

object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower: Int): Car{
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val housePower: Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}