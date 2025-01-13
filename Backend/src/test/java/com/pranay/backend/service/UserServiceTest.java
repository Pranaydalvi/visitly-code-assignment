package com.pranay.backend.service;

import com.pranay.backend.model.User; 
import com.pranay.backend.repository.UserRepository;
import com.pranay.backend.servise.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceTest {

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserService userService;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void testGetAllUsers() {
        List<User> users = Arrays.asList(
                new User(1L, "John Doe", "john@example.com"),
                new User(2L, "Jane Doe", "jane@example.com")
        );
        Mockito.when(userRepository.findAll()).thenReturn(users);

        List<User> result = userService.getAllUsers();
        assertEquals(2, result.size());
    }

    @Test
    public void testAddUser() {
        User user = new User(1L, "John Doe", "john@example.com");
        Mockito.when(userRepository.save(Mockito.any(User.class))).thenReturn(user);

        User result = userService.addUser(user);
        assertEquals("John Doe", result.getName());
    }
}
