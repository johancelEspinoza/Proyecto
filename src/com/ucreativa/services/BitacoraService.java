package com.ucreativa.services;

import com.ucreativa.Entities.Sedan;
import com.ucreativa.Entities.TodoTerreno;
import com.ucreativa.Entities.Vehiculo;
import com.ucreativa.repositories.Repo;

import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repo repo;

    public BitacoraService (Repo repo) {
        this.repo = repo;
    }

    public void save(String brand, String model, String txtId, String color, boolean status) {


        int id = Integer.parseInt(txtId);


        Vehiculo vehiculo;
        if (status) {
            vehiculo = new Sedan(brand, model, id, color, status);
        } else {
            vehiculo = new TodoTerreno(brand, model, id, color, status);
        }
        this.repo.save(vehiculo, brand, model,txtId, color, new Date());
    }

    public List<String> get() {
        return  this.repo.get();
    }


}//end
