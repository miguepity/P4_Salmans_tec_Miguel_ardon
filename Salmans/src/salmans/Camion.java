/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Camion {

    Producto[] soporta =new Producto[10];

    public Camion() {
    }

    public Camion(Producto[] soporta) {
        this.soporta=soporta;
    }

    public Producto[] getSoporta() {
        return soporta;
    }

    public void setSoporta(Producto[] soporta) {
        this.soporta = soporta;
    }
    
    
    
}
