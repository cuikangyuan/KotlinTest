package com.tiangou.kotlintest


fun isOdd(x: Int) = x % 2 != 0

fun length(s: String) = s.length


fun<A, B, C> compose(f: (B) -> C, g: (A) -> B) : (A) -> C {

    return { x -> f(g(x))}
}



