package eu.proszowski.projectemplate.application.ports

import eu.proszowski.projectemplate.domain.DomainObject

interface SomeUsefulRepository {
    fun findSomeObjects(): List<DomainObject>
}