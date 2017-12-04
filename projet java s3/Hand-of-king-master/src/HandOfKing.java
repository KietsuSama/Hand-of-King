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

    public void add_Carte(Carte c, int pos){
        this.cartes[pos] = c;
    }
}
