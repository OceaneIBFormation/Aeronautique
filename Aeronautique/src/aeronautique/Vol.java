package aeronautique;

import java.util.GregorianCalendar;

public class Vol {
	private int numVol;
	private int numPil;
	private int numAv;
	private String ville_dep;
	private String ville_arr;
	private GregorianCalendar heure_dep;
	private GregorianCalendar heurre_arr;
	
	
	
	public Vol(int numVol, int numPil, int numAv, String ville_dep, String ville_arr, GregorianCalendar heure_dep,
			GregorianCalendar heurre_arr) {
		super();
		this.numVol = numVol;
		this.numPil = numPil;
		this.numAv = numAv;
		this.ville_dep = ville_dep;
		this.ville_arr = ville_arr;
		this.heure_dep = heure_dep;
		this.heurre_arr = heurre_arr;
	}



	@Override
	public String toString() {
		return "Vol [numVol=" + numVol + ", numPil=" + numPil + ", numAv=" + numAv + ", ville_dep=" + ville_dep
				+ ", ville_arr=" + ville_arr + ", heure_dep=" + heure_dep + ", heurre_arr=" + heurre_arr + "]";
	}
	
	

}
