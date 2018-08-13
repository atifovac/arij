package com.arij.core.services.implementations

import com.arij.core.entities.Label
import com.arij.core.repositories.LabelRepo
import com.arij.core.services.LabelService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LabelServiceImpl : LabelService {

    @Autowired
    lateinit var labelRepo: LabelRepo

    override fun getLabels(): List<Label> {
        return labelRepo.findAll().toList()
    }

    override fun getLabelByName(name: String): Label? {
        return labelRepo.findOne(name)
    }

    override fun addLabel(label: Label): String {
        return labelRepo.save(label).name
    }

    override fun addLabel(message: String): String {
        val label = labelRepo.findOne(message)
        return label?.name ?: labelRepo.save(Label(message)).name
    }

    override fun deleteLabel(name: String): Boolean {
        labelRepo.delete(labelRepo.findOne(name))
        return labelRepo.exists(name)
    }
}
