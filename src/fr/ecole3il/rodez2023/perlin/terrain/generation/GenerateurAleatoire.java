package fr.ecole3il.rodez2023.perlin.terrain.generation;

import fr.ecole3il.rodez2023.perlin.terrain.elements.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import java.util.Random;

public class GenerateurAleatoire extends GenerateurCarte {
    private Random random = new Random();

    /**
     * Constructeur du générateur de carte.
     *
     * @param graine La graine utilisée pour la génération de la carte.
     */
    public GenerateurAleatoire(long graine) {
        super(graine);
    }

    @Override
    public Terrain genererTerrain(int i, int j, int largeur, int hauteur) throws MauvaiseValeurException {
        double altitude = random.nextDouble();
        double hydrometrie = random.nextDouble();
        double temperature = random.nextDouble();
        // Assurez-vous que la création de Terrain ci-dessous ne viole pas les contraintes qui pourraient lancer une MauvaiseValeurException
        return new Terrain(altitude, hydrometrie, temperature);
    }

}
