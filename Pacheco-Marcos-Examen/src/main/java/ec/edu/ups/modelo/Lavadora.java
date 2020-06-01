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
public class Lavadora extends Electrodomestico{
    
    //Atributos
    private int carga;

    Electrodomestico e = new Electrodomestico();
    
    //costructor
    public Lavadora(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
    }
    
    //metodos getters y setters

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    //metodo obtenerPrecioFinal
    public double obtenerPrecioFinal(){
         if(carga >= 30){
             double precioFinal = precioBase + 50;  
         }else{
             e.obtenerPrecioFinal();
         }
        return 0;
        
    }
}
