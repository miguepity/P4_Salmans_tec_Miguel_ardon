/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salmans;

import java.util.ArrayList;

/**
 *
 * @author Miguel A. Ardon E
 */
public class Producto {
    int tiempo;
    String nombre;
    double precio;
    ArrayList<String> lista_ingrediente = new ArrayList<>();

    public Producto() {
    }

    public Producto(int tiempo, String nombre, double precio, ArrayList<String> lista_ingrediente) {
        this.tiempo = tiempo;
        this.nombre = nombre;
        this.precio = precio;
        this.lista_ingrediente=lista_ingrediente;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getLista_ingrediente() {
        return lista_ingrediente;
    }

    public void setLista_ingrediente(ArrayList<String> lista_ingrediente) {
        this.lista_ingrediente = lista_ingrediente;
    }

    @Override
    public String toString() {
        return "Producto{" + "tiempo=" + tiempo + ", nombre=" + nombre + ", precio=" + precio + ", lista_ingrediente=" + lista_ingrediente + '}';
    }
}
