package models.tipoSensores;

import models.Sensor;

public class CCD extends Sensor {

    private int resolucionMaxima;

    public int getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(int resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

	@Override
	public String toString() {
		return super.toString() +
				"			resolucion maxima=" + resolucionMaxima + "\n" +
				"		}\n";
	}

}
