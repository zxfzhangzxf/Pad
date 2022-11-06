package com.android.pad

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
//该文件用于全局获取context
class PadApplication : Application() {
    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context : Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}