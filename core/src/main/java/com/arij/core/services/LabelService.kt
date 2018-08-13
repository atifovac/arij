package com.arij.core.services

import com.arij.core.entities.Label
import org.springframework.stereotype.Service

interface LabelService {

    fun getLabels(): List<Label>
    fun getLabelByName(name :String): Label?

    fun addLabel(label: Label)
    fun addLabel(message: String)

    fun deleteLabel(label: Label): Boolean
    fun deleteLabel(name: String): Boolean
}
