package com.tiangou.kotlintest

import now
import Car
import org.junit.Assert

import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class PackageDemoTest {


    @Test
    fun testWhat() {

        what()
    }

    @Test
    fun testDriveMotorbike() {

        val motorbike = Motorbike()

        motorbike.drive()
    }


    @Test
    fun testDefaultPackage() {


        now()


        val car = Car()
        car.drive()

    }

    @Test
    fun testGetLength() {


        val variableVSValue = VariableVSValue()

        val obj = "abcdef"

        val len = variableVSValue.getLength(obj)

        Assert.assertTrue(len == 6)

        println(len)

        val obj2:Any = Any()

        val length = variableVSValue.getLength(obj2)

        println(length)

    }

    @Test
    fun testCases() {


        val variableVSValue = VariableVSValue()

        //variableVSValue.cases(2)

        //variableVSValue.switch2(123)


        variableVSValue.breakDemo_2()

    }


    @Test
    fun testThisDemo() {

        val demo = ThisDemo()

        println(demo.whatIsThis())
    }

    @Test
    fun testThisKeyWord() {

        val outer = Outer()

        outer.Inner().m()
    }

    @Test
    fun testSuperKeyWord() {

        val son = Son("Harry")

        son.love()
    }

    @Test
    fun testPointUnaryMinus() {

        val p = Point(1, 1)

        val np = -p

        println(np)
    }
}