package fr.ecole3il.rodez2023.perlin.terrain.elements;

import java.awt.image.BufferedImage;

import fr.ecole3il.rodez2023.perlin.Utils;

public enum TypeTerrain {
    PLAGE("Plage"),
    FORET("Forêt"),
    MONTAGNE("Montagne"),
    PLAINE("Plaine");

    private final String nom;

    TypeTerrain(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public BufferedImage getImage() {
        return Utils.chargerTuile(nom);
    }

    @Override
    public String toString() {
        return nom;
    }
}
