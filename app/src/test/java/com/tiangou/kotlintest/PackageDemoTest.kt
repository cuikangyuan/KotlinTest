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
}