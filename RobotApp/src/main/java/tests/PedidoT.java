package tests;

import models.Pedido;
import models.Robot;
import models.Sensor;

class PedidoT {

    Pedido pedido;

    public PedidoT(){
        this.pedido = new Pedido();
    }

    void agregarRobots(Robot robot) {
        pedido.agregarRobots(robot);
        pedido.buscarRobot(robot.getIdentificador());
    }

    void eliminarRobot(Robot robot) {
        pedido.eliminarRobot(robot.getIdentificador());
        pedido.buscarRobot(robot.getIdentificador());
    }

    void buscarRobot(Robot robot) {
        pedido.buscarRobot(robot.getIdentificador());
    }

    void listarRobotsIterator() {
        pedido.listarRobotsIterator();
    }

    void imprimirPedido() {
        pedido.imprimirPedido();
    }

    public static void main(String[]args){
        Sensor sensor = new Sensor();
        sensor.setCodigoSensor("Sensor Generico");
        sensor.setPrecio(5);

        Robot robot = new Robot();
        robot.setIdentificador("MK20.1");
        robot.agregarSensor(sensor);

        PedidoT pedidoT = new PedidoT();

        System.out.println("Añadiendo robot:");
        pedidoT.agregarRobots(robot);

        System.out.println("\nBuscando robot:");
        pedidoT.buscarRobot(robot);

        System.out.println("\nEliminando robot:");
        pedidoT.eliminarRobot(robot);

        pedidoT.pedido.agregarRobots(robot);

        System.out.println("\nImprimiendo pedido:");
        pedidoT.imprimirPedido();

        System.out.println("\nListando robots:");
        pedidoT.listarRobotsIterator();
    }

}