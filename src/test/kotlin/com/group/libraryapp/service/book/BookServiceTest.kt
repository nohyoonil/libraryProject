package com.group.libraryapp.service.book

import com.group.libraryapp.domain.book.BookRepository
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class BookServiceTest @Autowired constructor(
    private val bookService: BookService,
    private val BookRepository: BookRepository
){
    @Test
    @DisplayName("책 등록 정상 동작")
    fun saveBooksTest() {

    }
}