package com.example.serverassignment2.DAO;

import com.example.serverassignment2.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseDAO {
    public ArrayList<House> arr = new ArrayList();


    public HouseDAO(){
        House h1 = new House("Billy Madison", "Ohio", "3");
        House h2 = new House("Happy Gilmore", "California", "6");
        House h3 = new House("Sonny Koufax", "Texas", "5");
        House h4 = new House("Dave Buznik", "New York", "8");
        arr.add(h1);
        arr.add(h2);
        arr.add(h3);
        arr.add(h4);
    }

    public List<House> houseList(){
        return arr;
    }
}
