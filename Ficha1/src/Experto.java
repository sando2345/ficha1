public class Experto extends Programador{
	private int A�osExperiencia;
	private int sueldo;
	
	public Experto (String Rut, int SueldoBase, int A�osExperiencia, int sueldo) {
		super(Rut,SueldoBase);
		this.A�osExperiencia = A�osExperiencia;
		this.sueldo = sueldo;
		
	}

	public int getA�osExperiencia() {
		return A�osExperiencia;
	}

	public void setA�osExperiencia(int a�osExperiencia) {
		A�osExperiencia = a�osExperiencia;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Experto [A�osExperiencia=" + A�osExperiencia + ", sueldo=" + sueldo + "]";
	}

	
	
	
}
