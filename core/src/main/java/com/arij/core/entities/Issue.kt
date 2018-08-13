package com.arij.core.entities

import javax.persistence.*

@Entity
@Table(name = "Issue")
data class Issue(
        @Id val code: Int = 0,

        val message: String = ""
)
