package controlefluxo;

//Definição da exceção personalizada
class ParametrosInvalidosException extends Exception {
  	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String message) {
        super(message);
    }
}
