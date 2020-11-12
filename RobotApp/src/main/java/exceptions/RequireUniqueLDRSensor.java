package exceptions;

public class RequireUniqueLDRSensor extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigoSensor;

    public RequireUniqueLDRSensor(String codigoSensor){
        this.codigoSensor = codigoSensor;
    }

    @Override
    public String getMessage() {
        return "Ya se ha configurado el robot con identificador " + this.codigoSensor + " con un sensor LDR";
    }
}
