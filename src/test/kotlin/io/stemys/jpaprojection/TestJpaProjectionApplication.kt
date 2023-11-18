package io.stemys.jpaprojection

import org.springframework.boot.fromApplication
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.boot.with

@TestConfiguration(proxyBeanMethods = false)
class TestJpaProjectionApplication

fun main(args: Array<String>) {
	fromApplication<JpaProjectionApplication>().with(TestJpaProjectionApplication::class).run(*args)
}
