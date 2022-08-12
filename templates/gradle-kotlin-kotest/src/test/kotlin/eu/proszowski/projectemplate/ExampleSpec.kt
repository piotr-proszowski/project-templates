package eu.proszowski.projectemplate

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ExampleSpec : FunSpec() {

    init {
        test("should sum up properly") {
            // given
            val a = 1
            val b = 2

            // when
            val actual = a + b

            // then
            actual shouldBe 3
        }
    }
}
