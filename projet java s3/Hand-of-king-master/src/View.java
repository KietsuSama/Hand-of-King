import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class View extends JFrame {

       JButton cimetierre = new JButton();
       JButton cimetierre1 = new JButton();
       JButton[] plateau;
       ControlButton cb = new ControlButton(this);
       ArrayList<Carte> tous = new ArrayList<Carte>();



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
                     plateau[i].setPreferredSize(new Dimension(100,100));
              }
              for(int i=0;i<36;i++) {
                     plateau[i].setBackground(Color.white);
              }

              setVisible(true);

       }
       public void initPlateau(Carte[] cartes){
              for (int i = 0;i<36;i++ ){
                     plateau[i].setIcon(cartes[i].getIcone());
              }
       }

       public void creerPaneau(){

              JPanel pan = new JPanel();
              JPanel pan1 = new JPanel();
              JPanel pan2 = new JPanel();
              JPanel pan3 = new JPanel();
              pan1.setLayout(new GridLayout(6,6));


              for(int i=0;i<36;i++){
                     pan1.add(plateau[i]);
                     plateau[i].addActionListener(cb);
              }
              cimetierre.setIcon(new ImageIcon("pokémon/plateau.png"));
              cimetierre1.setIcon(new ImageIcon("pokémon/plateau.png"));
              pan2.add(cimetierre);
              pan3.add(cimetierre1);
              pan.add(pan3);
              pan.add(pan1);
              pan.add(pan2);
              setContentPane(pan);
              setVisible(true);
       }


}