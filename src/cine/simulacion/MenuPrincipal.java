package cine.simulacion;
import java.util.Scanner;
public class MenuPrincipal {
    Scanner sc= new Scanner (System.in);
    byte filas;
    byte columnas;
    int contador;
    byte tipo=1;
    int taquilla=0;
    int tipoG;
    boolean disponible=false;
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
       InformacionPelicula();
       IngresarClientes();
      }
    private void generarSala(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                    arraySilla[i][j] = new Silla(contador++,null,tipo,"VACIO");                    
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
        for (int i=0;i<tipoG;i++){
            for (int j=0;j<columnas;j++){
                arraySilla[i][j].setTipo(tipo);
            }
        }
        tipo=2;
        for (int i=tipoG;i<tipoG+tipoP;i++){
            for (int j=0;j<columnas;j++){
                arraySilla[i][j].setTipo(tipo);
            }
        }
        tipo=3;
        for (int i=tipoG+tipoP;i<tipoG+tipoP+tipoE;i++){
            for (int j=0;j<columnas;j++){
                arraySilla[i][j].setTipo(tipo);
            }
        }
    }
    private void InformacionPelicula(){
        Pelicula pelicula= new Pelicula("COMEDIA","2013","","Mi VILLANO FAVORITO 2","120 MINUTOS... 2 HORAS");
        System.out.println("LA PELICULA DEL DIA DE HOY ES:");
        System.out.println(pelicula.getTitulo());
        System.out.println(pelicula.getGenero());
        System.out.println(pelicula.getAño());
        System.out.println(pelicula.getDuracion());
    }
    private void IngresarClientes(){
        byte ingresarUsuario;
        System.out.println("DESEA COMPRAR BOLETA?"+"SI LO DESEA INGRESE 1");
        while (true){
            ingresarUsuario= sc.nextByte();
            if (ingresarUsuario==1){
                silla();
                if (disponible==false){
                    System.out.println("ERROR INGRESE OTRA UBICACION ES POSIBLE QUE LA SILLA QUE USTED SOLICITO NO EXISTA O NO ESTE DISPONIBLE");
                    System.out.println("SE LE MOSTRARA LA SALA CON EL ESTADO ACTUAL DE LAS SILAS");
                    imprimirEstadoSala();
                    System.out.println("POR FAVOR INGRESE NUEVAMENTE TODO EL FORMULARIO");
                    System.out.println("DESEA COMPRAR BOLETA?"+"SI LO DESEA INGRESE 1");
                }
                else {
                    System.out.println("DESEA COMPRAR BOLETA?"+"SI LO DESEA INGRESE 1");
                    disponible=false;
                }
            }
        } 
    }
    private void silla(){
        Scanner sc1=new Scanner(System.in);
        int ingresarUsuario; 
        byte tipo1,edad;
        String nombre;
        String genero;
        System.out.println("INGRESE EL NUMERO DE SILLA QUE DESEA");
        ingresarUsuario=sc.nextInt();
        System.out.println("INGRESE LA CLASE DE SILLA QUE DESEA, 1 SI ES GENERAL,2 SI ES PREFERENCIAL,3 SI ES EJECUTIVA"
                + "Y 3 SI ES EJECUTIVA");
        tipo1=sc.nextByte();
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                if ((arraySilla[i][j].getNumero()==ingresarUsuario)&&(arraySilla[i][j].getCliente()==null)&&(arraySilla[i][j].getTipo()==tipo1)){
                    System.out.println("LA SILLA SOLICITADA ESTA DISPONIBLE");
                    System.out.println("INGRESE SU NOMBRE");
                    nombre=sc1.nextLine();
                    System.out.println("INGRESE SU EDAD");
                    edad=sc.nextByte();
                    System.out.println("INGRESE SU GENERO POR LETRA ES DECIR M PARA MASCULINO F PARA FEMENINO");
                    genero=sc1.nextLine();
                    Cliente c1= new Cliente(nombre,edad,genero);
                    arraySilla[i][j].setCliente(c1);
                    taquilla+=arraySilla[i][j].getCliente().getTaquilla();
                    disponible=true;
                    arraySilla[i][j].setEstado("OCUPADO");
                }
            }
        }
    }
    private void imprimirEstadoSala(){
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.print(" "+arraySilla[i][j].getEstado());
            }
            System.out.print("\n");
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
