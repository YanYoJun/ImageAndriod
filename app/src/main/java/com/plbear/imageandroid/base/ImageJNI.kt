package com.plbear.imageandroid.base

/**
 * created by yanyongjun on 2019-12-08
 */
object ImageJNI {
    init {
        System.loadLibrary("native-lib")
    }

    external fun helloworld(): String
}