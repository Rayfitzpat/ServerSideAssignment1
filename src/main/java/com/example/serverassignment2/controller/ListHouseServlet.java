package com.example.serverassignment2.controller;

import com.example.serverassignment2.DAO.HouseDAO;
import com.example.serverassignment2.model.House;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListHouseServlet", value = "/ListHouseServlet")
public class ListHouseServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        HouseDAO houseDAO = new HouseDAO();
        List<House> listHouse = new ArrayList();
        listHouse = houseDAO.houseList();
        request.setAttribute("myHouseList", listHouse);
        request.getRequestDispatcher("ListHouse.jsp").forward(request, response);
    }
}
