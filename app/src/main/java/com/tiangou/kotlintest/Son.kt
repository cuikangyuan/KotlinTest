package com.tiangou.kotlintest

class Son: Father {


    override var firstName = super.firstName

    override var lastName = "Jack"


    constructor(lastName: String) {

        this.lastName = lastName

    }



    fun love() {
        //调用父类方法
        super.ff()

        println(super.firstName + " " + super.lastName + " LOVE " + this.firstName + " " + this.lastName)
    }


}