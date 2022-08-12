package eu.proszowski.aloof-current.infrastructure

import eu.proszowski.aloof-current.application.ports.SomeUsefulRepository
import eu.proszowski.aloof-current.domain.DomainObject

class ExampleAdapter : SomeUsefulRepository {
    override fun findSomeObjects(): List<DomainObject> {
        return listOf()
    }
}