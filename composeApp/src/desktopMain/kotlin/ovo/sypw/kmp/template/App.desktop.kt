package ovo.sypw.kmp.template

import androidx.compose.runtime.Composable
import org.koin.compose.KoinApplication
import org.koin.dsl.module
import ovo.sypw.kmp.template.di.appModule
import ovo.sypw.kmp.template.utils.file.FileUtils
import ovo.sypw.kmp.template.utils.file.createFileUtils

/**
 * Desktop 平台的 Koin 应用初始化
 */
@Composable
actual fun PlatformKoinApplication(content: @Composable () -> Unit) {
    KoinApplication(
        application = {
            modules(appModule)
            modules(module {
                single<FileUtils> {
                    createFileUtils()
                }
            })
        }
    ) {
        content()
    }
}