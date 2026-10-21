package ens.ma.evaluation2;



public class Main {
	public static void main(String[] args) {
		
	Livreur LivreurMoto1 = new LivreurMoto("M202","Abir",10 ,4);
	Livreur LivreurMoto2 = new LivreurMoto("M101","Ali",8,2);
	Livreur LivreurCamion1 = new LivreurCamion("C303","Bob",15,0.20);
	Livreur LivreurCamion2 = new LivreurCamion("C404","Jean",12,0.10);
	
	Livreur[] livreur = new Livreur[4];
	livreur[0]=LivreurMoto1;
	livreur[1]=LivreurMoto2;
	livreur[2]=LivreurCamion1;
	livreur[0]=LivreurCamion2;
	
	Commande commande1=new Commande("CM123","ville1");
	Commande commande2 = new Commande("CM456","ville2");
	
	
	LivreurMoto2.setResponsable(LivreurMoto1);
	LivreurCamion1.setResponsable(LivreurMoto1);
	LivreurCamion2.setResponsable(LivreurCamion1);
	
	
	for (Livreur l: livreur) {
		l.afficherDetails();
		if (l.getResponsable() != null) {
			System.out.println(" Le responsable est : " + l.getResponsable().nom);
		} else {
			System.out.println(" Pas de responsable");
		}
	}
	
	
	Livraison l1= new Livraison(commande1,LivreurMoto1,30);
	Livraison l2= new Livraison(commande2,LivreurMoto2,20);
	Livraison l3= new Livraison(commande1,LivreurCamion1,40);
	Livraison l4= new Livraison(commande2,LivreurCamion2,50);
	
	
	Livraison[] liv = new Livraison[4];
	liv[0]=l1;
	liv[1]=l2;
	liv[2]=l3;
	liv[4]=l4;
	
	
	for(Livraison l : liv) {
		l.afficherRecapitulatif();
	}
	
	double montantTotal =0.0;
	
	for (Livraison l : liv) {
		
		montantTotal +=l.calculerMontant();
	}
	
	System.out.println("\n <<<<<<<< Total >>>>>>>>");
	System.out.println("\n Le montant total e toutes les livraisons : " +montantTotal+ " DH");
}
	
	
}	

