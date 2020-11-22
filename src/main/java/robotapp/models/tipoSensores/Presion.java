package robotapp.models.tipoSensores;

import robotapp.models.Sensor;

public class Presion extends Sensor {

    private int deteccionMaxima;

    /**
     * Getter de deteccionMaxima
     * @return int
     */
    public int getDeteccionMaxima() {
        return deteccionMaxima;
    }

    /**
     * Setter
     * @param deteccionMaxima
     */
    public void setDeteccionMaxima(int deteccionMaxima) {
        this.deteccionMaxima = deteccionMaxima;
    }
    
    @Override
    public void printInfo(){
    	super.printInfo();
    	System.out.println("Deteccion maxima: " + this.deteccionMaxima + " N/mm2");
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			deteccion maxima=" + deteccionMaxima + " N/mm2\n" +
				"		}";
	}
}
