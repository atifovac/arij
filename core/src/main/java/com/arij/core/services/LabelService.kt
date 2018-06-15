package com.arij.core.services

import com.arij.core.entities.Label

interface LabelService {

    fun getLabels(): List<Label>
    fun getLabelsByName(name :String): List<Label>

    fun addLabel(label: Label): Int
    fun addLabel(code: Int, message: String): Int

    fun deleteLabel(label: Label): Boolean
    fun deleteLabel(name: String): Boolean
}
