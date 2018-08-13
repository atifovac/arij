package com.arij.core.services.implementations

import com.arij.core.entities.Issue
import com.arij.core.repositories.IssueRepo
import com.arij.core.services.IssueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class IssueServiceImpl : IssueService {

    @Autowired
    lateinit var issueRepo: IssueRepo

    override fun getIssueList(): List<Issue> {
        return issueRepo.findAll().toList()
    }

    override fun getIssueByCode(code: Int): Issue {
        return issueRepo.findOne(code)
    }


    override fun newIssue(issueCode: Int, message: String): Int {
        return issueRepo.save(Issue(issueCode, message)).code
    }

    override fun newIssue(issue: Issue): Int {
        return issueRepo.save(issue).code
    }

    override fun deleteIssue(code: Int): Boolean {
        issueRepo.delete(issueRepo.findOne(code))
        return issueRepo.exists(code)
    }
}
