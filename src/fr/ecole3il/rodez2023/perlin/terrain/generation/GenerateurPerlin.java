package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.math.BruitPerlin2D;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.elements.MauvaiseValeurException;

public class GenerateurPerlin extends GenerateurCarte {
    private BruitPerlin2D perlinNoise;

    public GenerateurPerlin(long graine, double resolution) {
        super(graine);
        this.perlinNoise = new BruitPerlin2D(graine,resolution);
    }

    @Override
    public Terrain genererTerrain(int x, int y, int largeur, int hauteur) throws MauvaiseValeurException {
            double nx = (double) x / largeur;
            double ny = (double) y / hauteur;

            // Génération des valeurs avec différentes graines
            double altitude = perlinNoise.bruit2D(nx, ny);
            double hydrometrie = perlinNoise.bruit2D(nx, ny);
            double temperature = perlinNoise.bruit2D(nx, ny);

            return new Terrain(altitude, hydrometrie, temperature);
        // Normalisation des coordonnées



    }
}
