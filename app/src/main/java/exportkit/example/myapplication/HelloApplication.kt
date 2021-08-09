package exportkit.example.myapplication

import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.koin.core.context.startKoin

class HelloApplication: KoinComponent {
    val helloService: HelloService by inject()
    fun sayHello()= println(helloService.hello())

}

fun main(){
    startKoin{
        printLogger()
        modules(helloModule)
    }
    HelloApplication().sayHello()
}