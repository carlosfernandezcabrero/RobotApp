package models;

import java.util.ArrayList;
import java.util.Calendar;

public class Pedido {

    private String idPedido;
    private String direccionEnvio;
    private String idCliente;
    private Calendar fecha;
    private boolean premieum;
    private ArrayList<Robot> listaRobots;

    public Pedido(){
        listaRobots = new ArrayList<Robot>();
    }

    public void agregarRobots(Robot robot){
        listaRobots.add(robot);
    }

    public void eliminarRobot(String identificador){
        int cont = 0;

        for (Robot i : listaRobots){
            if (i.getIdentificador().equalsIgnoreCase(identificador)){
                listaRobots.remove(cont);
                break;
            }
            cont++;
        }
    }

    public void buscarRobot(String identificador){
    	boolean flag = false;
    	
        for (Robot i : listaRobots){
            if (i.getIdentificador().equalsIgnoreCase((identificador))){
                System.out.println(i.toString());
                flag = true;
                break;
            }
        }
        
        if (!flag) {
        	System.out.println("No se encontro el robot especificado");
        }
    }

    public void listarRobotsIterator(){
        for(Robot i : listaRobots){
            System.out.println(i.toString());
        }
    }

    public void imprimirPedido(){
    	int cont = 0;
    	
        System.out.println("Precio total: " + getPrecioTotal());
        System.out.println("Precio de los robots por separado:");
        for (Robot i : listaRobots){
        	cont++;
            System.out.println(cont + ". " + i.getIdentificador() + ": " + i.getPrecioVenta());
        }
    }

    private double getPrecioTotal(){
        double precioTotal = 0;

        for (Robot i : listaRobots){
            precioTotal += i.getPrecioVenta();
        }

        return precioTotal;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public boolean isPremieum() {
        return premieum;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public void setPremieum(boolean premieum) {
        this.premieum = premieum;
    }
}
