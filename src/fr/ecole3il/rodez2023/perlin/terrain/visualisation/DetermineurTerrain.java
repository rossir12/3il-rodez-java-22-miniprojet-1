package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;

public interface DetermineurTerrain {
	// Définition de l'interface DetermineurTerrain
	// Déclaration d'une méthode abstraite determinerTerrain
	// Cette méthode détermine le type de terrain en fonction des paramètres (altiude,hydrometrie,double)
	public TypeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature);


}
