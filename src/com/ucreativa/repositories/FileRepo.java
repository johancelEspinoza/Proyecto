package com.ucreativa.repositories;

import com.ucreativa.Entities.Vehiculo;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepo implements Repo {

    private final String FILE_PATH = "db.txt";


    @Override
    public void save (Vehiculo vehiculo, String brand, String model, String id, String color, Date date) {
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

            String text = (vehiculo.getBrand() + " " + model + " " + " "+ id +" " + format.format(date));
            try {
                BufferedWriter writer  = new BufferedWriter(new FileWriter(FILE_PATH, true));
                writer.append(text);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    @Override
    public List<String> get() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return null;
    }
}//end
