package com.example.serverassignment2.model;

public class House {

    private String owner;
    private String address;
    private String numberOfBedrooms;

    public House(String owner, String address, String numberOfBedrooms) {
        this.owner = owner;
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(String numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }
}
