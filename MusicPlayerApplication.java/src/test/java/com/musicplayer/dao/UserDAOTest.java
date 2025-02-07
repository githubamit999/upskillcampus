package com.musicplayer.dao;

import com.musicplayer.models.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UserDAOTest {

    private final UserDAO userDAO = new UserDAO();

    @Test
    public void testSaveUser() {
        User user = new User("testUser", "test@example.com", "password");
        userDAO.saveUser(user);
        List<User> users = userDAO.getAllUsers();
        assertNotNull(users);
    }

    @Test
    public void testGetAllUsers() {
        List<User> users = userDAO.getAllUsers();
        assertNotNull(users);
    }
}














