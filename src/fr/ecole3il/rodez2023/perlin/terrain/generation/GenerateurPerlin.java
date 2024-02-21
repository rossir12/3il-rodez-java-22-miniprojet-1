package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.MauvaiseValeurException;

public class GenerateurPerlin extends GenerateurCarte {
    // Instance de BruitPerlin2D pour générer des valeurs de bruit
    private BruitPerlin2D perlinNoise;

    // Constructeur qui initialise le générateur avec une graine et une résolution
    public GenerateurPerlin(long graine, double resolution) {
        // Appelle le constructeur de la classe parente
        super(graine);
        // Initialise le BruitPerlin2D avec graine et résolution
        this.perlinNoise = new BruitPerlin2D(graine,resolution);
    }

    // Méthode pour générer un terrain à une position (X et Y) avec une largeur et hauteur donnée
    @Override
    public Terrain genererTerrain(int x, int y, int largeur, int hauteur) throws MauvaiseValeurException {
        // Normalisation des coordonnées x y
            double nx = (double) x / largeur;
            double ny = (double) y / hauteur;

            // Génération des différentes valeurs
            double altitude = perlinNoise.bruit2D(nx, ny);
            double hydrometrie = perlinNoise.bruit2D(nx, ny);
            double temperature = perlinNoise.bruit2D(nx, ny);

            // Retourne une nouvelle instance de Terrain avec des valeurs générées
            return new Terrain(altitude, hydrometrie, temperature);



    }
}
