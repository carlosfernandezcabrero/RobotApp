package robotapp.models.tipoSensores;

import robotapp.models.Sensor;

public class Infrarrojos extends Sensor {

    private int alcanceMinimo;

    /**
     * Getter de alcanceMaximo
     * @return int
     */
    public int getAlcanceMinimo() {
        return alcanceMinimo;
    }

    /**
     * Setter
     * @param alcanceMinimo
     */
    public void setAlcanceMinimo(int alcanceMinimo) {
        this.alcanceMinimo = alcanceMinimo;
    }
    
    @Override
    public void printInfo(){
    	super.printInfo();
    	System.out.println("Alcance minimo: " + this.alcanceMinimo + " cm");
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			alcance minimo=" + alcanceMinimo + " cm\n" +
				"		}";
	}
    
}
