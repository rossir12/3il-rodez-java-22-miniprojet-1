package fr.ecole3il.rodez2023.perlin.terrain.carte;

public class TerrainInexistantException extends IllegalArgumentException {
    public TerrainInexistantException(String message) {
        super(message);
    }
}
