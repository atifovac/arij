package com.arij.core.entities

import javax.persistence.*

@Entity
@Table(name = "Ticket")
data class Ticket(
        @Id var id: Int = 0,

        @OneToOne(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
        @JoinColumn(name = "code")
        val issue: Issue,

        @Column val storyPoints: Int,

        @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
        @JoinColumn(name = "name")
        val labels: Set<Label>
)
