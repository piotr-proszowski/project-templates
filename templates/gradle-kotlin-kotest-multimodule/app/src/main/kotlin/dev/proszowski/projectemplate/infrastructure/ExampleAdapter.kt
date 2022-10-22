package dev.proszowski.projectemplate.infrastructure

import dev.proszowski.projectemplate.application.ports.SomeUsefulRepository
import dev.proszowski.projectemplate.domain.DomainObject

class ExampleAdapter : SomeUsefulRepository {
    override fun findSomeObjects(): List<DomainObject> {
        return listOf()
    }
}