package fr.ecole3il.rodez2023.perlin.math;

import java.util.Random;

/**
 * La classe RandomNoise étend la classe Noise2D et génère du bruit aléatoire en deux dimensions.
 * Elle utilise la classe Random de Java pour générer des valeurs aléatoires.
 */
public class BruitAleatoire extends Bruit2D {
    public BruitAleatoire(long graine, double resolution);
    
    public static void Bruit2D(long graine, double resolution) {
    	Random rnd = new Random();
    	rnd.setSeed(graine);
    }
}
