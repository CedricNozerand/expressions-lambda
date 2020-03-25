package com.ensup.data.presentation;

import com.ensup.data.metier.Personne;
import com.ensup.data.service.IJeu;

public class Main {
	
	// Interface fonctionnelle dans la javadoc: "creator" et "ShortToByteFunction" 
	
	public static void main(String[] args) {
		
		// Premi�re version
		Personne p = new Personne();
		p.jouer(new IJeu() {

			@Override
			public void jouer() {
				System.out.println("je joue");
			}
			
		});
		
		// Deuxi�me version
		
		p.jouer(() -> System.out.println("Je joue test"));
		
	}
}
