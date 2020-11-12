package robotapp.models.tipoSensores;

import robotapp.models.Sensor;

public class Presion extends Sensor {

    private int deteccionMaxima;

    public int getDeteccionMaxima() {
        return deteccionMaxima;
    }

    public void setDeteccionMaxima(int deteccionMaxima) {
        this.deteccionMaxima = deteccionMaxima;
    }
    
    public void printInfo(){
    	super.printInfo();
    	System.out.println("Deteccion maxima: " + this.deteccionMaxima + " N/mm2");
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			deteccion maxima=" + deteccionMaxima + " N/mm2\n" +
				"		}\n";
	}
}
