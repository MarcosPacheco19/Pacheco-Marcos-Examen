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
public class Television extends Electrodomestico{
    
    //Atributos
    private int resolucion;
    private boolean puertoHDMI;

    Electrodomestico e = new Electrodomestico();
    
    //constructor
    public Television(int codigo, String descripcion, double precioBase, String color, char consumoEnergetico, int peso) {
        super(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
    }

    //Metodos getters y setters

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        return "Television{" + "resolucion=" + resolucion + ", puertoHDMI=" + puertoHDMI + '}';
    }
    
    @Override
    public double obtenerPrecioFinal(){
        if(resolucion >= 40 && puertoHDMI){
            double incremento = 0;
            double incremneto = (int) (precioBase*(30/100));
            double precioFinal = incremento + precioBase;
        }else {
            e.obtenerPrecioFinal();
        }
        return 0;      
    }
}
