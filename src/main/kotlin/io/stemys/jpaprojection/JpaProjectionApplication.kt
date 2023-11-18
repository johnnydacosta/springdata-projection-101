package io.stemys.jpaprojection

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaProjectionApplication

fun main(args: Array<String>) {
	runApplication<JpaProjectionApplication>(*args)
}
