package com.pranay.backend.controller;

import com.pranay.backend.model.User;
import com.pranay.backend.servise.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class UserControllerTest {

    private MockMvc mockMvc;

    @Mock
    private UserService userService;

    @InjectMocks
    private UserController userController;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
    }

    @Test
    public void testGetAllUsers() throws Exception {
        List<User> users = Arrays.asList(
                new User(1L, "John Doe", "john@example.com"),
                new User(2L, "Jane Doe", "jane@example.com")
        );
        when(userService.getAllUsers()).thenReturn(users);

        mockMvc.perform(get("/api/users/allusers"))
                .andExpect(status().isOk());
    }

    @Test
    public void testAddUser() throws Exception {
        User user = new User(1L, "John Doe", "john@example.com");
        when(userService.addUser(Mockito.any(User.class))).thenReturn(user);

        mockMvc.perform(post("/api/users/adduser")
                .contentType("application/json")
                .content("{\"name\":\"John Doe\", \"email\":\"john@example.com\"}"))
                .andExpect(status().isOk());
    }
}
