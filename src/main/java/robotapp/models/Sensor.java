package robotapp.models;

public class Sensor {

    private String nombreFabricante;
    private String codigoFabricante;
    private String codigoSensor;
    private String detalles;
    private double precio;

    /**
     * Metodo que muestra los detalles del sensor
     */
    public void printInfo(){
        System.out.println("Fabricante: " + this.getNombreFabricante());
        System.out.println("Código del Fabricante: " + this.getCodigoFabricante());
        System.out.println("Referencia del sensor: " + this.getCodigoSensor());
        System.out.println("Detalles: " + this.getDetalles());
        System.out.println("Precio: " + this.getPrecio());
    }

    /**
     * Getter de nombreFabricante
     * @return String
     */
    public String getNombreFabricante() {
        return nombreFabricante;
    }

    /**
     * Setter
     * @param nombreFabricante
     */
    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    /**
     * Getter de codigoFabricante
     * @return String
     */
    public String getCodigoFabricante() {
        return codigoFabricante;
    }

    /**
     * Setter
     * @param codigoFabricante
     */
    public void setCodigoFabricante(String codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    /**
     * Getter de codigoSensor
     * @return String
     */
    public String getCodigoSensor() {
        return codigoSensor;
    }

    /**
     * Setter
     * @param codigoSensor
     */
    public void setCodigoSensor(String codigoSensor) {
        this.codigoSensor = codigoSensor;
    }

    /**
     * Getter de detalles
     * @return String
     */
    public String getDetalles() {
        return detalles;
    }

    /**
     * Setter
     * @param detalles
     */
    public void setDescripcion(String detalles) {
        this.detalles = detalles;
    }

    /**
     * Getter de precio
     * @return double
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter
     * @param precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "		Sensor{\n" +
                "			nombre fabricante='" + nombreFabricante + "'\n" +
                "			codigo fabricante='" + codigoFabricante + "'\n" +
                "			codigo sensor='" + codigoSensor + "'\n" +
                "			detalles='" + detalles + "'\n" +
                "			precio=" + precio + "\n";
    }
}
