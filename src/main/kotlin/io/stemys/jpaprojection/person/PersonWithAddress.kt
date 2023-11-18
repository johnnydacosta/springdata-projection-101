package io.stemys.jpaprojection.person

import io.stemys.jpaprojection.address.AddressEntity

interface PersonWithAddress: NameOnly {
     fun getAddress(): AddressEntity
}