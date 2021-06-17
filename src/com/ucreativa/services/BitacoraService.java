package com.ucreativa.services;

import com.ucreativa.Entities.Sedan;
import com.ucreativa.Entities.TodoTerreno;
import com.ucreativa.Entities.Vehiculo;
import com.ucreativa.repositories.Repo;

import java.util.List;

public class BitacoraService {

    private Repo repo;

    public BitacoraService (Repo repo) {
        this.repo = repo;
    }

    public  void save(String brand, String model, String date, String id,
                      String color, boolean status) {

        Vehiculo vehiculo;
        if (status) {
            vehiculo = new Sedan(brand, model, id, color, status);
        } else {
            vehiculo = new TodoTerreno(brand, model, id, color, status);
        }
        this.repo.save(vehiculo,brand, model, date, id);
    }
    public List<String> get() {
        return  this.repo.get();
    }
}//end
