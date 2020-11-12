package tests;

import models.Robot;
import models.Sensor;

class RobotT {

    Robot robot;

    public RobotT(){
        robot = new Robot();
    }

    void agregarSensorTest(Sensor sensor){
        robot.agregarSensor(sensor);
        robot.buscarSensor(sensor.getCodigoSensor());
    }

    void buscarSensorTest(Sensor sensor){
        robot.buscarSensor(sensor.getCodigoSensor());
    }

    void eliminarSensor(Sensor sensor){
        robot.eliminarSensor(sensor.getCodigoSensor());
        robot.buscarSensor(sensor.getCodigoSensor());
    }

    void listarSensoresForEach(){
        robot.listarSensoresForEach();
    }

    void precioVentaTest(){
        robot.precioVenta();
    }


    public static void main(String[]args){

        RobotT robotTest = new RobotT();

        Sensor sensor1 = new Sensor();
        sensor1.setCodigoFabricante("ATechnology");
        sensor1.setCodigoSensor("MK20.1");
        sensor1.setDescripcion("Sensor de facil montado y gran fiablidad");
        sensor1.setNombreFabricante("Alterna Technology");
        sensor1.setPrecio(5);

        System.out.println("**************************");
        System.out.println("******* BATERIA 1 ********");
        System.out.println("**************************");
        System.out.println("Añadiendo sensor");
        robotTest.agregarSensorTest(sensor1);

        System.out.println("Buscando sensor");
        robotTest.buscarSensorTest(sensor1);

        System.out.println("Eliminando sensor");
        robotTest.eliminarSensor(sensor1);

        System.out.println("**************************");
        System.out.println("********** N/A ***********");
        System.out.println("**************************");
        robotTest.agregarSensorTest(sensor1);

        Sensor sensor2 = new Sensor();
        sensor2.setCodigoFabricante("BTecar");
        sensor2.setCodigoSensor("MK20.2");
        sensor2.setDescripcion("Sensor para robots de interior y gran fiablidad");
        sensor2.setNombreFabricante("Becology Tecar");
        sensor2.setPrecio(10);
        robotTest.agregarSensorTest(sensor2);

        System.out.println("**************************");
        System.out.println("******* BATERIA 2 ********");
        System.out.println("**************************");
        System.out.println("Listando sensores");
        robotTest.listarSensoresForEach();

        System.out.println("Mostrando precio de venta");
        robotTest.precioVentaTest();

    }
}
