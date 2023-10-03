package com.carlostorres.airlinebooking.domain.presentation

import java.lang.StringBuilder

//Generics
interface Formatter<T> {

    fun format(t: T): String

    fun format(ts: List<T>): String {

        val stringBiulder = StringBuilder()

        ts.forEach {
            stringBiulder.appendLine(format(it))
        }

        return stringBiulder.toString()

    }

}