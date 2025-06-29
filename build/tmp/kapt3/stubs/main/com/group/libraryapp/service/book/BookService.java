package com.group.libraryapp.service.book;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000eH\u0017J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0010H\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/group/libraryapp/service/book/BookService;", "", "bookRepository", "Lcom/group/libraryapp/domain/book/BookRepository;", "userRepository", "Lcom/group/libraryapp/domain/user/UserRepository;", "userLoanHistoryRepository", "Lcom/group/libraryapp/domain/user/loanhistory/UserLoanHistoryRepository;", "(Lcom/group/libraryapp/domain/book/BookRepository;Lcom/group/libraryapp/domain/user/UserRepository;Lcom/group/libraryapp/domain/user/loanhistory/UserLoanHistoryRepository;)V", "loanBook", "", "request", "Lcom/group/libraryapp/dto/book/request/BookLoanRequest;", "returnBook", "Lcom/group/libraryapp/dto/book/request/BookReturnRequest;", "saveBook", "Lcom/group/libraryapp/dto/book/request/BookRequest;", "library-app"})
@org.springframework.stereotype.Service
public class BookService {
    private final com.group.libraryapp.domain.book.BookRepository bookRepository = null;
    private final com.group.libraryapp.domain.user.UserRepository userRepository = null;
    private final com.group.libraryapp.domain.user.loanhistory.UserLoanHistoryRepository userLoanHistoryRepository = null;
    
    public BookService(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.book.BookRepository bookRepository, @org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    com.group.libraryapp.domain.user.loanhistory.UserLoanHistoryRepository userLoanHistoryRepository) {
        super();
    }
    
    @org.springframework.transaction.annotation.Transactional
    public void saveBook(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.dto.book.request.BookRequest request) {
    }
    
    @org.springframework.transaction.annotation.Transactional
    public void loanBook(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.dto.book.request.BookLoanRequest request) {
    }
    
    @org.springframework.transaction.annotation.Transactional
    public void returnBook(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.dto.book.request.BookReturnRequest request) {
    }
}