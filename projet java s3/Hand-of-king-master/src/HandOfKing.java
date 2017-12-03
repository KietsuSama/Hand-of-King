import javax.swing.*;
import java.util.ArrayList;

public class HandOfKing extends JFrame {

    ArrayList<Banniere> bannieres =new ArrayList<Banniere>();
    ArrayList<CarteCompagnon> carte_de_compagnons =new ArrayList<CarteCompagnon>();
    Carte[] cartes =new Carte[36];


    public HandOfKing(){}

    public Carte[] getCartes() {
        return cartes;
    }

    public ArrayList<Banniere> getBannieres() {
        return bannieres;
    }

    public ArrayList<CarteCompagnon> getCarte_de_compagnons() {
        return carte_de_compagnons;
    }

    public void add_Carte(Carte c, int pos){
        this.cartes[pos] = c;
    }

    public void add_Carte_de_compagnon(CarteCompagnon c){
        this.carte_de_compagnons.add(c);
    }

    public void add_Banniere(Banniere banniere){
        this.bannieres.add(banniere);
    }

    public void setCartes(int n, Carte c){
        this.cartes[n] = null;
        this.cartes[n] = c;
    }

    public void removeCompagnon(int i){
        carte_de_compagnons.remove(i);
    }



}
