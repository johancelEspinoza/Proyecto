package com.ucreativa.repositories;

import com.ucreativa.Entities.Vehiculo;

import java.text.SimpleDateFormat;
import java.util.List;


public interface Repo {

    void save (Vehiculo vehiculo, String brand, String model, String date, String id);

    List<String> get();
}//end
