package fr.ecole3il.rodez2023.perlin.terrain.carte;

import java.util.Scanner;

import fr.ecole3il.rodez2023.perlin.terrain.elements.MauvaiseValeurException;
import fr.ecole3il.rodez2023.perlin.terrain.elements.Terrain;
import fr.ecole3il.rodez2023.perlin.terrain.generation.GenerateurCarte;

public class Carte {
    private String nom;
    private int largeur;
    private int hauteur;
    private Terrain[][] terrains;

    public Carte(String nom, int largeur, int hauteur, GenerateurCarte generateurCarte) {
        this.nom = nom;
        this.largeur = largeur;
        this.hauteur = hauteur;
        this.terrains = new Terrain[largeur][hauteur];
        for (int x = 0; x < largeur; x++) {
            for (int y = 0; y < hauteur; y++) {
                terrains[x][y] = generateurCarte.genererTerrain(x, y,largeur,hauteur);
            }
        }
    }
    public Carte(String donneesCarte) {
        try(Scanner scanner = new Scanner(donneesCarte)) {
            // Lecture des données
            this.nom = scanner.nextLine().trim();
            this.largeur = scanner.nextInt();
            this.hauteur = scanner.nextInt();
            scanner.nextLine(); //
            this.terrains = new Terrain[largeur][hauteur]; // Initialisation du tableau de Terrain 

            for(int y = 0; y < hauteur; y++) {
                for(int x = 0; x < largeur; x++) {
                    try {
                        double altitude = scanner.nextDouble();
                        double hydrometrie = scanner.nextDouble();
                        double temperature = scanner.nextDouble();
                        terrains[x][y] = new Terrain(altitude, hydrometrie, temperature);
                    } catch (MauvaiseValeurException e) {
                    System.err.println("Erreur lors de la création du terrain à la position (" + x + ", " + y + ") : " + e.getMessage());
                }
            }
                if (scanner.hasNextLine()) {
                    scanner.nextLine();
                }
            }
        }
    }
    public String getNom() {
        return nom;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public Terrain getTerrain(int x, int y, int largeur, int hauteur) throws TerrainInexistantException {
        if (x < 0 || x >= largeur || y < 0 || y >= hauteur) {
            throw new TerrainInexistantException("Coordonnées hors des limites de la carte.");
        }
        return terrains[x][y];
    }
}
