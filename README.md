## Commençons simplement

### Les maths

#### Faites du bruit

On peut commencer directement par le code de la classe `Bruit2D`. C'est censé être une classe abstraite de définition du bruit, mais on dirait que celui qui l'a développé s'est arrêté en plein milieu...

**Question :** pourquoi l'attribut graine est-il en final ?

**Réponse :** L'attribut `graine` dans la classe `Bruit2D` est déclaré comme `final` pour garantir son immutabilité, assurant ainsi la reproductibilité et la cohérence des séquences de bruit générées. Cette conception renforce également la sécurité des threads et la clarté de l'interface de la classe.

## Un peu de modélisation objet dans votre Perlin ?

Soufflez un peu. Vous avez fini la partie la plus mathématique du sujet. Passons à la partie modélisation, que vous adorez déjà !

On cherche à réaliser un générateur de carte 2D avec différents types de terrains (une grille de cases, à l'ancienne).

Voici les terrains que l'on souhaite pouvoir manipuler :

- des collines
- des déserts
- des forêts de conifères
- des forêts de feuillus
- des marais
- des montagnes
- des océans
- des plaines
- des toundra

On pourrait, par exemple, construire une classe pour chaque, qui hériterait de `Terrain`, comme classe mère.

**Question :** Réaliser l'architecture que prendrait la forme d'une telle modélisation sous forme d'un diagramme UML. Quelle serait la différence d'attributs et de méthodes entre ces classes ? Expliquer, en s'appuyant sur un exercice vu en cours, pourquoi c'est une mauvaise idée. Quelle est la solution qu'il faudrait préférer (et que l'on va préférer) ?

**Réponse :**
![img.png](img.png)

### Modélisons le (type de) terrain

Si vous remarquez le dossier `data`, il contient les images des différents types de terrain que l'on va gérer. Voici la description exhaustive :

- Collines : hills.png
- Désert : desert.png
- Forêt de conifères : coniferous_forest.png
- Forêt de feuillus : deciduous_forest.png
- Marais : marsh.png
- Montagne : mountain.png
- Océan : ocean.png
- Plaine : plain.png
- Toundra : tundra.png

Dans le paquet `fr.ecole3il.rodez2023.perlin.terrain.elements`, implémentez `TypeTerrain` selon votre réponse à la question précédente.

On demandera un accesseur particulier, `getImage()`, qui doit renvoyer un élément de type `java.awt.image.BufferedImage`. Utilisez la fonction `Utils.chargerTuile` pour cela. Minimisez le nombre d'attributs (en théorie, deux suffisent).

N'oubliez pas la méthode `toString()`, qui convertit votre `TypeTerrain` en chaîne de caractère (son nom en français, par exemple ?).

### Au terrain, maintenant

La plupart des jeux de type bac à sable utilisent trois valeurs pour générer ce qui est nécessaire à la détermination d'un élément : son altitude, son hydrométrie, et sa température. Ça tombe bien, on va suivre plus ou moins (en simplifiant) ce principe.

Créez la classe `Terrain` qui comportera trois accesseurs (un pour l'hydrométrie, un pour la température, et un pour l'altitude) - `getHydrometrie`, `getTemperature` et `getAltitude`. On veut pouvoir rentrer des informations décimales suffisamment précises (au moins en double précision).

**Question :** quel type utilisez-vous ?

**Réponse :** 
J'utilise le type double permettant d'obtenir une meilleur précision, convenable pour stocker des valeurs décimales.