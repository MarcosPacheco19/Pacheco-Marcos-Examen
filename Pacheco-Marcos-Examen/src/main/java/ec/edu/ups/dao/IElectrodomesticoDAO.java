/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Electrodomestico;

/**
 *
 * @author xpacheco
 */
public interface IElectrodomesticoDAO {
    
    public void create(Electrodomestico electrodomestico);
    public Electrodomestico read (int codigo);
    public void update(Electrodomestico electrodomestico);
    public void delete(Electrodomestico electrodomestico);
    
}
