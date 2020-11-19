package robotapp;
import java.util.Calendar;

import robotapp.exceptions.RequireUniqueDistanceSensor;
import robotapp.exceptions.RequireUniqueLDRSensor;
import robotapp.models.Pedido;
import robotapp.models.Robot;
import robotapp.models.tipoSensores.CCD;
import robotapp.models.tipoSensores.Infrarrojos;
import robotapp.models.tipoSensores.LDR;
import robotapp.models.tipoSensores.LDR.SensibilidadLDR;
import robotapp.models.tipoSensores.Obstaculos.SensibilidadObstaculo;
import robotapp.models.tipoSensores.Obstaculos;
import robotapp.models.tipoSensores.Presion;
import robotapp.models.tipoSensores.Ultrasonido;

class Principal {

	public static void main(String[] args) {
		
		// GENERACION DE OBJETOS
		CCD sensorCCD = new CCD();
		sensorCCD.setCodigoFabricante("FB18293");
		sensorCCD.setCodigoSensor("83001-S");
		sensorCCD.setDescripcion("Sensor para la realización de capturas de imágenes");
		sensorCCD.setNombreFabricante("Atlassian Sensores");
		sensorCCD.setPrecio(10);
		sensorCCD.setResolucionMaxima(200);
		
		Infrarrojos sensorInfrarrojos1 = new Infrarrojos();
		sensorInfrarrojos1.setCodigoFabricante("FB18293");
		sensorInfrarrojos1.setCodigoSensor("83002-S");
		sensorInfrarrojos1.setDescripcion("Sensor para el cálculo de distancias cortas");
		sensorInfrarrojos1.setNombreFabricante("Atlassian Sensores");
		sensorInfrarrojos1.setPrecio(8);
		sensorInfrarrojos1.setAlcanceMinimo(100);
		
		Infrarrojos sensorInfrarrojos2 = new Infrarrojos();
		sensorInfrarrojos2.setCodigoFabricante("FB18293");
		sensorInfrarrojos2.setCodigoSensor("83006-S");
		sensorInfrarrojos2.setDescripcion("Sensor para el cálculo de distancias cortas");
		sensorInfrarrojos2.setNombreFabricante("Atlassian Sensores");
		sensorInfrarrojos2.setPrecio(8);
		sensorInfrarrojos2.setAlcanceMinimo(100);
		
		LDR sensorLDR1 = new LDR();
		sensorLDR1.setCodigoFabricante("FB18293");
		sensorLDR1.setCodigoSensor("83003-S");
		sensorLDR1.setDescripcion("Sensor para detectar si es de día o de noche y encender el sistema de iluminación del robot");
		sensorLDR1.setNombreFabricante("Atlassian Sensores");
		sensorLDR1.setPrecio(8);
		sensorLDR1.setSensibilidadLDR(SensibilidadLDR.ALTA);
		
		LDR sensorLDR2 = new LDR();
		sensorLDR2.setCodigoFabricante("FB18293");
		sensorLDR2.setCodigoSensor("83004-S");
		sensorLDR2.setDescripcion("Sensor para detectar si es de día o de noche y encender el sistema de iluminación del robot");
		sensorLDR2.setNombreFabricante("Atlassian Sensores");
		sensorLDR2.setPrecio(8);
		sensorLDR2.setSensibilidadLDR(SensibilidadLDR.BAJA);
		
		Obstaculos sensorObstaculos = new Obstaculos();
		sensorObstaculos.setCodigoFabricante("FB18293");
		sensorObstaculos.setCodigoSensor("83010-S");
		sensorObstaculos.setDescripcion("Sensor para medidores de fuerza");
		sensorObstaculos.setNombreFabricante("Atlassian Sensores");
		sensorObstaculos.setPrecio(12);
		sensorObstaculos.setSensibilidadObstaculo(SensibilidadObstaculo.MEDIA);
		
		Presion sensorPresion = new Presion();
		sensorPresion.setCodigoFabricante("FB18293");
		sensorPresion.setCodigoSensor("83008-S");
		sensorPresion.setDescripcion("Sensor para medidores de fuerza");
		sensorPresion.setNombreFabricante("Atlassian Sensores");
		sensorPresion.setPrecio(12);
		sensorPresion.setDeteccionMaxima(200);
		
		Ultrasonido sensorUltrasonido1 = new Ultrasonido();
		sensorUltrasonido1.setCodigoFabricante("FB18293");
		sensorUltrasonido1.setCodigoSensor("83005-S");
		sensorUltrasonido1.setDescripcion("Sensor para calcular la distancia entre el robot y un objeto");
		sensorUltrasonido1.setNombreFabricante("Atlassian Sensores");
		sensorUltrasonido1.setPrecio(12);
		sensorUltrasonido1.setAlcanceMaximo(900);
		
		Ultrasonido sensorUltrasonido2 = new Ultrasonido();
		sensorUltrasonido2.setCodigoFabricante("FB18293");
		sensorUltrasonido2.setCodigoSensor("83007-S");
		sensorUltrasonido2.setDescripcion("Sensor para calcular la distancia entre el robot y un objeto");
		sensorUltrasonido2.setNombreFabricante("Atlassian Sensores");
		sensorUltrasonido2.setPrecio(4);
		sensorUltrasonido2.setAlcanceMaximo(1000);
		
		Robot robot1 = new Robot();
		robot1.setIdentificador("8465-RB");
		robot1.agregarSensor(sensorCCD);
		robot1.agregarSensor(sensorInfrarrojos1);
		robot1.agregarSensor(sensorInfrarrojos2);
		robot1.agregarSensor(sensorLDR1);
		robot1.agregarSensor(sensorPresion);
		try {
			robot1.agregarSensor(sensorLDR2);
		} catch ( RequireUniqueLDRSensor e ) {
			System.out.println("ERROR: " + e.getMessage());
		}
		try {
			robot1.agregarSensor(sensorUltrasonido1);
		} catch ( RequireUniqueDistanceSensor e ) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		Robot robot2 = new Robot();
		robot2.setIdentificador("8466-RB");
		
		Robot robot3 = new Robot();
		robot3.setIdentificador("8467-RB");
		robot3.agregarSensor(sensorUltrasonido1);
		robot3.agregarSensor(sensorUltrasonido2);
		robot3.agregarSensor(sensorPresion);
		robot3.agregarSensor(sensorObstaculos);
		try {
			robot3.agregarSensor(sensorInfrarrojos1);
		} catch ( RequireUniqueDistanceSensor e ) {
			System.out.println("ERROR: " + e.getMessage());
		}
		
		Robot robot4 = new Robot();
		robot4.setIdentificador("8468-RB");
		
		Robot robot5 = new Robot();
		robot5.setIdentificador("8469-RB");
		
		Robot robot6 = new Robot();
		robot6.setIdentificador("8470-RB");
		
		Robot robot7 = new Robot();
		robot7.setIdentificador("8471-RB");
		
		Pedido pedido1 = new Pedido();
		pedido1.setDireccionEnvio("C/ Avenida del paraiso 7");
		pedido1.setFecha(Calendar.getInstance());
		pedido1.setIdCliente("26098");
		pedido1.setIdPedido("18290-FK");
		pedido1.setPremieum(true);
		pedido1.agregarRobots(robot1);
		pedido1.agregarRobots(robot4);
		pedido1.agregarRobots(robot5);
		pedido1.agregarRobots(robot6);
		pedido1.agregarRobots(robot7);
		
		Pedido pedido2 = new Pedido();
		pedido2.setDireccionEnvio("C/ Desengaño 21");
		pedido2.setFecha(Calendar.getInstance());
		pedido2.setIdCliente("26098");
		pedido2.setIdPedido("18291-FK");
		pedido2.setPremieum(false);
		pedido2.agregarRobots(robot3);
		pedido2.agregarRobots(robot4);
		pedido2.agregarRobots(robot5);
		pedido2.agregarRobots(robot6);
		pedido2.agregarRobots(robot7);
		
		// USO DE LOS OBJETOS
		// PEDIDO 1
		System.out.println();
		System.out.println("********************************************************************");
		System.out.println("*                        PEDIDO 1 : " + pedido1.getIdPedido() + "                       *");
		System.out.println("********************************************************************");
		System.out.println();
		System.out.print("Buscando su robot con identificador " + robot2.getIdentificador() + ": ");
		pedido1.buscarRobot(robot2.getIdentificador());
		System.out.println();
		System.out.println("Imprimiendo su pedido con identificador " + pedido1.getIdPedido() + ":");
		pedido1.imprimirPedido();
		System.out.println();
		System.out.println("Imprimiendo los la lista de robots del pedido:");
		pedido1.listarRobotsIterator();
		
		System.out.println();
		System.out.println("La configuracion del robot con identificador " + robot1.getIdentificador() + " es: ");
		robot1.precioVenta();
		System.out.println();
		System.out.println("Imprimiendo la lista de sensores del robot con identificador " + robot1.getIdentificador() + ":");
		robot1.listarSensoresForEach();
		System.out.println();
		System.out.println("Mostrando las caracteristicas del sensor con identificador " + sensorCCD.getCodigoSensor() + ":");
		robot1.buscarSensor(sensorCCD.getCodigoSensor());
		
		
		// PEDIDO 2
		System.out.println();
		System.out.println("********************************************************************");
		System.out.println("*                        PEDIDO 2 : " + pedido2.getIdPedido() + "                       *");
		System.out.println("********************************************************************");
		System.out.println();
		System.out.println("Imprimiendo su pedido con identificador " + pedido2.getIdPedido() + ":");
		pedido2.imprimirPedido();
		System.out.println();
		System.out.println("Imprimiendo los la lista de robots del pedido:");
		pedido2.listarRobotsIterator();
		
		System.out.println();
		System.out.println("La configuracion del robot con identificador " + robot3.getIdentificador() + " es: ");
		robot3.precioVenta();
		System.out.println();
		System.out.println("Imprimiendo la lista de sensores del robot con identificador " + robot3.getIdentificador() + ":");
		robot3.listarSensoresForEach();
		System.out.println();
		System.out.println("Mostrando las cracteristicas del sensor con identificador " + sensorCCD.getCodigoSensor() + ":");
		robot3.buscarSensor(sensorUltrasonido1.getCodigoSensor());
		
		// PRUEBAS DE BORRADO
		System.out.println();
		System.out.println("Borrando el sensor con identificador " + sensorCCD.getCodigoSensor() + " ...");
		robot1.eliminarSensor(sensorCCD.getCodigoSensor());
		System.out.println("Comprobando que se elimino correctamente:");
		robot1.buscarSensor(sensorCCD.getCodigoSensor());
		
		System.out.println();
		System.out.println("Borrando el robot con identificador " + robot1.getIdentificador() + " del pedido con identificador " + pedido1.getIdPedido() + " ...");
		pedido1.eliminarRobot(robot1.getIdentificador());
		System.out.println("Comprobando que se elimino correctamente:");
		pedido1.buscarRobot(robot1.getIdentificador());
	}

}
