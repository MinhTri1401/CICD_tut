package exportkit.example.myapplication

import org.koin.dsl.module

val helloModule = module {

    single { HelloMessageData() }

    single { HelloServiceImpl(get()) as HelloService }
}