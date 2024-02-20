package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class VisualiseurTerrain {
    private Carte carte;

    public VisualiseurTerrain(Carte carte) {
        this.carte = carte;
    }

    protected Carte getCarte(){
        return this.carte;
    }

    public AltitudeAffichee getAltitudeAffichee(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        return AltitudeAffichee.determinerAltitude(terrain.getAltitude());
    }

    public HydrometrieAffichee getHydrometrieAffichee(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        return HydrometrieAffichee.determinerHydrometrie(terrain.getHydrometrie());
    }

    public TemperatureAffichee getTemperatureAffichee(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        return TemperatureAffichee.determinerTemperature(terrain.getTemperature());
    }
}
