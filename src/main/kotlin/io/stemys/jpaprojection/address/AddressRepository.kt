package io.stemys.jpaprojection.address

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository

@Repository
interface AddressRepository: JpaRepository<AddressEntity, String>, JpaSpecificationExecutor<AddressEntity> {
}