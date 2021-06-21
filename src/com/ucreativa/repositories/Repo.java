package com.ucreativa.repositories;

import com.ucreativa.Entities.Vehiculo;

import java.util.Date;
import java.util.List;


public interface Repo {

    void save (Vehiculo vehiculo, String brand, String model, String id, String color, Date date);

    List<String> get();
}//end
