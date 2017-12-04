import javax.swing.*;
import java.awt.*;

/**
 * Created by Lucas on 30/10/2017.
 */
public class Carte extends JPanel {

    private ImageIcon icone;
    private Famille famille;
    private String nom;
    boolean deplacement = false;

    public Carte(String nom, Famille famille, String nom_de_limage){
        this.nom = nom;
        this.famille = famille;
        this.icone = new ImageIcon(nom_de_limage);
    }

    public void setBoolean_deplacement(Boolean oui){
        this.deplacement = oui;
    }

    public ImageIcon getIcone() {
        return icone;
    }

    public Famille getFamille(){
        return this.famille;
    }

    public String getNom() {
        return nom;
    }
}
