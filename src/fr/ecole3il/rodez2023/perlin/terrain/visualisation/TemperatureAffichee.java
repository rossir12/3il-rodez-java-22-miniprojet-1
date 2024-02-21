package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum TemperatureAffichee {
    // Enumeration des différentes catégories de températures affichées
    FROID, TEMPERE, CHAUD;

    /**
     * Méthode static pour déterminer la catégorie de température en fonction d'une valeur donnée
     * @param temperature La valeur de la température
     * @return  La catégorie de la température correspondante
      */
    public static TemperatureAffichee determinerTemperature(double temperature) {
        // Si la température est inférieur à 0.33, elle est froide
        if (temperature < 0.33) return FROID;
        // Si la température est inférieure à 0.66 mais supérieur ou égale à 0.33 elle est tempéré
        if (temperature < 0.66) return TEMPERE;
        // Si elle est supérieur ou égale à 0.66, la température est chaude
        return CHAUD;
    }
}
