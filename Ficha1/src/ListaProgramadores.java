public class ListaProgramadores {
	private Programador []lp;
	private int CantProgramadores;
	private int max;
	
	public ListaProgramadores (int max) {
		lp = new Programador[max];
		this.CantProgramadores = 0;
		this.max = max;
		
	}
    public boolean ingresar(Programador P) {
    	if(CantProgramadores < max) {
    		lp[CantProgramadores] = P;
    		CantProgramadores++;
    		return true;
    	}else {
    		return false;
    	}
    }
	public Programador[] getLp() {
		return lp;
	}
	public void setLp(Programador[] lp) {
		this.lp = lp;
	}
	public int getCantProgramadores() {
		return CantProgramadores;
	}
	public void setCantProgramadores(int cantProgramadores) {
		CantProgramadores = cantProgramadores;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
    public Programador getProgramadorI(int i) {
    	if(i>=0 && i<CantProgramadores) {
    		return lp[i];
    	}else {
    		return null;
    	}
    }
}
