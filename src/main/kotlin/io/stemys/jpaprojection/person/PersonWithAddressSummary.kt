package io.stemys.jpaprojection.person

import io.stemys.jpaprojection.address.AddressSummary

interface PersonWithAddressSummary: NameOnly {
     fun getAddress(): AddressSummary
}