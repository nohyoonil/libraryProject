package com.group.libraryapp.service.user.loanhistory

import com.group.libraryapp.domain.user.User
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToOne

class UserLoanHistory(
    @ManyToOne
    val user: User,
    val bookName: String,
    var isReturn: Boolean,
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
) {
    fun doReturn() {
        this.isReturn = true
    }
}