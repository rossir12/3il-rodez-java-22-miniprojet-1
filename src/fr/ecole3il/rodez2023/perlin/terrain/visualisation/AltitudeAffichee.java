package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum AltitudeAffichee {
    FOND_MARIN, BASSE, MOYENNE, ELEVEE;

    public static AltitudeAffichee determinerAltitude(double altitude) {
        if (altitude < 0) return FOND_MARIN;
        if (altitude < 0.33) return BASSE;
        if (altitude < 0.66) return MOYENNE;
        return ELEVEE;
    }
}
