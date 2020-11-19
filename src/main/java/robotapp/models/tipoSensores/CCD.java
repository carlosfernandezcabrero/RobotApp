package robotapp.models.tipoSensores;

import robotapp.models.Sensor;

public class CCD extends Sensor {

    private int resolucionMaxima;

    public int getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(int resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }
    
    public void printInfo(){
    	super.printInfo();
    	System.out.println("Resolucion maxima: " + this.resolucionMaxima + " ppp");
    }

	@Override
	public String toString() {
		return super.toString() +
				"			resolucion maxima=" + resolucionMaxima + " ppp\n" +
				"		}\n";
	}

}
