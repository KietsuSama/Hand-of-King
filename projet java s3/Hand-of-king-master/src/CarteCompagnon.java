
import javax.swing.*;

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
