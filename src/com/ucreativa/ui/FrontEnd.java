package com.ucreativa.ui;

import com.ucreativa.repositories.FileRepo;
import com.ucreativa.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public  FrontEnd(String title) {
        super(title);
    }

    public  void build() {
        this.screen();
        this.buildComponents();
        super.setVisible(true);
    }

    private void screen(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(6, 2));
    }

    private void addComponent(Component component){
        super.getContentPane().add(component);
    }

    private void buildComponents() {

        //Labels
        JLabel lblBrand = new JLabel("Marca: ");
        JLabel lblModel = new JLabel("Modelo: ");
        JLabel lblId = new JLabel("Placa: ");
        JLabel lblColor = new JLabel("Color: ");
        JLabel lblStatus = new JLabel("Nuevo?: ");

        //Build Text
        JTextField txtBrand = new JTextField();
        JTextField txtModel = new JTextField();
        JTextField txtId = new JTextField();
        JTextField txtColor = new JTextField();

        JCheckBox txtStatus = new JCheckBox();



        JButton save = new JButton("Guardar");
        save.addActionListener(new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepo());

                service.save(txtBrand.getText(),
                        txtModel.getText(),
                        txtId.getText(),
                        txtColor.getText(),
                        txtStatus.isSelected());

                //Limpiar Campos
                txtBrand.setText("");
                txtModel.setText("");
                txtId.setText("");
                txtColor.setText("");



                String reporte = String.join("\n", service.get());
                JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(), reporte);
            }
        });

        //UI
        this.addComponent(lblBrand);
        this.addComponent(txtBrand);
        this.addComponent(lblModel);
        this.addComponent(txtModel);
        this.addComponent(lblId);
        this.addComponent(txtId);
        this.addComponent(lblColor);
        this.addComponent(txtColor);
        this.addComponent(lblStatus);
        this.addComponent(txtStatus);
        this.addComponent(save);
    }
}//end
