package com.tiangou.kotlintest

import java.lang.Integer.parseInt
import java.util.*

class VariableVSValue {

    fun declareVar() {

        var a = 1

        a = 2

        println(a)

        println(a::class)

        println(a::class.java)

        var x = 5

        x += 1

        println("x = $x")

    }

    fun declareVal() {

        val b = "a"

        //b = "b"

        println(b)

        println(b::class)

        println(b::class.java)

        val c: Int = 1

        val d = 2

        val e: Int

        e = 3

        println("c = $c, d = $d, e = $e")

    }

    fun typeInference() {

        val str = "abc"

        println(str)
        println(str is String)
        println(str::class)
        println(str::class.java)

        val d = Date()
        println(d)
        println(d is Date)
        println(d::class)
        println(d::class.java)

        val bool = true
        println(bool)
        println(bool::class)
        println(bool::class.java)

        val array = arrayOf(1, 2, 3)
        println(array)
        println(array is Array)
        println(array::class)
        println(array::class.java)

    }

    fun Int2Long() {

        val x:Int = 10

        //val y:Long = x //Type mismatch

        val y:Long = x.toLong()

    }

    fun getLength(obj: Any): Int? {

        var result = 0

        if(obj is String) {

            //'obj' 在该条件分支内自动转换成 'String'

            println(obj::class)

            result = obj.length


            //println(result)
        }

        // 在离开类型检测分支后 'obj' 仍然是 'Any'类型
        println(obj::class)
        return result

    }

    fun cases(obj: Any) {

        when(obj) {
            1 -> print("第一项")
            "hello" -> print("这是字符串hello")
            is Long -> print("这是Long类型")
            !is String -> print("这不是String类型的数据")
            else -> print("else类似于Java中的default")
        }
    }

    fun switch1(x: Any) {

        when(x) {
            -1, 0 -> print("x == -1 or x ==0")
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> {
                print("x is neither 1 nor 2")
            }
        }
    }

    fun switch2(x: Int) {

        val s = "123"

        when(x) {
            -1, 0 -> print("x == -1 or x ==0")
            1 -> print("x == 1")
            2 -> print("x == 2")
            8 -> print("x is 8")
            parseInt(s) -> print("x is 123")
            else -> {
                print("x is neither 1 nor 2")
            }
        }
    }


    fun switch3() {

        val x = 11111
        val validNumbers = arrayOf(99, 100, 101)

        when(x) {
            in 1..10 -> print("x is in the range")
            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")

        }
    }

    fun testFor() {


        val args = arrayOf(1, 2, 3)

        for (arg in args) {

            print(arg)
            print(" ")
        }


        println()

        for (i in args.indices) {

            print(args[i])
            print(" ")

        }

        println()


        for ((index, value) in args.withIndex()) {

            println("the element at $index is $value")

        }
    }

    fun sum(a: Int, b: Int): Int {
        return a+b
    }

    fun max(a: Int, b: Int): Int {

        if (a > b) {

            return a

        } else {

            return b
        }
    }

    fun sum1(a: Int, b: Int) = a + b


    fun sumf(a: Int, b: Int) = {a + b}

    //以上两者完全不同



    fun sum2(a: Int, b: Int) = if (a > b) a else b


    //1
    //2
    fun returnDemo_1() {

        println(" START " + ::returnDemo_1.name)

        val intArray = intArrayOf(1, 2, 3, 4,5)

        intArray.forEach {

            if(it == 3) {

                return

            }

            println(it)


        }

        println(" END " + ::returnDemo_1.name)

    }


    //1
    //2
    //4
    //5
    fun returnDemo_2() {

        println(" START " + ::returnDemo_2.name)

        val intArray = intArrayOf(1, 2, 3, 4,5)

        intArray.forEach (fun(a: Int) {

            if (a == 3) {

                return
            }

            println(a)

        })

        println(" END " + ::returnDemo_2.name)

    }

    fun returnDemo_3() {

        println(" START " + ::returnDemo_3.name)

        val intArray = intArrayOf(1, 2, 3, 4,5)

        intArray.forEach here@ {

            if (it == 3) {

                //return

                //指令跳转到 lambda 表达式标签here 处 继续下一个 it 4的循环
                return@here
            }

            println(it)

        }

        println(" END " + ::returnDemo_3.name)

    }

    fun returnDemo_4() {

        println(" START " + ::returnDemo_4.name)

        val intArray = intArrayOf(1, 2, 3, 4,5)

        intArray.forEach {

            if (it == 3) {

                //return

                //从lambda表达式 @forEach处返回
                return@forEach
            }

            println(it)

        }

        println(" END " + ::returnDemo_4.name)

    }

    fun breakDemo_1() {

        println("-----------breakDemo_1--------------")

        for (outer in 1..5) {

            println("outer = " + outer)

            for (inner in 1..5) {

                println("inner = " + inner)

                if (inner % 2 == 0) {

                    break
                }
            }

        }

    }

    fun breakDemo_2() {

        println("-----------breakDemo_2--------------")

        outer@for (outer in 1..5) {

            println("outer = " + outer)


            for (inner in 1..5) {

                println("inner = " + inner)


                if (inner % 2 == 0) {

                    break@outer
                }
            }

        }

    }

    val sum = fun Int.(x:Int):Int = this + x

    val concat = fun String.(x:Any) = this + x

}