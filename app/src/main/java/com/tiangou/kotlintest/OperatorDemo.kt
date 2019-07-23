package com.tiangou.kotlintest

class OperatorDemo {


}

data class Point(val x: Int, val y: Int)

//重载一元减运算符
operator fun Point.unaryMinus() = Point(-x, -y)