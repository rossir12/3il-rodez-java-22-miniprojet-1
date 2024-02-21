package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class DetermineurTerrainEnonce implements DetermineurTerrain {
	/**
	 * Détermine le type de terrain basé sur les paramètres
	 * @param altitude Altitude du terrain
	 * @param hydrometrie Hydrométrie du terrain
	 * @param temperature température du terrain
	 * @return Le TypeTerrain correspondant aux critères spécifiés
	 */
	@Override
	public TypeTerrain determinerTerrain(double altitude, double hydrometrie, double temperature) {
		if (altitude < 0) {
			return TypeTerrain.OCEAN; // Altitude inférieur à 0 = ocean
		} else if (hydrometrie <= 0.25) {
			if (altitude <= 0.7) {
				if (temperature <= 0.25) {
					return TypeTerrain.PLAINE; // Terrain froids et secs
				} else if (temperature <= 0.7) {
					return TypeTerrain.FORET_FEUILLUS; // Terrain tempérés et secs
				} else {
					return TypeTerrain.TOUNDRA; // Terrains chauds et secs
				}
			} else {
				if (temperature <= 0.25) {
					return TypeTerrain.PLAINE; // Terrains froids et secs en haute altitude
				} else if (temperature <= 0.7) {
					return TypeTerrain.FORET_CONIFERES; // Terrains tempérées et secs en haute altitude
				} else {
					return TypeTerrain.MONTAGNE; // Terrains chauds et secs en haute altitude
				}
			}
		} else {
			if (altitude <= 0.7) {
				if (temperature <= 0.25) {
					return TypeTerrain.DESERT; // Terrains froids et humides
				} else if (temperature <= 0.7) {
					return TypeTerrain.COLLINES; // Terrains tempérés et humides
				} else {
					return TypeTerrain.MONTAGNE; // Terrains chauds et humides
				}
			} else {
				if (temperature <= 0.25) {
					return TypeTerrain.MARAIS; // Terrains froids et humides (haute altitude)
				} else if (temperature <= 0.7) {
					return TypeTerrain.FORET_CONIFERES; // Terrains tempérés et humides (haute altitude)
				} else {
					return TypeTerrain.MONTAGNE; // Terrains chauds et humides (haute altitude)
				}
			}
		}
	}

}
