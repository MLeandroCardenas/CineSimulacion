/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.simulacion;
import java.util.Scanner;
/**
 * CLASE QUE ME LEE EL VALOR DE LAS FILAS Y COLUMNAS SOLICITADOS POR EL USUARIO
 * @author EdgarAndresKrejci,Michael Leandro Cardenas
 */
public class LeerFilasColumnas {
     private byte filas;
     private byte columnas;
     Scanner sc= new Scanner(System.in);
     /**
      * Construcctor que me llama al metodo leerDimension
      */
     public LeerFilasColumnas() {
         leerDimension();
     }
     /**
      * METODO QUE LEE LA DIMENSON DEL CINEMA
      */
     private void leerDimension(){
        System.out.println("\t Bienvenido al cine \t");
        System.out.println("Digite el numero de filas de la sala: ");
        filas = sc.nextByte();
        System.out.println("Digite el numero de columnas de la sala: ");
        columnas = sc.nextByte();   
    }
     /**
      * 
      * @return 
      */
    public byte getFilas() {
        return filas;
    }
    /**
     * 
     * @param filas 
     */
    public void setFilas(byte filas) {
        this.filas = filas;
    }
    /**
     * 
     * @return 
     */
    public byte getColumnas() {
        return columnas;
    }
    /**
     * 
     * @param columnas 
     */
    public void setColumnas(byte columnas) {
        this.columnas = columnas;
    }
     
}
