package com.example.serverassignment2.controller;

import com.example.serverassignment2.model.House;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ShowHouseServlet", value = "/ShowHouseServlet")
public class ShowHouseServlet extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String owner = request.getParameter("owner");
        String address = request.getParameter("address");
        String numberOfBedrooms = request.getParameter("numberOfBedrooms");
        House house = new House(owner, address, numberOfBedrooms);
        request.setAttribute("myHouse", house);
        request.getRequestDispatcher("ShowHouse.jsp").forward(request, response);
    }

    public void destroy() {
    }
}