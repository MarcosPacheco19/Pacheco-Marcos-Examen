/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Electrodomestico;
import java.util.List;


/**
 *
 * @author xpacheco
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO {
    
    //Atributo
    private List<Electrodomestico> electrodomestico;
    
    //Constructor
    public ElectrodomesticoDAO() {
        electrodomestico = new List<Electrodomestico>();
    }

    @Override
    public void create(Electrodomestico electrodomestico) {
        electrodomestico.add(electrodomestico.getCodigo(), electrodomestico);
    }

    @Override
    public Electrodomestico read(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Electrodomestico electrodomestico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Electrodomestico electrodomestico) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
