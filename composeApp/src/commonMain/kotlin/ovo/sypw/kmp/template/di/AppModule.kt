package ovo.sypw.kmp.template.di

import org.koin.dsl.module

/**
 * 应用主模块
 * 聚合所有的依赖注入模块
 */
val appModule = module {
    includes(viewModelModule)
    includes(storageModule)
    includes(apiTestModule)
}
