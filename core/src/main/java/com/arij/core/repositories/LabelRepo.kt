package com.arij.core.repositories

import com.arij.core.entities.Label
import org.springframework.data.repository.CrudRepository

interface LabelRepo : CrudRepository<Label, String>
