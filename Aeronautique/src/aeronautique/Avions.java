package aeronautique;

public class Avions {
	private int NUM_AV;
	private String nomAv;
	private int capacite;
	private String loc;
	private int enPlus;
	
	
	@Override
	public String toString() {
		return "Avions [NUM_AV=" + NUM_AV + ", nomAv=" + nomAv + ", capacite=" + capacite + ", loc=" + loc + "]";
	}


	public Avions(int nUM_AV, String nomAv, int capacite, String loc) {
		super();
		NUM_AV = nUM_AV;
		this.nomAv = nomAv;
		this.capacite = capacite;
		this.loc = loc;
		this.enPlus=15;
	}


	
	public int getNUM_AV() {
		return NUM_AV;
	}


	public void setNUM_AV(int nUM_AV) {
		NUM_AV = nUM_AV;
	}


	public String getNomAv() {
		return nomAv;
	}


	public void setNomAv(String nomAv) {
		this.nomAv = nomAv;
	}


	public int getCapacite() {
		return capacite;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}
	
}
