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

    /**
     *
     * @param i        La position verticale dans la carte.
     * @param j        La position horizontale dans la carte.
     * @param largeur  La largeur totale de la carte.
     * @param hauteur  La hauteur totale de la carte.
     * @return Un objet Terrain avec des valeurs aléatoires
     * @throws MauvaiseValeurException Si les valeurs générées pour le terrain ne respectent pas certaines contraintes
     */
    @Override
    public Terrain genererTerrain(int i, int j, int largeur, int hauteur) throws MauvaiseValeurException {
        double altitude = random.nextDouble();
        double hydrometrie = random.nextDouble();
        double temperature = random.nextDouble();
        // Assurez-vous que la création de Terrain ci-dessous ne viole pas les contraintes qui pourraient lancer une MauvaiseValeurException
        return new Terrain(altitude, hydrometrie, temperature);
    }

}
