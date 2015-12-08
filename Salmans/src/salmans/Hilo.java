/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import java.util.ArrayList;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Hilo implements Runnable {

    int tiempo;
    ArrayList ingrediente;
    ArrayList<Stack<String>> bodega_ingrediente;
    JProgressBar bara= new JProgressBar();
    int i=1;

    public Hilo(Producto producto, ArrayList<Stack<String>> bodega_ingrediente,JProgressBar bara) {
        this.tiempo = producto.getTiempo();
        this.ingrediente = producto.getLista_ingrediente();
        this.bodega_ingrediente = bodega_ingrediente;
        this.bara=bara;
    }

    @Override
    public void run() {
        System.out.println(tiempo+"tiempo");
        System.out.println(i+"conatdasd");
        while (i != tiempo) {
            bara.setValue(i);
            bara.repaint();
            i++;
            try {
                Thread.sleep(this.tiempo);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
            if(i==tiempo){
                bara.setValue(100);
                JOptionPane.showMessageDialog(null,"Se termino de cocinar!!!");
                bara.setValue(0);
                break;
            }
        }
    }

}
