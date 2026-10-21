package ens.ma.evaluation2;

public class Livraison {

	private Commande commande;
	private Livreur livreur;
	private double distance;

	public Livraison(Commande commande, Livreur livreur, double distance) {

		this.commande = commande;
		this.livreur = livreur;
		this.distance = distance;
	}

	public double calculerMontant() {
		return this.livreur.calculerFrais(distance);
	}

	public void afficherRecapitulatif() {

		System.out.println(" <<<<<< Recapitulatif >>>>>> ");
		System.out.println(" Les informations du llivreur : " + this.livreur);
		System.out.println(" Les informations de la  commande : " + this.commande);
		System.out.println(" La distance  parcourue : " + this.distance + " Km ");
		System.out.println(" Le montant de la livraison :  " + this.calculerMontant() + "DH");
		System.out.println(" <<<<<<<<<  >>>>>>>>>");
	}

}
