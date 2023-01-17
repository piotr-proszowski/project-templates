package dev.proszowski.projectemplate

class ExampleIntSpec extends BaseIntSpec {
    def 'should add two numbers'() {
        given:
            int a = 1
            int b = 2
        when:
            int result = a + b
        then:
            result == 3
    }
}
