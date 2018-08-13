package com.arij.core.repositories

import com.arij.core.entities.Issue
import org.springframework.data.repository.CrudRepository

interface IssueRepo : CrudRepository<Issue, Int>
