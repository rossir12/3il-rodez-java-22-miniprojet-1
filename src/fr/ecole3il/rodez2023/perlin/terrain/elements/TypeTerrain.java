package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;
import fr.ecole3il.rodez2023.perlin.Utils;

public enum TypeTerrain {
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

    TypeTerrain(String nom, String cheminImage) {
        this.nom = nom;
        this.cheminImage = cheminImage;
    }

    public BufferedImage getImage() {
        if (image == null) {
            image = Utils.chargerTuile(cheminImage);
        }
        return image;
    }

    @Override
    public String toString() {
        return nom;
    }
}
