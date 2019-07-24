package com.tiangou.kotlintest

//属性扩展
val <T> List<T>.mylastIndex: Int get() = size - 1

//函数扩展
fun String.notEmpty(): Boolean {

    return !this.isEmpty()
}

//函数扩展
fun MutableList<Int>.swap(index1: Int, index2: Int) {


    val tmp = this[index1]

    this[index1] = this[index2]

    this[index2] = tmp
}

fun <T> MutableList<T>.mswap(index1: Int, index2: Int) {


    val tmp = this[index1]

    this[index1] = this[index2]

    this[index2] = tmp
}

class ExtensionDemo {

    fun useExtensions() {


        val a = "abc"
        println(a.notEmpty())

        val mList = mutableListOf<Int>(1, 2, 3, 4, 5)
        println("Before Swap: ")
        println(mList)
        //mList.swap(0, mList.size - 1)

        mList.swap(0, mList.mylastIndex)


        println("After Swap: ")
        println(mList)


        val mmList = mutableListOf<String>("a12", "b34", "c56", "d78")
        println("Before Swap: ")
        println(mmList)
        mList.mswap(1, 2)
        println("After Swap: ")
        println(mmList)

        val mmmList = mutableListOf<Int>(100, 200, 300, 400, 500)
        println("Before Swap: ")
        println(mmmList)
        mmmList.mswap(1, 2)
        println("After Swap: ")
        println(mmmList)


    }

    class Inner {

        fun useExtensions() {

            val mmmList = mutableListOf<Int>(100, 200, 300, 400, 500)

            println(mmmList.mylastIndex)

        }

    }
}