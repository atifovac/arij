package com.arij.core.services

import com.arij.core.entities.Issue

interface IssueService {

    fun getIssueList(): List<Issue>
    fun getIssueByCode(code: Int): Issue

    fun newIssue(issueCode: Int, message: String) : Int
    fun newIssue(issue: Issue) : Int

    fun deleteIssue(code: Int) : Boolean
}
