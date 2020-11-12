package models.tipoSensores;

import models.Sensor;

public class Presion extends Sensor {

    private int deteccionMaxima;

    public int getDeteccionMaxima() {
        return deteccionMaxima;
    }

    public void setDeteccionMaxima(int deteccionMaxima) {
        this.deteccionMaxima = deteccionMaxima;
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			deteccion maxima=" + deteccionMaxima + "\n" +
				"		}\n";
	}
}
