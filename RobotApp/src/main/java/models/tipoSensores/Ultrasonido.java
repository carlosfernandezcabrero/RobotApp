package models.tipoSensores;

import models.Sensor;

public class Ultrasonido extends Sensor {

    private int alcanceMaximo;

    public int getAlcanceMaximo() {
        return alcanceMaximo;
    }

    public void setAlcanceMaximo(int alcanceMaximo) {
        this.alcanceMaximo = alcanceMaximo;
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			alcance maximo=" + alcanceMaximo + "\n" +
				"		}\n";
	}
}
