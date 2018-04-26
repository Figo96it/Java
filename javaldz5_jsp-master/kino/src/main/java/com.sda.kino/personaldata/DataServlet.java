package com.sda.kino.personaldata;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ShowDataServlet", urlPatterns= "/show_data")
public class DataServlet extends HttpServlet {

    protected void doGet(HttpServletRequest reg, HttpServletResponse resp) throws ServletException, IOException{
        ServletOutputStream put=resp.getOutputStream();
        String[] data=Data
    }
}
