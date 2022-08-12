package eu.proszowski.projectemplate.infrastructure

import eu.proszowski.projectemplate.application.ports.SomeUsefulRepository
import eu.proszowski.projectemplate.domain.DomainObject

class ExampleAdapter : SomeUsefulRepository {
    override fun findSomeObjects(): List<DomainObject> {
        return listOf()
    }
}