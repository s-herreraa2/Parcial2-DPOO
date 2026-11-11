package parcial2.excepciones;

public class ACeroException extends Exception{
	private int a;
	private int b;
	private int c;
	
	public ACeroException(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public String getMessage() {
		return "a no puede ser igual a cero";
	}
}
