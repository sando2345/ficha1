public class Novato extends Programador {
	private int CantLenguajes;

	public Novato(String Rut, int SueldoBase, int CantLenguajes) {
		super(Rut, SueldoBase);
		this.CantLenguajes = CantLenguajes;
		
	}
	public int getCantLenguajes() {
		return CantLenguajes;
	}
	public void setCantLenguajes(int cantLenguajes) {
		CantLenguajes = cantLenguajes;
	}

	@Override
	public String toString() {
		return "Novato [CantLenguajes=" + CantLenguajes + "]";
	}

	
}
