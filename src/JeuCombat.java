public class JeuCombat {
        public static void main(String[] args) {
            Personnage assassin = new Assassin("Gina", 30, 10, 2, 5);
            Personnage guerrier = new Guerrier("Exemple", 40, 8, 5, 3);

            Partie partie = new Partie(assassin, guerrier, 10);
            partie.lancerPartie();
        }
    }

