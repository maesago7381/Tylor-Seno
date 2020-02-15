/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author Mario Salamanca
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo model;
    
    public Controlador(Vista view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnCalcular.addActionListener(this);
    }
    
    public void inicia(){
        view.setTitle("MVC Seno Tylor");
        view.setLocationRelativeTo(null);
        
    }
    
    public void actionPerformed(ActionEvent e) {
       String rep = view.txtRepeticiones.getText();
        String val = view.txtValor.getText();
        double resultado = 0;
        double seno = 0;
        if (rep.equals("") || val.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese los datos");
        } else {
            model.setRepeticiones(Integer.parseInt(view.txtRepeticiones.getText()));
            model.setValor(Double.parseDouble(view.txtValor.getText()));
            
            
            resultado = model.calcular();
            seno = model.seno(Double.parseDouble(view.txtValor.getText()));
            
            view.txtResultado.setText(String.valueOf(resultado));
            view.txtseno.setText(String.valueOf(seno));
        }

    }
    
   
}
