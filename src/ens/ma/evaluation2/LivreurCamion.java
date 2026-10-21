package ens.ma.evaluation2;

public class LivreurCamion extends Livreur {

	private double tauxMajoration;

	public LivreurCamion(String identifient, String nom, double tarifKm, double tauxMajoration) {
		super(identifient, nom, tarifKm);
		this.tauxMajoration = tauxMajoration;
	}

	@Override
	public double calculerFrais(double distance) {
		double MontantBase = tarifKm * distance;
		double Cout = MontantBase * (1 + tauxMajoration);
		return Cout;
	}

	@Override
	public String toString() {
		return "LivreurCamion son tauxMajoration = " + tauxMajoration ;
	}

	
	
}
