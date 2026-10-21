package ens.ma.evaluation2;

public abstract class Livreur {

	protected String identifient;
	protected String nom;
	protected double tarifKm;
	private Livreur responsable;

	public Livreur(String identifient, String nom, double tarifKm) {

		this.identifient = identifient;
		this.nom = nom;
		this.tarifKm = tarifKm;
		this.responsable = null;
	}

	public String getIdentifient() {
		return identifient;
	}

	public String getNom() {
		return nom;
	}

	public Livreur getResponsable() {
		return responsable;
	}

	public void setResponsable(Livreur responsable) {
		if (responsable != null && responsable.equals(this)) {

			System.out.println(" Un livreur  ne peut pas être le responsable de lui meme ");
		}

		this.responsable = responsable;
	}

	public abstract double calculerFrais(double distance);

	public void afficherDetails() {

		System.out.println(" <<<<< Details du livreur >>>>>>");
		System.out.println(" Son identifient : " + identifient);
		System.out.println(" Son nom : " + nom);
		System.out.println(" Le tarif  : " + tarifKm + " DH");
	}

	@Override
	public String toString() {
		return "  Le livreur a un identifient=" + identifient + ", nom=" + nom + ", tarifKm=" + tarifKm;
	}

}
