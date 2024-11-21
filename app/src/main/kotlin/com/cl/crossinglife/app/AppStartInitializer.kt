package com.cl.crossinglife.app

import android.content.Context
import androidx.startup.Initializer

/**
 * app 启动
 */
class AppStartInitializer : Initializer<Unit> {
    
    override fun create(context: Context) {
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return arrayListOf()
    }
}