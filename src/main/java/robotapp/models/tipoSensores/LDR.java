package robotapp.models.tipoSensores;

import robotapp.models.Sensor;

public class LDR extends Sensor {
	
	public enum SensibilidadLDR {
		ALTA("Alta"),
		BAJA("Baja");
		
		private final String sensibilidad;
		
		SensibilidadLDR(String sensibilidad){
			this.sensibilidad = sensibilidad;
		}
		
		public String getSensibilidad() {
			return this.sensibilidad;
		}
	};

    private SensibilidadLDR sensibilidad;

    public SensibilidadLDR getSensibilidadLDR() {
        return this.sensibilidad;
    }

    public void setSensibilidadLDR(SensibilidadLDR sensibilidad) {
        this.sensibilidad = sensibilidad;
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
