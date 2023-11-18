package io.stemys.jpaprojection.address

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.UuidGenerator

@Entity(name = "Address")
@Table(name = "Address")
class AddressEntity (

    @Id
    @UuidGenerator
    val id: String? = null,

    @Column
    val streetname: String,

    @Column
    val zipcode: String,
)