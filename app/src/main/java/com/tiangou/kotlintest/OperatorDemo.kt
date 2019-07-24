package com.tiangou.kotlintest

class OperatorDemo {


}

data class Point(val x: Int, val y: Int)

//重载一元减运算符
operator fun Point.unaryMinus() = Point(-x, -y)



data class Counter(var index: Int)

operator fun Counter.plus(increment: Int): Counter {


    return Counter(index + increment)

}

data class Person(val name: String, val age: Int)

infix fun Person.grow(years: Int) : Person {

    return Person(name, age + years)
}



