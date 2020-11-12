package models.tipoSensores;

import models.Sensor;

public class Infrarrojos extends Sensor {

    private int alcanceMinimo;

    public int getAlcanceMinimo() {
        return alcanceMinimo;
    }

    public void setAlcanceMinimo(int alcanceMinimo) {
        this.alcanceMinimo = alcanceMinimo;
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			alcance minimo=" + alcanceMinimo + "\n" +
				"		}\n";
	}
    
}
