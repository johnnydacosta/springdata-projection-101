package io.stemys.jpaprojection.person

import io.stemys.jpaprojection.address.AddressEntity
import jakarta.persistence.*
import org.hibernate.annotations.UuidGenerator


@Entity
@Table(name = "Person")
class PersonEntity (

    @Id
    @UuidGenerator
    val id: String? = null,

    @Column
    val firstname: String,

    @Column
    val lastname: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="address_id")
    val address: AddressEntity? = null
)