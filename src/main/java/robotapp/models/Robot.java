package robotapp.models;

import robotapp.exceptions.RequireUniqueDistanceSensor;
import robotapp.exceptions.RequireUniqueLDRSensor;
import robotapp.models.tipoSensores.Infrarrojos;
import robotapp.models.tipoSensores.LDR;
import robotapp.models.tipoSensores.Ultrasonido;

import java.util.ArrayList;

public class Robot {

    private String identificador;
    private double precioVenta;
    private ArrayList<Sensor> listaSensores;

    /**
     * Constructor vacio
     */
    public Robot(){
        listaSensores = new ArrayList<Sensor>();
    }

    /**
     * Metodo que agrega un sensor al robot
     * @param sensor
     */
    public void agregarSensor(Sensor sensor){
        for (Sensor i : listaSensores){
            if (sensor instanceof LDR && i instanceof LDR){
                throw new RequireUniqueLDRSensor(sensor.getCodigoSensor());
            } else if (sensor instanceof Infrarrojos && i instanceof Ultrasonido){
                throw new RequireUniqueDistanceSensor(sensor.getCodigoSensor());
            } else if (sensor instanceof Ultrasonido && i instanceof Infrarrojos){
                throw new RequireUniqueDistanceSensor(sensor.getCodigoSensor());
            }
        }
        
        listaSensores.add(sensor);
    }

    /**
     * Metodo que busca un sensor en el robot
     * @param codigoSensor
     */
    public void buscarSensor(String codigoSensor){
    	boolean flag = false;
    	
        for (Sensor i : listaSensores){
            if (i.getCodigoSensor().equalsIgnoreCase(codigoSensor)){
                i.printInfo();
                flag = true;
                break;
            }
        }
        
        if (!flag) {
        	System.out.println("No se encontro el sensor especificado");
        }
    }

    /**
     * Metodo que elimina un sensor del robot
     * @param codigoSensor
     */
    public void eliminarSensor(String codigoSensor){
        int cont = 0;

        for (Sensor i : listaSensores){
            if (i.getCodigoSensor().equalsIgnoreCase(codigoSensor)){
                listaSensores.remove(cont);
                break;
            }
            cont++;
        }
    }

    /**
     * Metodo que lista los sensores del robot
     */
    public void listarSensoresForEach(){
        for (Sensor i : listaSensores){
            System.out.println(i.toString());
        }
    }

    /**
     * Metodo que muestra los detalles de los sensores del robot
     */
    public void precioVenta(){
        StringBuilder sb = new StringBuilder();
        int cont = 0;

        for (Sensor i : listaSensores){
            cont++;
            sb.append(cont + ". " + "Código del sensor: " + i.getCodigoSensor() + "\n");
        }

        System.out.println("Precio de venta: " + this.getPrecioVenta());
        System.out.println("Configuración de sensores:");
        System.out.println(sb);
    }

    /**
     * Getter de identificador
     * @return String
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * Setter
     * @param identificador
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * Getter de precioVenta
     * @return double
     */
    public double getPrecioVenta() {
        precioVenta = 0;

        for (Sensor i : listaSensores){
            precioVenta += i.getPrecioFabrica();
        }

        return Math.round((precioVenta * 1.85) * 100.0)/100.0;
    }

    @Override
    public String toString() {
    	String cad1 = "Robot{\n" +
                "	identificador='" + identificador + "'\n" +
                "	precioVenta=" + this.getPrecioVenta() + "\n" +
                "	listaSensores{\n";
    	
    	StringBuilder cad2 = new StringBuilder();
    	for (Sensor sensor : listaSensores) {
    		cad2.append(sensor.toString());
    	}
    	
    	String cad3 = "	}\n" +
                '}';
        return cad1 + cad2 + cad3;
                
    }
}
