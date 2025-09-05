package lab.monilabback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MonilabBackApplication

fun main(args: Array<String>) {
    runApplication<MonilabBackApplication>(*args)
}
