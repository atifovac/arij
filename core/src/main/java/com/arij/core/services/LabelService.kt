package com.arij.core.services

import com.arij.core.entities.Label
import org.springframework.stereotype.Service

interface LabelService {

    fun getLabels(): List<Label>
    fun getLabelByName(name :String): Label?

    fun addLabel(label: Label) : String
    fun addLabel(message: String) : String

    fun deleteLabel(name: String): Boolean
}
