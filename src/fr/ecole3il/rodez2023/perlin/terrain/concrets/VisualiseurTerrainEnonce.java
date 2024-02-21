package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.*;

public class VisualiseurTerrainEnonce extends VisualiseurTerrain {
	private DetermineurTerrainEnonce determineur = new DetermineurTerrainEnonce();

	/**
	 * Constructeur qui initialise le visualiseur avec une carte donnée
	 * @param carte La carte sur laquelle le visualiseur opère
	 */
	public VisualiseurTerrainEnonce(Carte carte) {
		// Appel du constructeur de la classe parente
		super(carte);
	}

	/**
	 * Détermine le type de terrain à une position spécifique sur la carte
	 * @param x La coordonnée horizonatale de la position sur la carte
	 * @param y La coordonnée verticale de la position sur la carte
	 * @return Le TypeTerrain correspondant aux caractéristiques du terrain à la position (xy)
	 */
	public TypeTerrain getTypeTerrain(int x, int y) {
		Terrain terrain = getCarte().getTerrain(x,y);
		return determineur.determinerTerrain(
				terrain.getAltitude(),
				terrain.getHydrometrie(),
				terrain.getTemperature()
		);
	}
}
