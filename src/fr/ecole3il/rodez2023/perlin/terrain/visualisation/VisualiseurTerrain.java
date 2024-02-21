package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

import fr.ecole3il.rodez2023.perlin.terrain.carte.Carte;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;

public class VisualiseurTerrain {
    // Instance de Carte qui contient le terrain
    private Carte carte;

    // Constructeur qui initialise le visualiseur avec une carte spécifique
    public VisualiseurTerrain(Carte carte) {
        this.carte = carte;
    }

    // Méthode pour obtenir la carte associée au visualiseur
    protected Carte getCarte(){
        return this.carte;
    }

    // Méthode pour obtenir l'affichage de l'altiude à une position donnée (x et y)
    public AltitudeAffichee getAltitudeAffichee(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        return AltitudeAffichee.determinerAltitude(terrain.getAltitude());
    }

    // Méthode pour obtenir l'affichage de l'hydrométrie à une position donnée (x et y)
    public HydrometrieAffichee getHydrometrieAffichee(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        return HydrometrieAffichee.determinerHydrometrie(terrain.getHydrometrie());
    }

    // Méthode pour obtenir l'affichage de la température à une position donnée (x et y)
    public TemperatureAffichee getTemperatureAffichee(int x, int y) {
        Terrain terrain = carte.getTerrain(x, y);
        return TemperatureAffichee.determinerTemperature(terrain.getTemperature());
    }
}
