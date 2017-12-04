/**
 * Created by Lucas on 30/10/2017.
 */


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControlButton implements ActionListener {

    private View view;
    private Controller modele;
    int tourj = 0;
    private ArrayList x = new ArrayList(); //le chemin possible a emprunter


    public ControlButton(View v, Controller modele) {
        this.view = v;
        this.modele = modele;
    }

    public int getPosition(ActionEvent e) {
        int reponse = 0;
        for (int i = 0; i < 36; i++) {//parcours toutes les cases...
            if (e.getSource() == view.plateau[i]) {//...si la case correspond...
                reponse = i;
            }
        }
        return reponse;//...alors je la retourne
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ((JButton)e.getSource() == view.cimetierre2){
            //creer une fenetre qui affiche le cimetierre j1
            view.creerCimetiereJ1();

        } else if ((JButton)e.getSource() == view.cimetierre3){
            //creer une fenetre qui affiche le cimetierre j2
            view.creerCimetiereJ2();
        } else {
            if (modele.compagnonOk) {
                if (modele.effetCompagnon(tourj % 2, modele.compagnons_set.get(0).id, getPosition(e)) == 0) {
                    tourj++;
                }
            } else {
                int pos = getPosition(e);
                boolean valid = modele.jouer(tourj % 2, pos);
                if (valid) {
                    if (!modele.compagnonOk) {
                        tourj++;
                    }
                }
            }
        }
    }
}



