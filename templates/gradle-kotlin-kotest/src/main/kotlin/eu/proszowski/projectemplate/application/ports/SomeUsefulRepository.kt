package eu.proszowski.bawdy-partner.application.ports

import eu.proszowski.bawdy-partner.domain.DomainObject

interface SomeUsefulRepository {
    fun findSomeObjects(): List<DomainObject>
}