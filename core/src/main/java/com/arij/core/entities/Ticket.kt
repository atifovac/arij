package com.arij.core.entities

data class Ticket(var id: Int = 0, val issue: Issue, val storyPoints: Int, val labels: List<Label>)
