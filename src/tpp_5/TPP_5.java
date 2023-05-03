/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpp_5;

import Entidad.Arreglo;

/**
 *
 * @author Lucas
 */
public class TPP_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        
        Arreglo.sumarLista(arreglo);
        
        
        int[][] arregloBidimensional = {{1, 2, 3}, {4, 5}, {6}};
        int mayor = Arreglo.buscarMayor(arregloBidimensional);
        
        System.out.println("------------------------------------------");
        
        System.out.println("El numero con mayor valor es: "+mayor);
        
        System.out.println("------------------------------------------");
        
        String cadena="lucas segura";
        
        int contadorv =Arreglo.cuentaVocales(cadena);
        System.out.println("La cantidad de veces que se repitieron las vocales en el arreglo es de: "+contadorv);
        
        System.out.println("------------------------------------------");
        
        char letra='l';
        int contadorl=Arreglo.cuentaCaracter(cadena, letra);
        System.out.println("La cantidad de veces que se encontro el caracter es de: "+contadorl);
    }
    
}
