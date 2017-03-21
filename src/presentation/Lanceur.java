package presentation;

import java.util.Scanner;

import metier.Employe;

public class Lanceur {

	public static void main(String[] args) {		
		// creation de plusieurs employés
		long longId = 123456789123L; // specifier L ou l à la fin pour le type long
		Employe e = new Employe("Doe", "John", longId);
		Employe e1 = new Employe("Doe", "Jane", 123);
		Employe e2 = new Employe();
		e2.setId(54536345);
		e2.setNom("Patoulatchi");
		e2.setPrenom("Marcel");

		// afficher les employes crees
		System.out.println(e);
		System.out.println("------------------------------------------");
		System.out.println(e1);
		System.out.println("------------------------------------------");
		System.out.println(e2);
		System.out.println("------------------------------------------");
		
		// creer objet Scanner
		Scanner clavier = new Scanner(System.in);
		
		// demander Nom
		System.out.println("Saisir nom de l'employé : ");
		// recuperer nom
		String nomEmploye = clavier.next();
		
		// demander Prenom
		System.out.println("Saisir prénom de l'employé : ");
		// recuperer Prenom
		String prenomEmploye = clavier.next();
		
		// demander id
		System.out.println("Saisir l'identifiant : ");
		// recuperer id
		Long identifiant = clavier.nextLong();
		
		// creer objet Employe
		Employe e4 = new Employe(nomEmploye, prenomEmploye, identifiant);
		
		// Afficher employé e
		System.out.println(e4);
		
		// fermer stream
		clavier.close();	
	}

}
