public class SistemaProgramadoresImpl implements SistemaProgramadores{
	private ListaProgramadores lp;
	public SistemaProgramadoresImpl() {
		this.lp = new ListaProgramadores(100);
	}
	public boolean ingresarNovato(String Rut, int SueldoBase,int CantLenguajes) {
		Novato n = new Novato(Rut,SueldoBase,CantLenguajes);
		boolean ingreso = lp.ingresar(n);
		return ingreso;
	}
	public boolean ingresarExperto(String Rut, int SueldoBase, int AñosExperiencia) {
		int sueldo = SueldoBase + (250000*AñosExperiencia);
		Experto e = new Experto(Rut,SueldoBase,AñosExperiencia,sueldo);
		boolean ingreso = lp.ingresar(e);
		return ingreso;
	}
	public String ObtenerDatosProgramadores() {
		String salida = "\nDatos de los programadores\n:";
		for(int i = 0;i<lp.getCantProgramadores();i++) {
			Programador p = lp.getProgramadorI(i);
			salida = salida + p.toString();
		}
		return salida;
	}
	
}
