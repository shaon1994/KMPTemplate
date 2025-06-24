package ovo.sypw.kmp.template.di

import ovo.sypw.kmp.template.data.storage.LocalStorage

/**
 * Desktop平台的LocalStorage创建函数
 * 直接创建LocalStorage实例，无需额外参数
 */
actual fun createLocalStorage(): LocalStorage {
    return LocalStorage()
}