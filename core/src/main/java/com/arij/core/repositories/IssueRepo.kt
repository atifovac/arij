package com.arij.core.repositories

import com.arij.core.entities.Issue

@Deprecated("Use it until a database is available")
data class IssueRepo(val issues: MutableList<Issue>)
