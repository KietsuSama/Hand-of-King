import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class View extends JFrame {

       JButton cimetierre = new JButton();
       JButton cimetierre1 = new JButton();
       JButton cimetierre2 = new JButton();
       JButton cimetierre3 = new JButton();
       JButton imageJ1 = new JButton();
       JButton imageJ2 = new JButton();
       JButton pseudoJ1 = new JButton();
       JButton pseudoJ2 = new JButton();

       JButton[] plateau;
       ControlButton cb = new ControlButton(this);
       ArrayList<Carte> tous = new ArrayList<Carte>();



       public View(Carte[]cartes){

              initAttribut();
              initPlateau(cartes);
              creerPaneau();
              setSize(1000,1000);
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
              JPanel pan4 = new JPanel();
              JPanel pan5 = new JPanel();
              JPanel pan6 = new JPanel();
              JPanel pan7 = new JPanel();
              JPanel pan8 = new JPanel();
              JPanel pan9 = new JPanel();

              //pan.setLayout(new GridLayout(3,3));
              pan1.setLayout(new GridLayout(6,6));


              for(int i=0;i<36;i++){
                     pan1.add(plateau[i]);
                     plateau[i].addActionListener(cb);
              }
              cimetierre.setIcon(new ImageIcon("pokémon/plateau.png"));
              cimetierre1.setIcon(new ImageIcon("pokémon/plateau1.png"));
              cimetierre2.setIcon(new ImageIcon("pokémon/plateau2.png"));
              cimetierre3.setIcon(new ImageIcon("pokémon/plateau3.png"));

              imageJ1.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
              imageJ2.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
              pseudoJ1.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
              pseudoJ2.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));


              pan2.add(cimetierre);
              pan3.add(cimetierre1);
              pan4.add(cimetierre2);
              pan5.add(cimetierre3);
              pan6.add(pseudoJ1);
              pan7.add(imageJ1);
              pan8.add(pseudoJ2);
              pan9.add(imageJ2);

              pan.add(pan6);
              pan.add(pan3);
              pan.add(pan7);
              pan.add(pan4);
              pan.add(pan1);
              pan.add(pan5);
              pan.add(pan8);
              pan.add(pan2);
              pan.add(pan9);
              setContentPane(pan);
              setVisible(true);
       }


}