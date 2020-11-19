package robotapp.models;

import java.util.ArrayList;
import java.util.Calendar;

public class Pedido {

    private String idPedido;
    private String direccionEnvio;
    private String idCliente;
    private Calendar fecha;
    private boolean premieum;
    private ArrayList<Robot> listaRobots;
    
    /**
     * Contructor vacio
     */
    public Pedido(){
        listaRobots = new ArrayList<Robot>();
    }
    
    /**
     * Metodo para agregar un robot al pedido
     * @param robot
     */
    public void agregarRobots(Robot robot){
        listaRobots.add(robot);
    }
    
    /**
     * Metodo para eliminar un robot del pedido
     * @param identificador
     */
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
    
    /**
     * Metodo para buscar un robot en el pedido
     * @param identificador
     */
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
    
    /**
     * Metodo para listar los robots del pedido
     */
    public void listarRobotsIterator(){
        for(Robot i : listaRobots){
            System.out.println(i.toString());
        }
    }
    
    /**
     * Metodo que muestra los detalles del pedido
     */
    public void imprimirPedido(){
    	int cont = 0;
    	
        System.out.println("Precio total: " + getPrecioTotal());
        System.out.println("Precio de los robots por separado:");
        for (Robot i : listaRobots){
        	cont++;
            System.out.println(cont + ". " + i.getIdentificador() + ": " + i.getPrecioVenta());
        }
    }
    
    /**
     * Metodo auxiliar para calcular el precio total del pedido
     * @return
     */
    private double getPrecioTotal(){
        double precioTotal = 0;
        int descuento;
        double descuentoDouble;
        
        for (Robot i : listaRobots){
            precioTotal += i.getPrecioVenta();
        }
        
        descuento = listaRobots.size() / 5;
        
        if (descuento > 5) {
        	descuento = 5;
        }
        
        descuentoDouble = descuento;

        precioTotal = precioTotal * ((10 - descuentoDouble) / 10);
        
        if (premieum) {
        	precioTotal *= 0.85;
        }

        return Math.round(precioTotal * 100.0)/100.0;
    }

    /**
     * Getter de idPedido
     * @return String
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * Getter de direccionEnvio
     * @return String
     */
    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    /**
     * Getter de idCliente
     * @return String
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * Getter de fecha
     * @return Calendar
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * Getter de premieum
     * @return boolean
     */
    public boolean isPremieum() {
        return premieum;
    }

    /**
     * Setter
     * @param idPedido
     */
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Setter
     * @param direccionEnvio
     */
    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    /**
     * Setter
     * @param idCliente
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Setter
     * @param fecha
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    /**
     * Setter
     * @param premieum
     */
    public void setPremieum(boolean premieum) {
        this.premieum = premieum;
    }
}
