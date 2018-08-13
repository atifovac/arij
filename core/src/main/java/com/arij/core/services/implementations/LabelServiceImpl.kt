package com.arij.core.services.implementations

import com.arij.core.entities.Label
import com.arij.core.repositories.LabelRepo
import com.arij.core.services.LabelService
import org.springframework.stereotype.Service

@Service
class LabelServiceImpl : LabelService{
    private val labelRepo: LabelRepo = LabelRepo(mutableListOf())

    override fun getLabels(): List<Label> {
        return labelRepo.labels
    }
    override fun getLabelByName(name :String): Label? {
        return labelRepo.labels
                .firstOrNull { label -> label.name === name }
    }

    override fun addLabel(label: Label){
        labelRepo.labels.add(label)
    }
    override fun addLabel(message: String){
        labelRepo.labels.add(Label(message))
    }

    override fun deleteLabel(label: Label): Boolean {
        labelRepo.labels.removeAt(
                labelRepo.labels.indexOf(label)
        )
        return !labelRepo.labels.contains(label)
    }
    override fun deleteLabel(name: String): Boolean {
        val label = getLabelByName(name) ?: return false
        labelRepo.labels.removeAt(
                labelRepo.labels.indexOf(label)
        )
        return !labelRepo.labels.contains(label)
    }
}
