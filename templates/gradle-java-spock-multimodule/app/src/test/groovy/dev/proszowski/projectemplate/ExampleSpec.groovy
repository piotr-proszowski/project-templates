package dev.proszowski.projectemplate

import spock.lang.Specification

class ExampleSpec extends BaseSpec {

    def 'should add two numbers'() {
        given:
            int a = 1
            int b = 1
        when:
            int result = a + b
        then:
            result == 2
    }
}
