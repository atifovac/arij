package com.arij.core.repositories

import com.arij.core.entities.Label

@Deprecated("Use it until a database is available")
data class LabelRepo(val labels: MutableList<Label>)
