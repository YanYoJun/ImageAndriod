package com.plbear.imageandroid.utils

import android.util.Log

/**
 * created by yanyongjun on 2019-12-08
 */
fun log(str: String?) {
    if (str == null) {
        Log.e("imdemo", "null")
        return
    }
    Log.e("imdemo", str)
}

fun log(e: Throwable?) {
    if (e == null) {
        Log.e("imdemo", "e is null")
        return
    }
    log(e.message)
    e.stackTrace.forEach {
        log(it.toString())
    }
}