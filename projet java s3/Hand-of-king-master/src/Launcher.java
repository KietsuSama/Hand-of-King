
/**
 * Created by Lucas on 30/10/2017.
 */
public class Launcher {

    public static void main(String[] args) {
        int style = 1;// 1 pour pokemon et 2 pour mort
        javax.swing.JOptionPane.showMessageDialog(null,"Bienvenue dans le jeu de stratégie Hand Of king !");
        Controller jeu = new Controller();
        jeu.initStyle(style);
        jeu.init_Joueur();
        jeu.init_Carte();
        jeu.init_Carte_Compagnon();
        jeu.init_banniere();
        jeu.set_Plateau();
        jeu.explication(style);
    }
}