/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Mario Salamanca
 */
public class Modelo {
    private int repeticiones;
    private double valor;
    private double resultado;
    private double seno;

    public double getSeno() {
        return seno;
    }

    public void setSeno(double seno) {
        this.seno = seno;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
           
    public double calcular() {
        
        return calcularSeno(this.repeticiones, this.valor);
    }

    public double calcularSeno(int rep, double val) {

        if (rep == 0) {
            return val;
        } else {
            return val = Math.pow(-1, rep) * Math.pow(val, 2 * rep + 1) / (factorial(2 * rep + 1)) + calcularSeno(rep - 1, val );
        }
    }

    public double factorial(int rep2) {
        if (rep2 <= 1) {
            return 1;
        } else {
            return rep2 * factorial(rep2 - 1);
        }
    }
    
     public double seno(double valor){
        return Math.sin(valor);
    }
     
}


