/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2datos;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author rdcamero
 */
public class Grafo {
    LinkedList<Vertice> lista; //= new LinkedList<Vertice>();
    public Grafo(){
       lista = new LinkedList<>();
    }
   
    public boolean validarNombre(String nombre){
        for (Vertice vertice : lista) 
            if(vertice.getNombre().equals(nombre))
                return true;
        return false;
    }
    public void addAdyacente(String nombreOrigen, String nombreDestino, int costo){
        Vertice temp=null;
        for (Vertice vertice : lista) 
            if(nombreDestino.equals(vertice.getNombre()))
                temp=vertice;
        if(temp!=null)
            for (Vertice vertice : lista) 
            if(vertice.getNombre().equals(nombreOrigen))
                vertice.addArista(temp.getSerial(), costo);
    }
    public Vertice convertirSerial(int serial){
        for (Vertice vertice : lista) 
            if(serial==vertice.getSerial())
                return vertice;
        return null;
    }
    public int[][] generateRoat (){
        int n = this.lista.size();
        int[][] matriz = new int[n][n];
        boolean entro = false;
        int costo = 9999;
        for (Vertice vertice : this.lista) {
            for (int i = 0; i < n; i++) {
                if(vertice.getSerial()==i){
                    matriz[i][i]=0;
                }else{
                    entro = false;
                    for (Arista arista : vertice.aristas) 
                        if(i==arista.getSerial()){
                            entro = true;
                            costo = arista.getCosto();
                        }              
                    if(entro == true)
                        matriz[vertice.getSerial()][i]= costo;
                    else
                         matriz[vertice.getSerial()][i]=9999;
                }
            }
        }
        return matriz;
    }
    
    public int[][] generateWays(){
        int n = this.lista.size();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j]=j;
            }
        }
        return matriz;
    }
    public static void floydWarshall(int distancias[][], int camino[][]) {

        for (int k = 0; k < distancias.length; k++) {
            for (int i = 0; i < distancias.length; i++) {
                for (int j = 0; j < distancias.length; j++) {
                    if (distancias[i][k] + distancias[k][j] < distancias[i][j]) {
                        distancias[i][j] = distancias[i][k] + distancias[k][j];
                        camino[i][j] = k;
                    }
                }
            }
        }
    }

    public static void showFloyd(int matrizAdy[][]) {
        for (int i = 0; i < matrizAdy.length; i++) {
            for (int j = 0; j < matrizAdy.length; j++) {
                if (matrizAdy[i][j] == 99999) {
                    System.out.print("∞");
                } else {
                    System.out.print(matrizAdy[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }

    public static void showWays(int[][] distancia, int[][] camino, int v1, int v2) {
        System.out.println("El camino minimo para ir de " + v1 + "=>" + v2 + " es: " + distancia[v1][v2]);
        System.out.println("El recorrido es el siguiente: ");
        Stack<Integer> pila = new Stack<Integer>();
        pila.add(v2);
        while (camino[v1][v2] != v2) {
            pila.add(camino[v1][v2]);
            v2 = camino[v1][v2];
        }
        pila.add(v1);
        while (!pila.isEmpty()) {
            System.out.print("=>" + pila.pop());
        }

    }
    
  
}
