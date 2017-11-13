package src;

import javax.swing.*;

/**
 * Created by Lucas on 30/10/2017.
 */
public class CarteCompagnon {

    private ImageIcon icone;
    private String nom;
    int effet;

    public CarteCompagnon(String nom, int effet, String nom_de_limage){
        this.nom = nom;
        this.icone = new ImageIcon(nom_de_limage);
        this.effet = effet;
    }

    public CarteCompagnon(){}


}
