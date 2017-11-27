/**
 * Created by Lucas on 30/10/2017.
 */
public class Launcher {

    public static void main(String[] args) {

        Controller jeu = new Controller();
        jeu.initStyle(2);// 1 pour pokemon et 2 pour mort
        jeu.init_Joueur();
        jeu.init_Carte();
        jeu.init_Carte_Compagnon();
        jeu.init_banniere();
        jeu.set_Plateau();
  /*
        jeu.setcompagon();
*/
        /*int tour_de_jeu = 0;
        /*for (int k = 0; k< jeu.plateau.length; k+=6){ //affichega du plateau de base
            System.out.println(jeu.plateau[k].getNom() + "  |  "+jeu.plateau[k+1].getNom()+ "  |  "+jeu.plateau[k+2].getNom()+ "  |  "+jeu.plateau[k+3].getNom()+ "  |  "+jeu.plateau[k+4].getNom()+ "  |  "+jeu.plateau[k+5].getNom());
        }
        while (jeu.getPossibilité() == true){ //tnt qu'il y a des possibilités

            if (tour_de_jeu%2 == 0) {
                System.out.println("le joueur n°0 JOUE");
                jeu.jouer(0); //joue
                System.out.println("le joueur n°0 a comme carte prise :   ");
                for (int i =0; i < jeu.joueur.get(jeu.joueurActif).getCimetierre().size(); i++) {
                    System.out.println(jeu.joueur.get(jeu.joueurActif).getCimetierre().get(i).getNom()); //affiche le cimetierre du joueur
                }
                System.out.println("");
                System.out.println("");


             ///////////////////////////////////////////////////////////////////////////////////////////////////////////

            } else  if (tour_de_jeu%2 == 1){
                System.out.println("le joueur n°1 JOUE");
                jeu.jouer(1); // joue
                System.out.println("le joueur n°1 a comme carte(s) prise(s) :   ");
                for (int i =0; i < jeu.joueur.get(jeu.joueurActif).getCimetierre().size(); i++) {
                    System.out.println(jeu.joueur.get(jeu.joueurActif).getCimetierre().get(i).getNom()); //affiche le cimetierre du joueur
                }
                System.out.println("\n\n");
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////
            tour_de_jeu++;
            for (int k = 0; k< jeu.plateau.length; k+=6){
                System.out.println(jeu.plateau[k].getNom() + "  |  "+jeu.plateau[k+1].getNom()+ "  |  "+jeu.plateau[k+2].getNom()+ "  |  "+jeu.plateau[k+3].getNom()+ "  |  "+jeu.plateau[k+4].getNom()+ "  |  "+jeu.plateau[k+5].getNom());
            } //affiche le plateau apres avoir jouer

        }

        //si il n'y a plus de possibilités
        System.out.println("\n\n\n\n\n\n\n\n\n");

        System.out.println("On peut plus jouer !");
        for (int k = 0; k< jeu.plateau.length; k+=6){
            System.out.println(jeu.plateau[k].getNom() + "  |  "+jeu.plateau[k+1].getNom()+ "  |  "+jeu.plateau[k+2].getNom()+ "  |  "+jeu.plateau[k+3].getNom()+ "  |  "+jeu.plateau[k+4].getNom()+ "  |  "+jeu.plateau[k+5].getNom());
        } //affiche une derniere fois le plateau final
    }*/
    }
}