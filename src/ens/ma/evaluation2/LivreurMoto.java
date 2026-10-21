package ens.ma.evaluation2;

public class LivreurMoto extends Livreur {
	
	private int anciennete;

	public LivreurMoto(String identifient, String nom, double tarifKm, int anciennete) {
		super(identifient, nom, tarifKm);
		this.anciennete = anciennete;
	}

	@Override
	public double calculerFrais(double distance) {
		
		if(anciennete < 3) {
			double cout;
			return cout=tarifKm * distance;
		}else {
			
			return (tarifKm*distance)+(2*distance);
			
		}
		
		
		
		
	}

	@Override
	public String toString() {
		return "LivreurMoto  anciennete=" + anciennete ;
	}

	
	
	

}
