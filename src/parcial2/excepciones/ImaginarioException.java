package parcial2.excepciones;

public class ImaginarioException extends Exception{
	private int a;
	private int b;
	private int c;
	
	public ImaginarioException(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Override
	public String getMessage() {
		return "x1 y x2 no existen en los números reales";
	}
}
