package aeronautique;

public class Pilote {
	private String numPil;
	private String nomPil;
	private String adr;
	private int sal;
	
	
	public Pilote(String numPil, String nomPil, String adr, int sal) {
		super();
		this.numPil = numPil;
		this.nomPil = nomPil;
		this.adr = adr;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Pilote [numPil=" + numPil + ", nomPil=" + nomPil + ", adr=" + adr + ", sal=" + sal + "]";
	}
	
	
}
