/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.simulacion;
import java.util.Scanner;
public class LeerFilasColumnas {
     private byte filas;
     private byte columnas;
     Scanner sc= new Scanner(System.in);
     public LeerFilasColumnas() {
         leerDimension();
     }
     private void leerDimension(){
        System.out.println("\t Bienvenido al cine \t");
        System.out.println("Digite el numero de filas de la sala: ");
        filas = sc.nextByte();
        System.out.println("Digite el numero de columnas de la sala: ");
        columnas = sc.nextByte();   
    }
    public byte getFilas() {
        return filas;
    }

    public void setFilas(byte filas) {
        this.filas = filas;
    }

    public byte getColumnas() {
        return columnas;
    }

    public void setColumnas(byte columnas) {
        this.columnas = columnas;
    }
     
}
