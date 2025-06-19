package com.group.libraryapp.controller.book;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0017J\u0012\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\nH\u0017J\u0012\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\fH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/group/libraryapp/controller/book/BookController;", "", "bookService", "Lcom/group/libraryapp/service/book/BookService;", "(Lcom/group/libraryapp/service/book/BookService;)V", "loanBook", "", "request", "Lcom/group/libraryapp/dto/book/request/BookLoanRequest;", "returnBook", "Lcom/group/libraryapp/dto/book/request/BookReturnRequest;", "saveBook", "Lcom/group/libraryapp/dto/book/request/BookRequest;", "library-app"})
@org.springframework.web.bind.annotation.RestController
public class BookController {
    private final com.group.libraryapp.service.book.BookService bookService = null;
    
    public BookController(@org.jetbrains.annotations.NotNull
    com.group.libraryapp.service.book.BookService bookService) {
        super();
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/book"})
    public void saveBook(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.group.libraryapp.dto.book.request.BookRequest request) {
    }
    
    @org.springframework.web.bind.annotation.PostMapping(value = {"/book/loan"})
    public void loanBook(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.group.libraryapp.dto.book.request.BookLoanRequest request) {
    }
    
    @org.springframework.web.bind.annotation.PutMapping(value = {"/book/return"})
    public void returnBook(@org.jetbrains.annotations.NotNull
    @org.springframework.web.bind.annotation.RequestBody
    com.group.libraryapp.dto.book.request.BookReturnRequest request) {
    }
}