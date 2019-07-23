package com.tiangou.kotlintest

class Outer {


    val oh = "Oh!"

    inner class Inner {

        fun m() {

            val outer = this@Outer

            val inner = this@Inner

            val pthis = this


            println("outer = " + outer)

            println("inner = " + inner)

            println("pthis = " + pthis)

            println(this@Outer.oh)

            val fun1 = hello@ fun String.() {

                val d1 = this //fun1的接收者
                println("d1 " + d1)
            }


            val fun2 = { s:String ->

                val d2 = this

                println("d2 = " + d2)

            }

            "abc".fun1()

            fun2


        }



    }
}