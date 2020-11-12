package models.tipoSensores;

import models.Sensor;

public class Obstaculos extends Sensor {
	
	public enum SensibilidadObstaculo {
	    ALTA("Alta"),
	    MEDIA("Media"),
	    BAJA("Baja");

	    private String sensibilidad;

	    SensibilidadObstaculo(String sensibilidad){
	        this.sensibilidad = sensibilidad;
	    }

		public String getSensibilidad() {
			return sensibilidad;
		}
	    
	}

    SensibilidadObstaculo sensibilidad;

    public SensibilidadObstaculo getSensibilidadObstaculo() {
        return sensibilidad;
    }

    public void setSensibilidadObstaculo(SensibilidadObstaculo sensibilidadObstaculo) {
        this.sensibilidad = sensibilidadObstaculo;
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			sensibilidad=" + sensibilidad.getSensibilidad() + "\n" +
				"		}\n";
	}

}
