package com.musicplayer.servlets;

import com.musicplayer.dao.UserDAO;
import com.musicplayer.models.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/user")
public class UserServlet extends HttpServlet {

    private final UserDAO userDAO = new UserDAO();


        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // Fetch all users using the UserDAO
            List<User> users = userDAO.getAllUsers();

            // Set the fetched users as a request attribute
            request.setAttribute("users", users);

            // Forward the request to userProfile.jsp
            request.getRequestDispatcher("/userProfile.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        User user = new User(username, email, password);
        userDAO.saveUser(user);

        response.sendRedirect("/user"); // Redirect to view all users
    }
}
