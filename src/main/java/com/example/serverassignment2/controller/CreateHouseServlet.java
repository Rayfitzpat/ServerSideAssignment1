package com.example.serverassignment2.controller;

import com.example.serverassignment2.DAO.HouseDAO;
import com.example.serverassignment2.model.House;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CreateHouseServlet", value = "/CreateHouseServlet")
public class CreateHouseServlet extends HttpServlet {
  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HouseDAO houseDAO = new HouseDAO() ;
        String owner = request.getParameter("owner");
        String address = request.getParameter("address");
        String numberOfBedrooms = request.getParameter("numberOfBedrooms");
        House h5 = new House(owner, address, numberOfBedrooms);
        houseDAO.arr.add(h5);
        List<House> list = houseDAO.houseList();
        request.setAttribute("myHouseList", list);
        request.getRequestDispatcher("ListHouse.jsp").forward(request, response);
    }
}
