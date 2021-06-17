package com.ucreativa.repositories;

import com.ucreativa.Entities.BitacoraIngresos;
import com.ucreativa.Entities.Vehiculo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class InMemoryRepo {

    private final List<BitacoraIngresos> db;

    public InMemoryRepo(List<BitacoraIngresos> db) {
        this.db = new ArrayList<>();
    }

    public void save(Vehiculo vehiculo, String brand, String model, String date, String id) {
        this.db.add(new BitacoraIngresos(vehiculo, brand, model, date, id));
    }

    public List<String> get() {
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        for (BitacoraIngresos item : db) {
            lines.add(item.getVehiculo().getBrand() +"-"+ item.getModel() +"-"+
                    format.format(item.getDate() +""+ item.getId()));
        }
        return  lines;
    }


}//end
