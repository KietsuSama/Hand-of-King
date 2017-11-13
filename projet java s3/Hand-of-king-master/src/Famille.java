package src;

import java.util.ArrayList;

/**
 * Created by Lucas on 30/10/2017.
 */
public class Famille {


    private String nom;
    private int nombre_membre = 0;
    private int membre_vivant = 0;
    public Banniere banniere;

    public Famille(String s, int i){
        this.nom = s;
        this.nombre_membre = i;
        this.membre_vivant = i;
        this.banniere = new Banniere(this,i);
    }

    public Famille(){}

    public String getNom() {
        return nom;
    }

    public int getNombre_membre(){
        return nombre_membre;
    }

    public int getMembre_vivant(){
        return membre_vivant;
    }
     public Banniere getBanniere(){
        return banniere;
     }
    public void mort(){
        membre_vivant--;
    }



}
