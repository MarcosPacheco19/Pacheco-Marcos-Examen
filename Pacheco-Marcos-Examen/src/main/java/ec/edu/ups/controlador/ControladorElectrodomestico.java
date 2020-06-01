/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;
import ec.edu.ups.dao.IElectrodomesticoDAO;

/**
 *
 * @author xpacheco
 */
public class ControladorElectrodomestico {


    //Atributos
    private VistaElectrodomestico vistaElectrodomestico;
    private Electrodomestico electrodomestico;
    private IElectrodomesticoDAO iElectrodomesticoDao;
    
    VistaElectrodomestico ver = new VistaElectrodomestico();
    
    
    //Constructor
    public ControladorElectrodomestico(VistaElectrodomestico vistaElectrodomestico, Electrodomestico electrodomestico, IElectrodomesticoDAO iElectrodomesticoDao) {
        this.vistaElectrodomestico = vistaElectrodomestico;
        this.electrodomestico = electrodomestico;
        this.iElectrodomesticoDao = iElectrodomesticoDao;
    }

    public void registrarTelevision() {
        ver.ingresarTelevision();
    }
    
    public void registrarLavadora(){
        ver.IngresarLavadora();
    }
        
    public void verLavadoras(){
        
    }
    
    public void verTelevisiones(){
        
    }
    
}
