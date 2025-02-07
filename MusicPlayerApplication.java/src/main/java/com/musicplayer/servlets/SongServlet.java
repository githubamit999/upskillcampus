package com.musicplayer.servlet;

import com.musicplayer.dao.SongDAO;
import com.musicplayer.model.Song;
import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/songs")
public class SongServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SongDAO songDAO = new SongDAO();
        List<Song> songs = songDAO.getAllSongs();

        response.setContentType("application/json");
        response.getWriter().write(new Gson().toJson(songs));
    }
}
