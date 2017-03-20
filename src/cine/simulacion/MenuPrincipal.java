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
    int totalAsistidos=0;
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
       calcularTaquilla();
       promedioDeHombres();
       promedioMujeres();
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
        if (tipoG==filas){
            System.out.println("TODAS LAS SILLAS SON GENERALES");
        }
        else{
            if (tipoG>filas){
                System.out.println("ERROR EL NUMERO INGRESADO NO ES VALIDO");
                definirTipoSillas();
            }
            System.out.println("QUE NUMERO DE FILAS DESEA PREFERENCIALES");
            tipoP=sc.nextInt();
            if ((tipoP>filas)||(tipoP+tipoG>filas)){
                System.out.println("ERROR EL NUMERO INGRESADO NO ES VALIDO");
                definirTipoSillas();
            }
            if ((tipoP==filas)&&(tipoG==0)){
                System.out.println("TODAS LAS SILLAS SON PREFERENCIALES");
            }
            else{
             System.out.println("QUE NUMERO DE FILAS DESEA EJECTIVAS");
             tipoE=sc.nextInt();
                if ((tipoE==filas)&&(tipoG+tipoP==0)){
                    System.out.println("TODAS LAS SILLAS SON EJECUTIVAS");
                }
                if ((tipoE>filas)||(tipoE+tipoG+tipoP>filas)){
                  System.out.println("ERROR EL NUMERO INGRESADO NO ES VALIDO");
                  definirTipoSillas();
                }
            }
        }
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
        System.out.println("DESEA COMPRAR BOLETA?"+"SI LO DESEA INGRESE 1"+"\nSI NO DESEA INGRESAR MAS CLIENTES INGRESE 4");
        System.out.println("EL VALOR DE LA TAQUILLA ES DE 5000 EN SILLAS GENERALES\n"+"EN SILLAS PREFERENCIALES VALE 6000\n"+"EN SILLAS EJECUTIVAS VALE 7000\n");
        while (true){
            ingresarUsuario= sc.nextByte();
            if (ingresarUsuario==1){
                silla();
                if (disponible==false){
                    System.out.println("ERROR INGRESE OTRA UBICACION ES POSIBLE QUE LA SILLA QUE USTED SOLICITO NO EXISTA O NO ESTE DISPONIBLE");
                    System.out.println("SE LE MOSTRARA LA SALA CON EL ESTADO ACTUAL DE LAS SILAS");
                    imprimirEstadoSala();
                    System.out.println("POR FAVOR INGRESE NUEVAMENTE TODO EL FORMULARIO");
                    System.out.println("DESEA COMPRAR BOLETA?"+"SI LO DESEA INGRESE 1"+"\nSI NO DESEA INGRESAR MAS CLIENTES INGRESE 4");
                }
                else {
                    System.out.println("DESEA COMPRAR BOLETA?"+"SI LO DESEA INGRESE 1"+"\nSI NO DESEA INGRESAR MAS CLIENTES INGRESE 4");
                    System.out.println("EL VALOR DE LA TAQUILLA ES DE 5000 EN SILLAS GENERALES\n"+"EN SILLAS PREFERENCIALES VALE 6000\n"+"EN SILLAS EJECUTIVAS VALE 7000\n");
                    disponible=false;
                }
            }
            else {
                if (ingresarUsuario==4){
                    break;
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
        System.out.println("EL ESTADO DE LA SALA ES");
        imprimirEstadoSala();
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
    private void calcularTaquilla(){
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                if (arraySilla[i][j].getCliente()!=null){
                    if (arraySilla[i][j].getTipo()==2){
                        taquilla+=(arraySilla[i][j].getCliente().getTaquilla())+1000;
                    }
                    else{
                        if (arraySilla[i][j].getTipo()==3){
                            taquilla+=(arraySilla[i][j].getCliente().getTaquilla())+2000;
                        }
                        else{
                        if (arraySilla[i][j].getTipo()==1){
                                taquilla+=(arraySilla[i][j].getCliente().getTaquilla());
                            }
                        }
                    }
                }
            }
        }
        System.out.println("LA TAQUILLA TOTAL ES:"+taquilla);
    }
    private void promedioDeHombres(){
        int numeroHombres=0;
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                if (arraySilla[i][j].getCliente()!=null){
                    totalAsistidos++;
                    if("M".equals(arraySilla[i][j].getCliente().getGenero())){
                        numeroHombres++;
                    }
                }
            }
        }
        numeroHombres=(numeroHombres*100)/totalAsistidos;
        System.out.println("EL PROMEDIO DE HOMBRES CONSIDERANDO COMO EL 100% LAS PERSONAS QUE ASISTIERON ES DE:"+numeroHombres+"%");
    }
    private void promedioMujeres(){
        int numeroMujeres=0;
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                if (arraySilla[i][j].getCliente()!=null){
                        if("F".equals(arraySilla[i][j].getCliente().getGenero())){
                        numeroMujeres++;
                    }
                }
            }
        }
        numeroMujeres=(numeroMujeres*100)/totalAsistidos;
        System.out.println("EL PROMEDIO DE MUJERES CONSIDERANDO COMO EL 100% LAS PERSONAS QUE ASISTIERON ES DE:"+numeroMujeres+"%");
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
