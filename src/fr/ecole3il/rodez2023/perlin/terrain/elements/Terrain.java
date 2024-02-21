package fr.ecole3il.rodez2023.perlin.terrain.elements;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;

public class Terrain {
    private double hydrometrie;
    private double temperature;
    private double altitude;

    /**
     *
     * @param hydrometrie Niveau d'humidité du terrain
     * @param temperature Niveau de température du terrain
     * @param altitude Niveau d'altitude du terrain
     * @throws MauvaiseValeurException Si une des valeurs est hors des limites autorisées
     */
    public Terrain(double hydrometrie, double temperature, double altitude) throws MauvaiseValeurException {
        setHydrometrie(hydrometrie);
        setTemperature(temperature);
        setAltitude(altitude);
    }

    // Accesseurs pour l'hydrométrie, la température et l'altitude
    public double getHydrometrie() {
        return hydrometrie;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getAltitude() {
        return altitude;
    }

    /**
     * Méthode pour définir l'hydrométrie du terrain
     * @param hydrometrie Niveau d'humidité à affecter
     * @throws MauvaiseValeurException Si l'hydrométrie est hors limite
     */
    public void setHydrometrie(double hydrometrie) throws MauvaiseValeurException {
        if (hydrometrie < 0 || hydrometrie > 1) {
            throw new MauvaiseValeurException("L'hydrométrie doit être comprise entre 0 et 1.");
        }
        this.hydrometrie = hydrometrie;
    }

    /**
     * Méthode pour définir la température du terrain
     * @param temperature Niveau de température à affecter
     * @throws MauvaiseValeurException Si la température est hors limite
     */
    public void setTemperature(double temperature) throws MauvaiseValeurException {
        if (temperature < 0 || temperature > 1) {
            throw new MauvaiseValeurException("La température doit être comprise entre 0 et 1.");
        }
        this.temperature = temperature;
    }

    /**
     * Méthode pour définir l'altitude du terrain
     * @param altitude Niveau d'altitude à affecter
     * @throws MauvaiseValeurException Si l'altitude est hors limite
     */
    public void setAltitude(double altitude) throws MauvaiseValeurException {
        if (altitude < -1 || altitude > 1) {
            throw new MauvaiseValeurException("L'altitude doit être comprise entre -1 et 1.");
        }
        this.altitude = altitude;
    }

    /**
     * Méthode avec déterminant de terrain pour obtenir le type de terrain basé sur ses caractéristiques
     * @param dt instance de DetermineurTerrain utilisée pour déterminer le type de terrain
     * @return Le TypeTerrain correspondant aux caractéristiques du terrain
     */
    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {
        return dt.determinerTerrain(altitude, hydrometrie, temperature);
    }
}
