package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum AltitudeAffichee {
    // Enumération des différentes catégories d'altitude
    FOND_MARIN, BASSE, MOYENNE, ELEVEE;

    /**
     * Méthode static pour déterminer la catégorie de l'altitude en fonction d'une valeur donnée
     * @param altitude La valeur de l'altitude
     * @return  La catégorie de l'altitude correspondante
     */
    public static AltitudeAffichee determinerAltitude(double altitude) {
        // Si l'altitude est négative, affiche Fond_marin
        if (altitude < 0) return FOND_MARIN;
        // Si l'atitude est inférieur à 0.33 mais supérieur à 0, affiche basse
        if (altitude < 0.33) return BASSE;
        // Si l'altitude est inférieur à 0.66 mais supérieur à 0.33 affiche Moyenne
        if (altitude < 0.66) return MOYENNE;
        // Si l'altitude est supérieur à 0.66 affiche Elevee
        return ELEVEE;
    }
}
