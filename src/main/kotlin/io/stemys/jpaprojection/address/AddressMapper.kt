package io.stemys.jpaprojection.address

import io.stemys.jpaprojection.person.PersonDto
import io.stemys.jpaprojection.person.PersonEntity
import io.stemys.jpaprojection.person.PersonWithAddressDto
import org.mapstruct.Mapper
import org.mapstruct.NullValuePropertyMappingStrategy
import org.mapstruct.ReportingPolicy

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
)
interface AddressMapper {
    fun toAddress(address: AddressEntity): AddressDto
}