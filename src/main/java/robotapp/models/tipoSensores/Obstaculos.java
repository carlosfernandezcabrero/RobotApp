package robotapp.models.tipoSensores;

import robotapp.models.Sensor;

public class Obstaculos extends Sensor {
	
	public enum SensibilidadObstaculo {
	    ALTA("Alta"),
	    MEDIA("Media"),
	    BAJA("Baja");

	    private String sensibilidad;

	    /**
	     * Constructor
	     * @param sensibilidad
	     */
	    SensibilidadObstaculo(String sensibilidad){
	        this.sensibilidad = sensibilidad;
	    }

	    /**
	     * Getter de sensibilidad
	     * @return String
	     */
		public String getSensibilidad() {
			return sensibilidad;
		}
	    
	}

    SensibilidadObstaculo sensibilidad;

    /**
     * Getter de sensibilidad
     * @return SensibilidadObstaculo
     */
    public SensibilidadObstaculo getSensibilidadObstaculo() {
        return sensibilidad;
    }

    /**
     * Setter
     * @param sensibilidadObstaculo
     */
    public void setSensibilidadObstaculo(SensibilidadObstaculo sensibilidadObstaculo) {
        this.sensibilidad = sensibilidadObstaculo;
    }
    
    public void printInfo(){
    	super.printInfo();
    	System.out.println("Sensibilidad: " + this.sensibilidad.getSensibilidad());
    }
    
    @Override
	public String toString() {
		return super.toString() +
				"			sensibilidad=" + sensibilidad.getSensibilidad() + "\n" +
				"		}\n";
	}

}
