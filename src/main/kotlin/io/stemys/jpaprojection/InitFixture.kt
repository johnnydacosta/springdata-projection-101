package io.stemys.jpaprojection

import io.stemys.jpaprojection.address.AddressEntity
import io.stemys.jpaprojection.address.AddressRepository
import io.stemys.jpaprojection.person.PersonEntity
import io.stemys.jpaprojection.person.repo.PersonRepository
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Component

@Component
class InitFixture(
        val personRepository: PersonRepository,
        val addressRepository: AddressRepository
) {

    @PostConstruct
    fun init() {
        val addressA = addressRepository.save(
                AddressEntity(
                    streetname = "unknown street",
                    zipcode = "2000"
                )
        )

        val addressB = addressRepository.save(
                AddressEntity(
                        streetname = "unknown street",
                        zipcode = "3000"
                )
        )

        personRepository.save(
                PersonEntity(
                    firstname = "john",
                    lastname = "doe",
                    address = addressA
                )
        )

        personRepository.save(
                PersonEntity(
                        firstname = "jane",
                        lastname = "doe",
                        address = addressB
                )
        )
    }

}