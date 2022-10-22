package dev.proszowski.projectemplate.application.ports

import dev.proszowski.projectemplate.domain.DomainObject

interface SomeUsefulRepository {
    fun findSomeObjects(): List<DomainObject>
}