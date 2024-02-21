package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;
import fr.ecole3il.rodez2023.perlin.Utils;

public enum TypeTerrain {
    // Définition des différents type de terrains
    COLLINES("Collines", "hills.png"),
    DESERT("Désert", "desert.png"),
    FORET_CONIFERES("Forêt de conifères", "coniferous_forest.png"),
    FORET_FEUILLUS("Forêt de feuillus", "deciduous_forest.png"),
    MARAIS("Marais", "marsh.png"),
    MONTAGNE("Montagne", "mountain.png"),
    OCEAN("Océan", "ocean.png"),
    PLAINE("Plaine", "plain.png"),
    TOUNDRA("Toundra", "tundra.png");

    private final String nom;
    private final String cheminImage;
    private transient BufferedImage image;

    /**
     *
     * @param nom nom du type de terrain
     * @param cheminImage Le chemin de l'image associée au type de terrain
     */
    TypeTerrain(String nom, String cheminImage) {
        this.nom = nom;
        this.cheminImage = cheminImage;
    }

    /**
     * Charge et retourne l'image associée au type de terrain
     * Si l'image n'a pas encore été chargée, elle est chargée à ce moment et mise en cache pour une utilisation future
     * @return L'imagine BufferedImage associée au type de terrain
     */
    public BufferedImage getImage() {
        if (image == null) {
            image = Utils.chargerTuile(cheminImage);
        }
        return image;
    }

    /**
     *
     * @return Nom du type de terrain
     */
    @Override
    public String toString() {
        return nom;
    }
}
