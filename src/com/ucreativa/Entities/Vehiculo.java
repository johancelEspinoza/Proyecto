package com.ucreativa.Entities;

public  class Vehiculo {

    private String brand;
    private String model;
    private int id;
    private String color;
    private boolean status;


public Vehiculo (String brand, String model, int id, String color, boolean status) {
    this.brand = brand;
    this.model = model;
    this.id = id;
    this.color = color;
    this.status = status;
}

    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getId() {
        return id;
    }
    public String getColor() {
        return color;
    }
    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}//end
