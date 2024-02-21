package fr.ecole3il.rodez2023.perlin.terrain.visualisation;

public enum HydrometrieAffichee {
    // Enumération des différentes catégories pour l'hydrométrie
    SEC, MOYEN, HUMIDE;

    public static HydrometrieAffichee determinerHydrometrie(double hydrometrie) {
        // Si l'hydrométrie est inférieur à 0.33, affiche sec
        if (hydrometrie < 0.33) return SEC;
        // Si l'hydrométrie est inférieur à 0.66 mais supérieur ou égale à 0.33, affiche moyen
        if (hydrometrie < 0.66) return MOYEN;
        // Si l'hydrométrie est supérieur à 0.66, affiche Humide
        return HUMIDE;
    }
}
