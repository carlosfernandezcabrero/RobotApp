package models;

public class Sensor {

    private String nombreFabricante;
    private String codigoFabricante;
    private String codigoSensor;
    private String detalles;
    private double precio;

    public void printInfo(){

        System.out.println("Fabricante: " + this.getNombreFabricante());
        System.out.println("Código del Fabricante: " + this.getCodigoFabricante());
        System.out.println("Referencia del sensor: " + this.getCodigoSensor());
        System.out.println("Detalles: " + this.getDetalles());
        System.out.println("Precio: " + this.getPrecio());

    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public String getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(String codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public String getCodigoSensor() {
        return codigoSensor;
    }

    public void setCodigoSensor(String codigoSensor) {
        this.codigoSensor = codigoSensor;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDescripcion(String detalles) {
        this.detalles = detalles;
    }

    public double getPrecio() {
        return precio;
    }

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
