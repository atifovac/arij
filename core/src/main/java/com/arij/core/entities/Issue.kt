package com.arij.core.entities

import javax.persistence.*

@Entity
@Table(name = "Issue")
data class Issue(
        @Id val code: Int,

        val message: String
)
