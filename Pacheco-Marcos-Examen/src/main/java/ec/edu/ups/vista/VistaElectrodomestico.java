/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.modelo.Lavadora;

import java.util.Scanner;

/**
 *
 * @author xpacheco
 */
public class VistaElectrodomestico {
    
    //Atributo
    private Scanner entrada;
    
    //constructor
    public VistaElectrodomestico(){
       entrada = new Scanner(System.in); 
    }
    
    //metodo ingresarTelevision
    public void ingresarTelevision(){
        
        System.out.println("HA ESCOGIDO INGRESAR UNA TELEVISION");
        System.out.println("INGRESE EL CODIGO");
        int codigo = entrada.nextInt();
        System.out.println("INGRESE LAS DESCRIPCION");  
        String descripcion = entrada.next();
        System.out.println("INGRESE SU PRECION BASE");
        double precioBase = entrada.nextDouble();
        System.out.println("INGRESE EL COLOR");
        String color = entrada.next();
        System.out.println("INGRESE EL CONSUMO DE ENERGIA");
        char consumoEnergetico = entrada.next();
        System.out.println("INGRESE SU PESO");
        int peso = entrada.nextInt();
        System.out.println("INGRESE SU RESOLUCION");
        int resolucion = entrada.nextInt();
        System.out.println("INGRESE SI TIENES PUERTOS HDMI");
        boolean puertoHDMI entrada.nextBoolean();      
    }
    
    public void IngresarLavadora(){
        
        System.out.println("HA ESCOGIDO INGRESAR UNA LAVADORA");
        System.out.println("INGRESE EL CODIGO");
        int codigo = entrada.nextInt();
        System.out.println("INGRESE LAS DESCRIPCION");  
        String descripcion = entrada.next();
        System.out.println("INGRESE SU PRECION BASE");
        double precioBase = entrada.nextDouble();
        System.out.println("INGRESE EL COLOR");
        String color = entrada.next();
        System.out.println("INGRESE EL CONSUMO DE ENERGIA");
        char consumoEnergetico = entrada.next();
        System.out.println("INGRESE SU PESO");
        int peso = entrada.nextInt();
        System.out.println("INGRESE SU CARGA");
        int carga = entrada.nextInt();
    }
    
    
}
