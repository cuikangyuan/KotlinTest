package com.tiangou.kotlintest

class NullableDemo {

    fun getLength1(str: String): Int {


        return str.length
    }


    fun getLength2(str: String?): Int? {


        //只能通过安全调用 ?. 或者非空断言调用 !!
        return str?.length


        //以下代码可能产生kotlin.KotlinNullPointerException
        //return str!!.length


    }
}



