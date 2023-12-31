package io.stemys.jpaprojection.person.repo

import io.stemys.jpaprojection.person.PersonEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface PersonDynamicProjectionRepository: JpaRepository<PersonEntity, String>, JpaSpecificationExecutor<PersonEntity> {
    fun <T> findByLastname(lastname: String, type: Class<T>): List<T>
    fun <T> findBy(type: Class<T>): List<T>
    fun <T> findAllBy(page: Pageable, type: Class<T>): Page<T>
}