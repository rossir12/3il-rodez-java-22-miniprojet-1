package fr.ecole3il.rodez2023.perlin.terrain.carte;

public class TerrainInexistantException extends IllegalArgumentException {
    // constructeur qui initialise l'exception avec un message
    public TerrainInexistantException(String message) {
        super(message);
    }
}
