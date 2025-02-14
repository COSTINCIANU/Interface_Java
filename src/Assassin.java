import java.util.Random;

public class Assassin  extends  Personnage {
    private int bonusAttaque;
    private static final Random random = new Random();


    public Assassin(String nom, int vie, int attaque, int defense, int bonusAttaque) {
        super(nom, vie, attaque, defense);
        this.bonusAttaque = bonusAttaque;
    }

    public int getBonusAttaque() { return bonusAttaque; }
    public void setBonusAttaque(int bonusAttaque) { this.bonusAttaque = bonusAttaque ;}

    // Redéfinition de la méthode attaquer avec 5% de chance de coup critique
    @Override
    public void attaquer(Personnage cible) {
        int attaqueEffective = getAttaque();
        // 5% de chance
        if (random.nextInt(100) < 5) {
            attaqueEffective += bonusAttaque;
            System.out.println(getNom() + " réaliser un coup critique ! (Attaque augumentée de " + bonusAttaque + ")");

            int degats = Math.max(0, attaqueEffective - cible.getDefense());
            cible.setVie(cible.getVie() - degats);
            System.out.println(getNom() + " attaque " + cible.getNom() + " et lui inflige " + degats + " points de dégâts.");
        }
    }








}
