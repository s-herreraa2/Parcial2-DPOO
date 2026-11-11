package parcial2.mundo;

import parcial2.excepciones.*;

public class Parcial {
	
	private int a;
	private int b;
	private int c;
	
	public Parcial(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String FormulaEstudiante() throws Exception{
		//casos q falla : a=0, 4ac> b^2
		
		if(a == 0) {
			throw new ACeroException(this.a, this.b, this.c);
		}
		else if (4*a*c > Math.pow(b, 2)){
			throw new ImaginarioException(this.a, this.b, this.c);
		}
		else {
			double x1 = -b+ (Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
			double x2 = -b- (Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
			return "x1 = " + x1 + ", x2 = " + x2;
		}
	}
	
}
