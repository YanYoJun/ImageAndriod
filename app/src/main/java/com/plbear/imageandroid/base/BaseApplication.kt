package com.plbear.imageandroid.base

import android.app.Application

/**
 * created by yanyongjun on 2019-12-08
 */
class BaseApplication : Application() {
    companion object {
        lateinit var instance: Application
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}