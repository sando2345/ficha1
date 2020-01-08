

public abstract class Programador {
	private String Rut;
	private int SueldoBase;
	public Programador(String Rut, int SueldoBase) {	
		this.Rut = Rut;
		this.SueldoBase = SueldoBase;
	}
	public String getRut() {
		return Rut;
	}
	public void setRut(String rut) {

		Rut = rut;
	}
	public int getSueldoBase() {
		return SueldoBase;
	}
	public void setSueldoBase(int sueldoBase) {
		SueldoBase = sueldoBase;
	}
	@Override
	public String toString() {
		return "Programador [Rut=" + Rut + ", SueldoBase=" + SueldoBase + "]";
	}
	
	
}
