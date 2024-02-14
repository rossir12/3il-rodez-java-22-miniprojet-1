package fr.ecole3il.rodez2023.perlin.terrain.elements;
import fr.ecole3il.rodez2023.perlin.terrain.visualisation.DetermineurTerrain;


public class Terrain {
    private double hydrometrie;
    private double temperature;
    private double altitude;

    // Constructeur
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

    // Méthode pour limiter et définir l'hydrométrie
    public void setHydrometrie(double hydrometrie) throws MauvaiseValeurException {
        if (hydrometrie < 0 || hydrometrie > 1) {
            throw new MauvaiseValeurException("L'hydrométrie doit être comprise entre 0 et 1.");
        }
        this.hydrometrie = hydrometrie;
    }

    // Méthode pour limiter et définir la température
    public void setTemperature(double temperature) throws MauvaiseValeurException {
        if (temperature < 0 || temperature > 1) {
            throw new MauvaiseValeurException("La température doit être comprise entre 0 et 1.");
        }
        this.temperature = temperature;
    }

    // Méthode pour limiter et définir l'altitude
    public void setAltitude(double altitude) throws MauvaiseValeurException {
        if (altitude < -1 || altitude > 1) {
            throw new MauvaiseValeurException("L'altitude doit être comprise entre -1 et 1.");
        }
        this.altitude = altitude;
    }

    // Méthode pour accepter un visiteur et retourner le type de terrain
    public TypeTerrain getTypeTerrain(DetermineurTerrain dt) {
        return dt.determinerTerrain(altitude, hydrometrie, temperature);
    }
}
