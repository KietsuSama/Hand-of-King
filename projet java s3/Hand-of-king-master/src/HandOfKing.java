import javax.swing.*;
import java.util.ArrayList;

/**
 * Created by Lucas on 30/10/2017.
 */
public class HandOfKing extends JFrame {

    ArrayList<Banniere> Bannieres =new ArrayList<Banniere>();
    ArrayList<CarteCompagnon> Carte_de_compagnons =new ArrayList<CarteCompagnon>();
    Carte[] Cartes =new Carte[36];


    public HandOfKing(){}

    public Carte[] getCartes() {
        return Cartes;
    }

    public ArrayList<Banniere> getBannieres() {
        return Bannieres;
    }

    public ArrayList<CarteCompagnon> getCarte_de_compagnons() {
        return Carte_de_compagnons;
    }

    public void add_Carte(Carte c, int pos){
        this.Cartes[pos] = c;
    }

    public void add_Carte_de_compagnon(CarteCompagnon c){
        this.Carte_de_compagnons.add(c);
    }

    public void add_Banniere(Banniere banniere){
        this.Bannieres.add(banniere);
    }

    public void setCartes(int n, Carte c){
        this.Cartes[n] = null;
        this.Cartes[n] = c;
    }

    public void removeCompagnon(int i){
        Carte_de_compagnons.remove(i);
    }



}
