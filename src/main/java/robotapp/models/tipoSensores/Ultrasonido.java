package robotapp.models.tipoSensores;

import robotapp.models.Sensor;

public class Ultrasonido extends Sensor {

    private int alcanceMaximo;

    /**
     * Getter de alcanceMaximo
     * @return int
     */
    public int getAlcanceMaximo() {
        return alcanceMaximo;
    }

    /**
     * Setter
     * @param alcanceMaximo
     */
    public void setAlcanceMaximo(int alcanceMaximo) {
        this.alcanceMaximo = alcanceMaximo;
    }
    
    public void printInfo(){
    	super.printInfo();
    	System.out.println("Alcance maximo: " + this.alcanceMaximo + " m");
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			alcance maximo=" + alcanceMaximo + " m\n" +
				"		}\n";
	}
}
