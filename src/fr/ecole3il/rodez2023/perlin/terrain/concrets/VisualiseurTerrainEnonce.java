package fr.ecole3il.rodez2023.perlin.terrain.concrets;

import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.TypeTerrain;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.*;

public class VisualiseurTerrainEnonce extends VisualiseurTerrain {
	//public VisualiseurTerrainEnonce(Carte c) {
		//super(new DetermineurTerrainEnonce(), c);
	//}
	private DetermineurTerrainEnonce determineur = new DetermineurTerrainEnonce();
	public VisualiseurTerrainEnonce(Carte carte) {
		super(carte);
	}
	public TypeTerrain getTypeTerrain(int x, int y) {
		Terrain terrain = getCarte().getTerrain(x,y);
		return determineur.determinerTerrain(
				terrain.getAltitude(),
				terrain.getHydrometrie(),
				terrain.getTemperature()
		);
	}
}
