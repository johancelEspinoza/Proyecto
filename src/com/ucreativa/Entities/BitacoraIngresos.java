package com.ucreativa.Entities;

public class BitacoraIngresos {



    private Vehiculo vehiculo;
    private String brand;
    private String model;
    private String date;
    private String id;

    public BitacoraIngresos(Vehiculo vehiculo, String brand, String model, String date, String id) {
        this.vehiculo = vehiculo;
        this.brand = brand;
        this.date = date;
        this.model = model;
        this.id = id;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getDate() {
        return date;
    }

    public String getId() {
        return id;
    }
}//end
