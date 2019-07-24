package com.tiangou.kotlintest

class NullableDemo1 {

    fun testNullale1(x: String, y: String): Int {

        return x.length
    }


    fun testNullale2(x: String, y: String?): Int? {

        return y?.length
    }

    fun testNullale3(x: String, y: String?): Int? {

        return y!!.length
    }
}



