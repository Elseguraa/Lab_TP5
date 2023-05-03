/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Lucas
 */
public class Arreglo {
    
    
   public static void sumarLista(int[] arreglo) {
    int suma = 0;
    for (int i = 0; i < arreglo.length; i++) {
      suma += arreglo[i];
    }
    double promedio =  suma / arreglo.length;
    System.out.println("La suma de los elementos del arreglo es: " + suma);
    System.out.println("El promedio de los elementos del arreglo es: " + promedio);
  }
   
   
   public static int buscarMayor(int[][] arreglo) {
       int mayor=Integer.MIN_VALUE;
       for (int i=0; i<arreglo.length; i++) {
           for (int j=0; j<arreglo[i].length; j++) {
            if(arreglo[i][j]>mayor) {
                mayor=arreglo[i][j];
                
            }   
           }
       }
       return mayor;
   }
   
   
   public static int cuentaVocales (String cadena) {
       int contador=0;
       String vocales = "aeiouAEIOU";
    for (int i = 0; i < cadena.length(); i++) {
      if (vocales.indexOf(cadena.charAt(i)) != -1) {
        contador++;
      }
    }
    return contador;
    
  }
   
   
   public static int cuentaCaracter (String cadenaa,char letra) {
       int contador=0;
       String letraa = String.valueOf(letra);
       
       for (int i = 0; i < cadenaa.length(); i++) {
      if (letraa.indexOf(cadenaa.charAt(i)) != -1) {
        contador++;
      }
    }
    return contador;
      
          
      
    }
       
       
       
       
       
       
       
       
    }
       
       
       
   
   
   
    
   
   
   

