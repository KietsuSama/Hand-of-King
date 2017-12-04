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
       int style;
       ControlButton cb;
       Controller mod;

       public View(Controller mod, int i){
              style = i;
              this.mod=mod;
              cb  = new ControlButton(this,mod);
              initAttribut();
              initPlateau(mod.getPlateau());
              creerPaneau();
              setSize(1000,1000);
              setVisible(true);
              setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }

       public void vueCapture(int depart,int cible ){
              plateau[cible].setIcon(plateau[depart].getIcon());
              if (style == 1) {
                     plateau[depart].setIcon(new ImageIcon("pokémon/pokeball.gif"));//la methode sera a modifier pour implementer la prise multiple
              } else if (style == 2){
                     plateau[depart].setIcon(new ImageIcon("theme_mort/kill.png"));//la methode sera a modifier pour implementer la prise multiple
              }
              setVisible(true);
       }

       public void pDeplacement(int depart,int cible){
              plateau[cible].setIcon(plateau[depart].getIcon());//on deplace le pion visuelleemnt
              plateau[depart].setIcon(null);//on fait en sorte que le depart ne soit pas "capturé"
              setVisible(true);
       }

       public void initAttribut(){

              setTitle("Hand of King");

              plateau = new JButton[36];

              for (int i =0 ; i<36; i++){
                     plateau[i]= new JButton();
                     plateau[i].setPreferredSize(new Dimension(100,100));
                     plateau[i].setBackground(Color.white);
                     if (style == 2){
                            plateau[i].setBackground(Color.decode("#9805d4"));
                     }
              }

              setVisible(true);

       }

       public void initPlateau(Carte[] cartes){
              for (int i = 0;i<36;i++ ){
                     plateau[i].setIcon(cartes[i].getIcone());
                     plateau[i].addActionListener(cb);
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
              JPanel pan10= new JPanel();
              JPanel panel11 = new JPanel();

              //pan.setLayout(new GridLayout(3,3));
              pan1.setLayout(new GridLayout(6,6));


              for(int i=0;i<36;i++){
                     pan1.add(plateau[i]);
                     plateau[i].addActionListener(cb);
              }
              if (style == 1) {
                     cimetierre.setIcon(new ImageIcon("pokémon/plateau.png"));
                     cimetierre1.setIcon(new ImageIcon("pokémon/plateau1.png"));
                     cimetierre2.setIcon(new ImageIcon("pokémon/plateau2.png"));
                     cimetierre3.setIcon(new ImageIcon("pokémon/plateau3.png"));

                     imageJ1.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
                     imageJ2.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
                     pseudoJ1.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
                     pseudoJ2.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
              } else if (style == 2){
                     cimetierre.setIcon(new ImageIcon("theme_mort/plateau.png"));
                     cimetierre1.setIcon(new ImageIcon("theme_mort/plateau1.png"));
                     cimetierre2.setIcon(new ImageIcon("theme_mort/plateau2.png"));
                     cimetierre3.setIcon(new ImageIcon("theme_mort/plateau3.png"));

                     imageJ1.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
                     imageJ2.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
                     pseudoJ1.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
                     pseudoJ2.setIcon(new ImageIcon("pokémon/pseudo.jpeg"));
              }

              pseudoJ2.setEnabled(false);
              imageJ2.setEnabled(false);
              cimetierre.setEnabled(false);
              cimetierre2.addActionListener(cb);
              cimetierre3.addActionListener(cb);

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

       public void capture_multiple(int id) {
              if (style == 1) {
                     plateau[id].setIcon(new ImageIcon("pokémon/pokeball.gif"));//la methode sera a modifier pour implementer la prise multiple
              } else if (style == 2){
                     plateau[id].setIcon(new ImageIcon("theme_mort/kill.png"));//la methode sera a modifier pour implementer la prise multiple
              }
       }

       public void creerCimetiereJ1() {
              JFrame f = new JFrame();
              f.setTitle("cimetierre Joueur 1");
              f.setSize(500,500);
              JPanel panel_cimetierre = new JPanel();
              panel_cimetierre.setLayout(new GridLayout(3,7));
              JLabel [] cimetierre = new JLabel[mod.joueur.get(0).getCimetierre().size()];
              for (int k = 0; k < mod.joueur.get(0).getCimetierre().size(); k++) {
                     JLabel lol = new JLabel();
                     lol.setIcon(mod.joueur.get(0).getCimetierre().get(k).getIcone());
                     cimetierre[k] = lol;
                     panel_cimetierre.add(cimetierre[k]);
              }
              f.setBackground(Color.black);
              f.add(panel_cimetierre);
              f.setContentPane(panel_cimetierre);
              f.setVisible(true);
       }

       public void creerCimetiereJ2() {
              JFrame f = new JFrame();
              f.setTitle("cimetierre Joueur 2");
              f.setSize(500,500);
              JPanel panel_cimetierre = new JPanel();
              panel_cimetierre.setLayout(new GridLayout(3,7));
              JLabel [] cimetierre = new JLabel[mod.joueur.get(1).getCimetierre().size()];
              for (int k = 0; k < mod.joueur.get(1).getCimetierre().size(); k++) {
                     JLabel lol = new JLabel();
                     lol.setIcon(mod.joueur.get(1).getCimetierre().get(k).getIcone());
                     cimetierre[k] = lol;
                     panel_cimetierre.add(cimetierre[k]);
              }
              f.setBackground(Color.black);
              f.add(panel_cimetierre);
              f.setContentPane(panel_cimetierre);
              f.setVisible(true);
       }
}