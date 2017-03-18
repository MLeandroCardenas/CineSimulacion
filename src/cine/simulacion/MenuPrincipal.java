package cine.simulacion;
import java.util.Scanner;
public class MenuPrincipal {
    Scanner sc= new Scanner (System.in);
    byte filas;
    byte columnas;
    int contador;
    byte tipo=1;
    int tipoG;
    int tipoE;
    int tipoP;
    Silla[][] arraySilla;
     public MenuPrincipal() {
       LeerFilasColumnas filas1= new LeerFilasColumnas();
       this.filas=filas1.getFilas();
       this.columnas=filas1.getColumnas();
       arraySilla = new Silla[filas][columnas];
       generarSala();
       imprimirSala();
       definirTipoSillas();
       definirMatrizSillas();
      }
    private void generarSala(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                    arraySilla[i][j] = new Silla(contador++,null,tipo);                    
            } 
        }
    } 
    private void imprimirSala(){
        for (int i=0;i<filas;i++){
                for (int j=0;j<columnas;j++){
                    System.out.print(" "+arraySilla[i][j].getCliente());
                }
                System.out.print("\n");
            }
    }
    private void definirTipoSillas(){
        System.out.println("QUE NUMERO DE FILAS DESEA GENERALES");
        tipoG=sc.nextInt();
        System.out.println("QUE NUMERO DE FILAS DESEA PREFERENCIALES");
        tipoP=sc.nextInt();
        System.out.println("QUE NUMERO DE FILAS DESEA EJECTIVAS");
        tipoE=sc.nextInt();
    }
    private void definirMatrizSillas(){
        byte g=1;
        int aux;
        int aux2;
        for (int i=0;i<tipoG;i++){
            for (int j=0;j<columnas;j++){
                arraySilla[i][j].setTipo(g);
            }
        }
        aux=tipoG+tipoE;
        g++;
        for (int i=g;i<aux;i++){
            for (int j=0;j<columnas;j++){
                arraySilla[i][j].setTipo(g);
            }
        }
    }
    public int getFilas() {
        return filas;
    }
    public void setFilas(byte filas) {
        this.filas = filas;
    }
    public int getColumnas() {
        return columnas;
    }
    public void setColumnas(byte columnas) {
        this.columnas = columnas;
    }
    
}
