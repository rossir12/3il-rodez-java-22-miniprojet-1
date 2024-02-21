package fr.ecole3il.rodez2023.perlin.terrain.elements;

public class MauvaiseValeurException extends Exception {
    private static final long serialVersionUID = 1L;

    /**
     * Constructeur de l'exception qui prend un message décrivant la raison de l'erreur
     * @param message Le message pour l'exception
     */
    public MauvaiseValeurException(String message) {
        super(message);
    }
}
