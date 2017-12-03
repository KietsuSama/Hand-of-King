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

    private JButton getJButton(ActionEvent e) {
        for (int i = 0; i < 36; i++) {//meme principe que au dessus
            if (e.getSource() == view.plateau[i]) {
                return view.plateau[i];
            }
        }
        return null;
    }

    public void nord(int i) {
        boucle:
        for (int j = i - 6; j >= 0; j -= 6) {
            for (int p = 0; p < 12; p++) {
                if (view.tous.get(p).position == j) {
                    break boucle;
                }
            }
            x.add(j);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (modele.compagnonOk) {
            if(modele.effetCompagnon(tourj % 2, modele.compagnons_set.get(0).id, getPosition(e)) == 0){
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



