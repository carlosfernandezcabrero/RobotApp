package robotapp.models;

public class Sensor {

    private String nombreFabricante;
    private String codigoFabricante;
    private String codigoSensor;
    private String detalles;
    private double precioFabrica;

    /**
     * Metodo que muestra los detalles del sensor
     */
    public void printInfo(){
        System.out.println("Fabricante: " + this.getNombreFabricante());
        System.out.println("Código del Fabricante: " + this.getCodigoFabricante());
        System.out.println("Referencia del sensor: " + this.getCodigoSensor());
        System.out.println("Detalles: " + this.getDetalles());
        System.out.println("Precio: " + this.getPrecioFabrica());
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
     * Getter de precioFabrica
     * @return double
     */
    public double getPrecioFabrica() {
        return precioFabrica;
    }

    /**
     * Setter
     * @param precioFabrica
     */
    public void setPrecioFabrica(double precioFabrica) {
        this.precioFabrica = precioFabrica;
    }

    @Override
    public String toString() {
        return "		Sensor{\n" +
                "			nombre fabricante='" + this.getNombreFabricante() + "'\n" +
                "			codigo fabricante='" + this.getCodigoFabricante() + "'\n" +
                "			codigo sensor='" + this.getCodigoSensor() + "'\n" +
                "			detalles='" + this.getDetalles() + "'\n" +
                "			precio de fabrica=" + this.getPrecioFabrica() + "\n";
    }
}
