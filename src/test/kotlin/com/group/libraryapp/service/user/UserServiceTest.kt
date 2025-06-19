package com.group.libraryapp.service.user

import com.group.libraryapp.domain.user.User
import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.dto.user.request.UserCreateRequest
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class UserServiceTest @Autowired constructor(
    private val userRepository: UserRepository,
    private val userService: UserService
){

    @AfterEach
    fun cleanup(){
        userRepository.deleteAll()
    }

    @Test
    fun saveUserTest() {
        val request = UserCreateRequest("yoon", null)

        userService.saveUser(request)

        val users = userRepository.findAll()
        assertThat(users).hasSize(1)
        assertThat(users[0].name).isEqualTo("yoon")
        assertThat(users[0].age).isNull()
    }

    @Test
    fun getUsersTest() {
        userRepository.saveAll(listOf(
            User("user1", 20),
            User("user2", 10)
        ))

        val users = userService.getUsers()

        assertThat(users).hasSize(2)
        assertThat(users).extracting("name").containsExactlyInAnyOrder("user1", "user2")
    }


}