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
import grph.Grph;
import cnrs.grph.set.IntSet;
import grph.algo.AdjacencyMatrix;
import grph.properties.IntProperty;
import grph.algo.*;

public class Grafo{
    Grph g;
  
    public Grafo()    { 
        g = new Grph();
    }
    
    public void ver()    {
        //g.displayGraphstream_0_4_2();
        g.display();
    }
    
    public void addNodos(int n){   
        g.addNVertices(n);
    }
    
    public void removeNodo(int noVertice){
        g.removeVertex(noVertice);
    }
    
    public void addArista(int nodoInicial, int nodoFinal, boolean dirigido, int peso){
        int edge = g.addSimpleEdge(nodoInicial, nodoFinal, dirigido);
        g.getEdgeWeightProperty().setValue(edge, peso);
        g.getEdgeLabelProperty().setValue(edge,"("+edge+","+g.getEdgeWeightProperty().getValueAsString(edge)+")");
    }
    
    public void removeArista(int arista){
      g.removeEdge(arista);
    }
    
    public void setTamanioVertice(int noVertice, int size){
        g.getVertexSizeProperty().setValue(noVertice, size);
    }
    
    public void setPesoArista(int edge, int peso){
       g.getEdgeWeightProperty().setValue(edge, peso);
       g.getEdgeLabelProperty().setValue(edge,"("+edge+","+g.getEdgeWeightProperty().getValueAsString(edge)+")");
    }
    
    public AdjacencyMatrix getMatrizAdyaciencia(){
       AdjacencyMatrix a = g.getAdjacencyMatrix();
        System.out.println(a.toString());
        return a;
       
    }
    
    public void getfloyd(){
       g.floydWarshallAlgorithm.compute(g);
        System.out.println(g.toString());
       
    }
    public void crearRedNodos(int ancho, int alto, boolean dirigido, boolean diagonales){
        g.grid(ancho, alto, dirigido, diagonales);
    }
    
    public int[] getNodos(){
      IntSet nVertices = g.getVertices();
      return nVertices.toIntArray();
    }
    
    public int[] getAristas(){
      IntSet nAristas = g.getEdges();
      return nAristas.toIntArray();
    }
    
    public Grph getGraph(){
      return this.g;  
    }
    
    public IntProperty getPesosAristas(){
      IntProperty e = g.getEdgeWeightProperty();
      System.out.println(e.toString());
      return e;
    }
    
    public void setNombreNodo(int nodo, String nombre){
        g.getVertexLabelProperty().setValue(nodo, nombre);
    }
    public String getNombreNodo(int nodo){
        String nombre = g.getVertexLabelProperty().getValue(nodo);
        return nombre;
    }
    
    public void setNombreArista(int arista, String nombre){
       g.getEdgeLabelProperty().setValue(arista, nombre);
    }
    
}
