package io.stemys.jpaprojection.person.repo

import io.stemys.jpaprojection.person.PersonEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface PersonRepository: JpaRepository<PersonEntity, String>, JpaSpecificationExecutor<PersonEntity> {
    fun findByLastname(lastname: String): List<PersonEntity>

    @Query("SELECT DISTINCT p FROM PersonEntity p LEFT JOIN FETCH p.address WHERE p.lastname = :lastname")
    fun findByLastnameWithAddress(lastname: String): List<PersonEntity> // custom to avoid n+1 query

}