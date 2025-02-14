import java.util.Random;

public class Personnage {
    private String nom;
    private int vie;
    private int attaque;
    private int defense;

    // Constructeur vide
    public Personnage() {}

    // Constructeur avec des paramètres
    public Personnage(String nom, int vie, int attaque, int defense) {
        this.nom = nom;
        this.vie = vie;
        this.attaque = attaque;
        this.defense = defense;
    }


    // Getters et Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public int getVie(){ return vie; }
    public void setVie(int vie) { this.vie = vie; }

    public int getAttaque() { return attaque; }
    public void setAttaque(int attaque) { this.attaque = attaque; }

    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }


    // Méthode attaquer
    public void attaquer(Personnage cible) {
        // Les dégâts ne peuvent pas être négatifs
        int degats = Math.max(0, this.attaque - cible.getDefense());
        cible.setVie(cible.getVie() - degats);
        System.out.println(this.nom + " attaque " + cible.getNom() + " et lui inflige " + degats + " points de dégâts.");

    }

}
