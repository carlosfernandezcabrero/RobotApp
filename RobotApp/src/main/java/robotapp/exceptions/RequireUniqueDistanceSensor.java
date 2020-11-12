package robotapp.exceptions;

public class RequireUniqueDistanceSensor extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigoRobot;

    public RequireUniqueDistanceSensor(String codigoRobot){
        this.codigoRobot = codigoRobot;
    }

    @Override
    public String getMessage() {
        return "Ya se ha configurado el robot con identificador " + this.codigoRobot + " con un sensor de distancia de diferente tipo";
    }
}
