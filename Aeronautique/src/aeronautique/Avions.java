package aeronautique;

public class Avions {
	private int NUM_AV;
	private String nomAv;
	private int capacite;
	private String loc;
	
	
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
	}
	
}
