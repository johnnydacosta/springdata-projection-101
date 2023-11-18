package io.stemys.jpaprojection.person

import io.stemys.jpaprojection.address.AddressDto

data class PersonWithAddressDto(
        val id: String,
        val firstname: String,
        val lastname: String,
        val address: AddressDto
)
