package io.stemys.jpaprojection.person

import io.stemys.jpaprojection.address.AddressMapper
import org.mapstruct.Mapper
import org.mapstruct.NullValuePropertyMappingStrategy
import org.mapstruct.ReportingPolicy

@Mapper(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.IGNORE,
    nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
    uses = [AddressMapper::class]

)
interface PersonMapper {
    fun toPerson(entity: PersonEntity): PersonDto
    fun toPersonWithAddress(entity: PersonEntity): PersonWithAddressDto
}