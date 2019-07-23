package com.tiangou.kotlintest

class ThisDemo {

    var thisis = "THIS IS"

    fun whatIsThis(): ThisDemo {

        //引用变量
        println(this.thisis)

        this.howIsThis()

        return this

    }


    fun howIsThis() {
        println("HOW IS THIS")
    }
}