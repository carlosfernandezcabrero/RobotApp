package robotapp.models.tipoSensores;

import robotapp.models.Sensor;

public class Infrarrojos extends Sensor {

    private int alcanceMinimo;

    public int getAlcanceMinimo() {
        return alcanceMinimo;
    }

    public void setAlcanceMinimo(int alcanceMinimo) {
        this.alcanceMinimo = alcanceMinimo;
    }
    
    public void printInfo(){
    	super.printInfo();
    	System.out.println("Alcance minimo: " + this.alcanceMinimo + " cm");
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			alcance minimo=" + alcanceMinimo + " cm\n" +
				"		}\n";
	}
    
}
