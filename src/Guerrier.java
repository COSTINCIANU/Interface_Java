import java.util.Random;

public class Guerrier extends  Personnage{
    private int bonusDefense;
    private static final Random random = new Random();

    public Guerrier(String nom, int vie, int attaque, int defense, int bonusDefense) {
        super(nom, vie, attaque, defense);
        this.bonusDefense = bonusDefense;
    }

    public int getBonusDefense() { return bonusDefense; }
    public void setBonusDefense(int bonusDefense) { this.bonusDefense = bonusDefense; }


    // Redéfinition de la méthode attaquer avec 5%  de chance de renforcer sa défance
    @Override
    public void attaquer(Personnage cible) {
        if(random.nextInt(10) < 5) {
            setVie(getVie() + bonusDefense);
            System.out.println(getNom() + " rentorce sa défance et gagne " + bonusDefense + " points de vie !");
        }
        super.attaquer(cible);
    }
}
