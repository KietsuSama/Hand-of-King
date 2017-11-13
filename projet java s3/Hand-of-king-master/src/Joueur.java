package src;

import java.util.ArrayList;

/**
 * Created by Lucas on 30/10/2017.
 */
public class Joueur {
    private ArrayList<Carte> cimetierre = new ArrayList<Carte>();
    private int point = 0;
    private ArrayList<Banniere> liste_banniere = new ArrayList<Banniere>();
     int[] point_par_famille = {0,0,0,0,0,0,0,0};


    public Joueur(){}

    public int getPoint(){
        return point;
    }

    public ArrayList<Carte> getCimetierre(){
        return cimetierre;
    }

    public ArrayList<Banniere> getBanniere(){
        return liste_banniere;
    }

    public void add_Cimetierre(Carte c){
        this.cimetierre.add(c);
        int num = (c.getFamille().getNombre_membre())-2;
        this.point_par_famille[num] += 1;
    }

    public int[] getPoint_par_famille(){
        return point_par_famille;
    }

    public void add_Banniere(Banniere b){
        this.liste_banniere.add(b);
    }

    public int getPoint_emplacement_famille(int i){
        return point_par_famille[i];
    }


}
