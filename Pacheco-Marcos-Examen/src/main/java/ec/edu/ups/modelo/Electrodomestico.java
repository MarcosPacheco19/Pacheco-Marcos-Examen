/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author xpacheco
 */
public class Electrodomestico {
    
    //Atributos
    private int codigo;
    private String descripcion;
    double precioBase;
    private String color;
    private char consumoEnergetico;
    private int peso;

    //Constructor
    public Electrodomestico(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    
    public Electrodomestico(int codigo){
        
    }

    Electrodomestico() {
        
    }
    
    
    //metodos getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //metodo toString
    @Override
    public String toString() {
        return "Electrodomestico:" + "\nCodigo\t" + codigo + "\nDescripcion\t" + descripcion + "\nPrecio Base" + precioBase +
                "\nColor\t" + color + "\nConsumo Energetico\t" + consumoEnergetico + "\npeso\t" + peso;
    }
    
    //metodo obtenerPrecioFinal
    public double obtenerPrecioFinal(){
        double precioFinal = 0;
      
        if(peso > 0 && peso <= 19){
          precioFinal = precioBase + 10;   
        }else if(peso >= 20 && peso <= 49){
          precioFinal = precioBase + 50;   
        }else if(peso >= 50 && peso <= 79){
          precioFinal = precioBase + 80;   
        }else if(peso >= 80){
          precioFinal = precioBase + 100;
        }return precioFinal;
         
    }

    
    
    //metodo compareTo
    public int compareTo(){
        return 0;
        
    }
    
}
