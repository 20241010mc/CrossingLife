package com.cl.core.exts

import android.text.TextUtils

/**
 * 转换字符串为long 包含字符转为空情况, 字符串为空则转换为 0
 */
fun String.toLongOrZero() = try {
    if (TextUtils.isEmpty(this)) {
        0L
    } else {
        this.toLong()
    }
} catch (e: Exception) {
    e.printStackTrace()
    0L
}