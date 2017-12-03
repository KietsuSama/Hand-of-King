
/**
 * Created by Lucas on 30/10/2017.
 */
public class Launcher {

    public static void main(String[] args) {

        Controller jeu = new Controller();
        jeu.initStyle(1);// 1 pour pokemon et 2 pour mort
        jeu.init_Joueur();
        jeu.init_Carte();
        jeu.init_Carte_Compagnon();
        jeu.init_banniere();
        jeu.set_Plateau();
    }
}