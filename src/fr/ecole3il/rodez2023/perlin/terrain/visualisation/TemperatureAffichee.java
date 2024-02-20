package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum TemperatureAffichee {
    FROID, TEMPERE, CHAUD;

    public static TemperatureAffichee determinerTemperature(double temperature) {
        if (temperature < 0.33) return FROID;
        if (temperature < 0.66) return TEMPERE;
        return CHAUD;
    }
}
