public class Experto extends Programador{
	private int AñosExperiencia;
	private int sueldo;
	
	public Experto (String Rut, int SueldoBase, int AñosExperiencia, int sueldo) {
		super(Rut,SueldoBase);
		this.AñosExperiencia = AñosExperiencia;
		this.sueldo = sueldo;
		
	}

	public int getAñosExperiencia() {
		return AñosExperiencia;
	}

	public void setAñosExperiencia(int añosExperiencia) {
		AñosExperiencia = añosExperiencia;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Experto [AñosExperiencia=" + AñosExperiencia + ", sueldo=" + sueldo + "]";
	}

	
	
	
}
