package com.arij.core.entities

import javax.persistence.*

@Entity
@Table(name = "Label")
data class Label(
        @Id
        val name: String
)
