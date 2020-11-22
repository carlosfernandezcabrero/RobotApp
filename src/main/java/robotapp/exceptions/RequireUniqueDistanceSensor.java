package robotapp.exceptions;

public class RequireUniqueDistanceSensor extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigoRobot;
	private String tipoSensor;

	/**
	 * Constructor
	 * @param codigoRobot
	 * @param tipoSensor
	 */
    public RequireUniqueDistanceSensor(String codigoRobot, String tipoSensor){
        this.codigoRobot = codigoRobot;
        this.tipoSensor = tipoSensor;
    }

    @Override
    public String getMessage() {
        return "Ya se ha configurado el robot con identificador " + this.codigoRobot + " con un sensor de distancia de diferente tipo (" + this.tipoSensor + ").";
    }
}
