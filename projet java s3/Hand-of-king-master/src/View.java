package src; /**
 * Created by Lucas on 30/10/2017.
 */
import src.Carte;
import src.ControlButton;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class View extends JFrame {
       JButton[] plateau;
       ArrayList<Carte> tous =new ArrayList<Carte>();
       ControlButton cb= new ControlButton(this);


       public View(Carte[]cartes){

              initAttribut();
              initPlateau(cartes);
              creerPaneau();
              setSize(750,750);
              setVisible(true);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }

       public void initAttribut(){

              setTitle("Hand of King");

              plateau = new JButton[36];

              for (int i =0 ; i<36; i++){
                  plateau[i]= new JButton();
                  plateau[i].setSize(20,20);

              }
              for(int i=0;i<36;i++) {
                  plateau[i].setBackground(Color.white);
              }
       }
       public void initPlateau(Carte[] cartes){
           for (int i = 0;i<36;i++ ){
               plateau[i].setIcon(cartes[i].getIcone());



           }
       }

       public void creerPaneau(){
              JPanel jeu= new JPanel(new GridLayout(6,6));
              for(int i=0;i<36;i++){
                     jeu.add(plateau[i]);
                     plateau[i].addActionListener(cb);
              }
              setContentPane(jeu);
       }


}