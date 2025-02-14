public class Partie {
    private Personnage joueur1;
    private Personnage joueur2;
    private int nbrTour;

    public Partie(Personnage joueur1, Personnage joueur2, int nbrTour) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.nbrTour = nbrTour;
    }


    public void lancerPartie() {
        System.out.println("Début du combat entre " + joueur1.getNom() + " et " + joueur2.getNom());
        while (nbrTour > 0 && joueur1.getVie() > 0 && joueur2.getVie() > 0 ) {
            joueur1.attaquer(joueur2);
            // Vérification si le joueur 2 est KO
            if (joueur2.getVie() <= 0) break;
            joueur2.attaquer(joueur1);
            // Vérification si le joueur 2 est KO
            if(joueur1.getVie() <= 0) break;

            nbrTour--;
            System.out.println("Tours restants : " + nbrTour);
        }

        if (joueur1.getVie() <= 0 && joueur2.getVie() <= 0) {
            System.out.println("Match nul !");
        } else if (joueur1.getVie() <= 0) {
            System.out.println("Le vainqueur est " + joueur2.getNom());
        } else if (joueur2.getVie() <= 0) {
            System.out.println("Le vainqueur est " + joueur1.getNom());
        } else {
            System.out.println("Match terminé, égalité !");
        }
    }
}
