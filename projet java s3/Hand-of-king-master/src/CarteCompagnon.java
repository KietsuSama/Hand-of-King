import javax.swing.*;

/**
 * Created by Lucas on 30/10/2017.
 */
public class CarteCompagnon {

    private ImageIcon icone;
    private String nom;
    int id;

    public CarteCompagnon(String nom, int effet, String nom_de_limage){
        this.nom = nom;
        this.icone = new ImageIcon(nom_de_limage);
        this.id = effet;
    }

    public CarteCompagnon(){}


}
