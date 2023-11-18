package io.stemys.jpaprojection.person.repo

import io.stemys.jpaprojection.person.PersonEntity
import io.stemys.jpaprojection.person.PersonWithAddress
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface PersonProjectionRepository: JpaRepository<PersonEntity, String>, JpaSpecificationExecutor<PersonEntity> {
    fun findByLastname(lastname: String): List<PersonWithAddress>
}