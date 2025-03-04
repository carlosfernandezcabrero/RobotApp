package robotapp.exceptions;

public class RequireUniqueLDRSensor extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigoRobot;

	/**
	 * Constructor
	 * @param codigoRobot
	 */
    public RequireUniqueLDRSensor(String codigoRobot){
        this.codigoRobot = codigoRobot;
    }

    @Override
    public String getMessage() {
        return "Ya se ha configurado el robot con identificador " + this.codigoRobot + " con un sensor LDR.";
    }
}
