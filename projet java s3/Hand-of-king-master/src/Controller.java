import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Lucas on 30/10/2017.
 */
public class Controller {
    private View vue ;
    private ControlButton cb;
    private HandOfKing jeu = new HandOfKing();
    ArrayList<Joueur> joueur = new ArrayList<>();
    ArrayList<Famille> liste_famille = new ArrayList<Famille>();
    ArrayList<CarteCompagnon> compagnons_set =new ArrayList<CarteCompagnon>();
    int joueurActif = 0; // 0 ou 1
    Carte[] plateau = new Carte[36];
    private int style;
    boolean debut = true;


    public Controller(){}

    public void initStyle(int i){
        style = i;
    }

    public Carte[] getPlateau() {
        return plateau;
    }

    public Carte getCarte (int i){
        return plateau[i];
    }

    public ArrayList<Famille> init_Famille(){
        //creation des familles
        if (style == 1){

            Famille f1 = new Famille("Glace", 2);
            this.liste_famille.add(f1);
            Famille f2 = new Famille("Tenebre", 3);
            this.liste_famille.add(f2);
            Famille f3 = new Famille("Feu", 4);
            this.liste_famille.add(f3);
            Famille f4 = new Famille("electrik", 5);
            this.liste_famille.add(f4);
            Famille f5 = new Famille("Psy", 6);
            this.liste_famille.add(f5);
            Famille f6 = new Famille("Plante", 7);
            this.liste_famille.add(f6);
            Famille f7 = new Famille("Eau", 8);
            this.liste_famille.add(f7);
        } else if (style == 2){
            Famille f1 = new Famille("blanc", 2);
            this.liste_famille.add(f1);
            Famille f2 = new Famille("vert", 3);
            this.liste_famille.add(f2);
            Famille f3 = new Famille("sans", 4);
            this.liste_famille.add(f3);
            Famille f4 = new Famille("rouge", 5);
            this.liste_famille.add(f4);
            Famille f5 = new Famille("black", 6);
            this.liste_famille.add(f5);
            Famille f6 = new Famille("blond", 7);
            this.liste_famille.add(f6);
            Famille f7 = new Famille("brun", 8);
            this.liste_famille.add(f7);
        }
        return liste_famille;
    }

    public void init_Carte(){
        init_Famille();
        if (style == 1){
            System.out.println("Pokemon");

            //pion deplacable
            Carte p0 = new Carte("Red", null , "pokémon/Pion/red.png");
            p0.setBoolean_deplacement(true);
            this.jeu.add_Carte(p0, 0);

            //membre de la premiere famille
            Carte p1 = new Carte("Givrali", this.liste_famille.get(0), "pokémon/Glace/givraly.png");
            Carte p2 = new Carte("Lohklass", this.liste_famille.get(0), "pokémon/Glace/lohklass.png");
            this.jeu.add_Carte(p1, 1);
            this.jeu.add_Carte(p2, 2);

            //membre de la deuxieme famille
            Carte p3 = new Carte("Grahyena", this.liste_famille.get(1), "pokémon/Tenèbre/grahyena.jpg");
            Carte p4 = new Carte("Noctali", this.liste_famille.get(1), "pokémon/Tenèbre/noctaly.png");
            Carte p5 = new Carte("Tyranocif", this.liste_famille.get(1), "pokémon/Tenèbre/tyranocif.jpg");
            this.jeu.add_Carte(p3,3);
            this.jeu.add_Carte(p4,4);
            this.jeu.add_Carte(p5,5);

            //membre de la troisieme famille
            Carte p6 = new Carte("Arcanin", this.liste_famille.get(2), "pokémon/Feu/arcanin.png");
            Carte p7 = new Carte("Dracaufeu", this.liste_famille.get(2), "pokémon/Feu/dracaufeu.png");
            Carte p8 = new Carte("Poussifeu", this.liste_famille.get(2), "pokémon/Feu/poussifeu.jpg");
            Carte p9 = new Carte("Pyroli", this.liste_famille.get(2), "pokémon/Feu/pyroli.jpg");
            this.jeu.add_Carte(p6,6);
            this.jeu.add_Carte(p7,7);
            this.jeu.add_Carte(p8,8);
            this.jeu.add_Carte(p9,9);

            //membre de la quatrieme famille
            Carte p10 = new Carte("Elecable", this.liste_famille.get(3), "pokémon/Electrik/elecable.jpg");
            Carte p11 = new Carte("Luxray", this.liste_famille.get(3), "pokémon/Electrik/luxray.jpg");
            Carte p12 = new Carte("Pikachu", this.liste_famille.get(3), "pokémon/Electrik/pikachu.jpg");
            Carte p13 = new Carte("Voltali", this.liste_famille.get(3), "pokémon/Electrik/voltali.jpg");
            Carte p14 = new Carte("Wattouat", this.liste_famille.get(3), "pokémon/Electrik/wattouat.jpg");
            this.jeu.add_Carte(p10,10);
            this.jeu.add_Carte(p11,11);
            this.jeu.add_Carte(p12,12);
            this.jeu.add_Carte(p13,13);
            this.jeu.add_Carte(p14,14);

            //membre de la cinquieme famille
            Carte p15 = new Carte("Alakazam", this.liste_famille.get(4), "pokémon/Psy/alakazam.jpg");
            Carte p16 = new Carte("Gardevoir", this.liste_famille.get(4), "pokémon/Psy/gardevoir.png");
            Carte p17 = new Carte("Mr mime", this.liste_famille.get(4), "pokémon/Psy/M_mime.jpg");
            Carte p18 = new Carte("Magireve", this.liste_famille.get(4), "pokémon/Psy/magireve.png");
            Carte p19 = new Carte("Mentali", this.liste_famille.get(4), "pokémon/Psy/mentali.png");
            Carte p20 = new Carte("Qulbutoke", this.liste_famille.get(4), "pokémon/Psy/qulbutoke.jpg");
            this.jeu.add_Carte(p15,15);
            this.jeu.add_Carte(p16,16);
            this.jeu.add_Carte(p17,17);
            this.jeu.add_Carte(p18,18);
            this.jeu.add_Carte(p19,19);
            this.jeu.add_Carte(p20,20);

            //membre de la sixieme famille
            Carte p21 = new Carte("Chetiflor", this.liste_famille.get(5), "pokémon/Plante/chetiflor.png");
            Carte p22 = new Carte("Heliatronc", this.liste_famille.get(5), "pokémon/Plante/heliatronc.jpg");
            Carte p23 = new Carte("Joliflor", this.liste_famille.get(5), "pokémon/Plante/joliflor.png");
            Carte p24 = new Carte("Jungcko", this.liste_famille.get(5), "pokémon/Plante/jungcko.png");
            Carte p25 = new Carte("Noadkoko", this.liste_famille.get(5), "pokémon/Plante/noadkoko.png");
            Carte p26 = new Carte("Phylali", this.liste_famille.get(5), "pokémon/Plante/phyllali.png");
            Carte p27 = new Carte("Roserade", this.liste_famille.get(5), "pokémon/Plante/roserade.png");
            this.jeu.add_Carte(p21,21);
            this.jeu.add_Carte(p22,22);
            this.jeu.add_Carte(p23,23);
            this.jeu.add_Carte(p24,24);
            this.jeu.add_Carte(p25,25);
            this.jeu.add_Carte(p26,26);
            this.jeu.add_Carte(p27,27);

            //membre de la septiemme famille
            Carte p28 = new Carte("Aquali", this.liste_famille.get(6), "pokémon/Eau/aquali.jpg");
            Carte p29 = new Carte("Kokiyas", this.liste_famille.get(6), "pokémon/Eau/kokiyas.png");
            Carte p30 = new Carte("Laggron", this.liste_famille.get(6), "pokémon/Eau/laggron.jpg");
            Carte p31 = new Carte("Magicarpe", this.liste_famille.get(6), "pokémon/Eau/magicarpe.png");
            Carte p32 = new Carte("Milobellus", this.liste_famille.get(6), "pokémon/Eau/milobellus.png");
            Carte p33 = new Carte("Sharpedo", this.liste_famille.get(6), "pokémon/Eau/sharpedo.jpg");
            Carte p34 = new Carte("Stari", this.liste_famille.get(6), "pokémon/Eau/stari.jpg");
            Carte p35 = new Carte("Tortank", this.liste_famille.get(6), "pokémon/Eau/tortank.png");
            this.jeu.add_Carte(p28,28);
            this.jeu.add_Carte(p29,29);
            this.jeu.add_Carte(p30,30);
            this.jeu.add_Carte(p31,31);
            this.jeu.add_Carte(p32,32);
            this.jeu.add_Carte(p33,33);
            this.jeu.add_Carte(p34,34);
            this.jeu.add_Carte(p35,35);


        } else if (style == 2){
            System.out.println("famille");

            //pion deplacable
            Carte p0 = new Carte("Mort", null , "theme_mort/36_burned.png");
            p0.setBoolean_deplacement(true);
            this.jeu.add_Carte(p0, 0);

            //membre de la premiere famille
            Carte p1 = new Carte("blanc1", this.liste_famille.get(0), "theme_mort/1_burned.png");
            Carte p2 = new Carte("blanc2", this.liste_famille.get(0), "theme_mort/2_burned.png");
            this.jeu.add_Carte(p1, 1);
            this.jeu.add_Carte(p2, 2);

            //membre de la deuxieme famille
            Carte p3 = new Carte("vert1", this.liste_famille.get(1), "theme_mort/25_burned.png");
            Carte p4 = new Carte("vert2", this.liste_famille.get(1), "theme_mort/26_burned.png");
            Carte p5 = new Carte("vert3", this.liste_famille.get(1), "theme_mort/27_burned.png");
            this.jeu.add_Carte(p3,3);
            this.jeu.add_Carte(p4,4);
            this.jeu.add_Carte(p5,5);

            //membre de la troisieme famille
            Carte p6 = new Carte("chauve1", this.liste_famille.get(2), "theme_mort/3_burned.png");
            Carte p7 = new Carte("chauve2", this.liste_famille.get(2), "theme_mort/4_burned.png");
            Carte p8 = new Carte("chauve3", this.liste_famille.get(2), "theme_mort/5_burned.png");
            Carte p9 = new Carte("chauve4", this.liste_famille.get(2), "theme_mort/24_burned.png");
            this.jeu.add_Carte(p6,6);
            this.jeu.add_Carte(p7,7);
            this.jeu.add_Carte(p8,8);
            this.jeu.add_Carte(p9,9);

            //membre de la quatrieme famille
            Carte p10 = new Carte("roux1", this.liste_famille.get(3), "theme_mort/6_burned.png");
            Carte p11 = new Carte("roux2", this.liste_famille.get(3), "theme_mort/7_burned.png");
            Carte p12 = new Carte("roux3", this.liste_famille.get(3), "theme_mort/8_burned.png");
            Carte p13 = new Carte("roux4", this.liste_famille.get(3), "theme_mort/9_burned.png");
            Carte p14 = new Carte("roux5", this.liste_famille.get(3), "theme_mort/23_burned.png");
            this.jeu.add_Carte(p10,10);
            this.jeu.add_Carte(p11,11);
            this.jeu.add_Carte(p12,12);
            this.jeu.add_Carte(p13,13);
            this.jeu.add_Carte(p14,14);

            //membre de la cinquieme famille
            Carte p15 = new Carte("black1", this.liste_famille.get(4), "theme_mort/10_burned.png");
            Carte p16 = new Carte("black2", this.liste_famille.get(4), "theme_mort/11_burned.png");
            Carte p17 = new Carte("black3", this.liste_famille.get(4), "theme_mort/12_burned.png");
            Carte p18 = new Carte("black4", this.liste_famille.get(4), "theme_mort/13_burned.png");
            Carte p19 = new Carte("black5", this.liste_famille.get(4), "theme_mort/14_burned.png");
            Carte p20 = new Carte("black6", this.liste_famille.get(4), "theme_mort/22_burned.png");
            this.jeu.add_Carte(p15,15);
            this.jeu.add_Carte(p16,16);
            this.jeu.add_Carte(p17,17);
            this.jeu.add_Carte(p18,18);
            this.jeu.add_Carte(p19,19);
            this.jeu.add_Carte(p20,20);

            //membre de la sixieme famille
            Carte p21 = new Carte("blond1", this.liste_famille.get(5), "theme_mort/15_burned.png");
            Carte p22 = new Carte("blond2", this.liste_famille.get(5), "theme_mort/16_burned.png");
            Carte p23 = new Carte("blond3", this.liste_famille.get(5), "theme_mort/17_burned.png");
            Carte p24 = new Carte("blond4", this.liste_famille.get(5), "theme_mort/18_burned.png");
            Carte p25 = new Carte("blond5", this.liste_famille.get(5), "theme_mort/19_burned.png");
            Carte p26 = new Carte("blond6", this.liste_famille.get(5), "theme_mort/20_burned.png");
            Carte p27 = new Carte("blond7", this.liste_famille.get(5), "theme_mort/21_burned.png");
            this.jeu.add_Carte(p21,21);
            this.jeu.add_Carte(p22,22);
            this.jeu.add_Carte(p23,23);
            this.jeu.add_Carte(p24,24);
            this.jeu.add_Carte(p25,25);
            this.jeu.add_Carte(p26,26);
            this.jeu.add_Carte(p27,27);

            //membre de la septiemme famille
            Carte p28 = new Carte("brun1", this.liste_famille.get(6), "theme_mort/28_burned.png");
            Carte p29 = new Carte("brun2", this.liste_famille.get(6), "theme_mort/29_burned.png");
            Carte p30 = new Carte("brun3", this.liste_famille.get(6), "theme_mort/30_burned.png");
            Carte p31 = new Carte("brun4", this.liste_famille.get(6), "theme_mort/31_burned.png");
            Carte p32 = new Carte("brun5", this.liste_famille.get(6), "theme_mort/32_burned.png");
            Carte p33 = new Carte("brun6", this.liste_famille.get(6), "theme_mort/33_burned.png");
            Carte p34 = new Carte("brun7", this.liste_famille.get(6), "theme_mort/34_burned.png");
            Carte p35 = new Carte("brun8", this.liste_famille.get(6), "theme_mort/35_burned.png");
            this.jeu.add_Carte(p28,28);
            this.jeu.add_Carte(p29,29);
            this.jeu.add_Carte(p30,30);
            this.jeu.add_Carte(p31,31);
            this.jeu.add_Carte(p32,32);
            this.jeu.add_Carte(p33,33);
            this.jeu.add_Carte(p34,34);
            this.jeu.add_Carte(p35,35);

        }
    }

    public void init_banniere(){
        Banniere b1 = liste_famille.get(0).getBanniere();
        Banniere b2 = liste_famille.get(1).getBanniere();
        Banniere b3 = liste_famille.get(2).getBanniere();
        Banniere b4 = liste_famille.get(3).getBanniere();
        Banniere b5 = liste_famille.get(4).getBanniere();
        Banniere b6 = liste_famille.get(5).getBanniere();
        Banniere b7 = liste_famille.get(6).getBanniere();

        jeu.Bannieres.add(b1);
        jeu.Bannieres.add(b2);
        jeu.Bannieres.add(b3);
        jeu.Bannieres.add(b4);
        jeu.Bannieres.add(b5);
        jeu.Bannieres.add(b6);
        jeu.Bannieres.add(b7);
    }

    public void init_Carte_Compagnon(){
        CarteCompagnon c1 = new CarteCompagnon("Compagnon1",0,"lol");
        CarteCompagnon c2 = new CarteCompagnon("Compagnon2",1,"lol");
        CarteCompagnon c3 = new CarteCompagnon("Compagnon3",2,"lol");
        CarteCompagnon c4 = new CarteCompagnon("Compagnon4",3,"lol");
        CarteCompagnon c5 = new CarteCompagnon("Compagnon5",4,"lol");
        CarteCompagnon c6 = new CarteCompagnon("Compagnon6",5,"lol");
        CarteCompagnon c7 = new CarteCompagnon("Compagnon7",6,"lol");
        CarteCompagnon c8 = new CarteCompagnon("Compagnon8",7,"lol");
        CarteCompagnon c9 = new CarteCompagnon("Compagnon9",8,"lol");

        jeu.Carte_de_compagnons.add(c1);
        jeu.Carte_de_compagnons.add(c2);
        jeu.Carte_de_compagnons.add(c3);
        jeu.Carte_de_compagnons.add(c4);
        jeu.Carte_de_compagnons.add(c5);
        jeu.Carte_de_compagnons.add(c6);
        jeu.Carte_de_compagnons.add(c7);
        jeu.Carte_de_compagnons.add(c8);
        jeu.Carte_de_compagnons.add(c9);
    }
/*
    public void setcompagon(){
        Random rand = new Random();

        int id_compagnon;
        boolean est_vrai = true;
        while(jeu.Carte_de_compagnons.isEmpty() != true){
            id_compagnon = rand.nextInt(jeu.Carte_de_compagnons.size());
            while (jeu.Carte_de_compagnons.get(id_compagnon) == null){
                id_compagnon++;
                if (id_compagnon == 9){
                    id_compagnon =0;
                }
            }
            compagnons_set.add(jeu.Carte_de_compagnons.get(id_compagnon));
            jeu.Carte_de_compagnons.remove(jeu.Carte_de_compagnons.get(id_compagnon));
            System.out.print(id_compagnon);
            //FAIRE UN TABLEAU DES ID COMPGNON DEJA USE POUR NE PAS AVOIR PLS * LES MM
        }
        init_Carte_Compagnon();
    }
*/
    public void init_Joueur(){
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();

        joueur.add(j1);
        joueur.add(j2);
    }

    public void set_Plateau() {
       Carte[] liste_des_cartes = jeu.getCartes();
       boolean while_continu = true;
       Random rand = new Random();

       while (while_continu == true) {
           int idPlateau = rand.nextInt(35);
           int idCarte = rand.nextInt(35);
           while (plateau[idPlateau] != null) {
               idPlateau++;
               if (idPlateau > 35) {
                   idPlateau = 0;
               }
           }
           while (liste_des_cartes[idCarte] == null) {
               idCarte++;
               if (idCarte > 35) {
                   idCarte = 0;
               }
           }
           plateau[idPlateau] = liste_des_cartes[idCarte];
           liste_des_cartes[idCarte] = null;
           boolean var = true;
           for (int i =0; i < 35 ; i++){
               if (liste_des_cartes[i] != null){
                   var = false;
               } else if(plateau[i] == null){
                   var = false;
               }
           }
           if (var){
               while_continu = false;
           }
       }

        vue = new View(this, style);
        cb = new ControlButton(vue, this);
    }

    public boolean jouer(  int id_joueur ,int cible ){
        //jouer
        joueurActif = id_joueur;
        boolean fin=false;
        for (int i = 0; i < 36; i++) {
            if (plateau[i].deplacement ) { // on se positionne sur le pion que l'on peut deplacer
                int position_init = i;
                ArrayList<Carte> possibilite = new ArrayList<Carte>(); //liste des possibilités

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////   recherche des possibilités   ///////////////////////////////////////////////
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////

                for (int haut = i - 6; haut >= 0; haut = haut - 6) {//prend les possibilités du dessus
                    if ( haut >= 0){
                        if (plateau[haut].getNom() != "__vide__") {
                            possibilite.add(plateau[haut]);
                        }
                    }

                }

                for (int bas = i + 6; bas <= 35; bas = bas + 6) {//prend les possibilités du dessous
                    if (bas <= 35){
                        if (plateau[bas].getNom() != "__vide__") {
                            possibilite.add(plateau[bas]);
                        }
                    }
                }

                for (int droite = i + 1; droite<= i - i % 6 + 5; droite++) {//prend les possibilités a droite
                    if (droite <= i-i%6+5 ){
                        if (plateau[droite].getNom() != "__vide__") {
                            possibilite.add(plateau[droite]);
                        }
                    }
                }

                for (int gauche = i - 1; gauche >= i - i % 6; gauche--) {//prend les possibilités a gauche
                    if (gauche>= i - i % 6){
                        if (plateau[gauche].getNom() != "__vide__") {
                            possibilite.add(plateau[gauche]);
                        }
                    }
                }

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                ///////////////////////////////   verification pour meme famille   ///////////////////////////////////////////
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                Famille famille_prise = new Famille();
                if (possibilite.contains(getCarte(cible))){
                    famille_prise = plateau[cible].getFamille(); //besoin pour la suite
                    System.out.println(famille_prise.getNom());
                    if (position_init - cible > 0 && (position_init - cible) % 6 == 0) {//on vérifie si le survole mm famille en haut
                        for (int haut = i - 6; haut >= cible+6; haut = haut - 6) {
                            if (haut >= 0) {
                                if (plateau[haut].getFamille() == plateau[cible].getFamille()) {
                                    joueur.get(id_joueur).point_par_famille[plateau[haut].getFamille().getNombre_membre() - 1] = joueur.get(id_joueur).getPoint_emplacement_famille(plateau[haut].getFamille().getNombre_membre() - 1) + 1;
                                    plateau[haut].getFamille().mort();
                                    joueur.get(id_joueur).add_Cimetierre(plateau[haut]);
                                    vue.capture_multiple(haut);
                                    plateau[haut] = new Carte("__vide__", null, "lol");
                                }
                            }

                        }
                    }
                    if (position_init - cible < 0 && Math.abs((position_init - cible)) % 6 == 0) {//on vérifie si le survole mm famille en bas
                        for (int bas = i + 6; bas <= cible-6; bas = bas + 6) {
                            if (bas <= 35){
                                if (plateau[bas].getFamille() == plateau[cible].getFamille()) {
                                    joueur.get(id_joueur).point_par_famille[plateau[bas].getFamille().getNombre_membre() - 1] = joueur.get(id_joueur).getPoint_emplacement_famille(plateau[bas].getFamille().getNombre_membre() - 1) + 1;
                                    plateau[bas].getFamille().mort();
                                    joueur.get(id_joueur).add_Cimetierre(plateau[bas]);
                                    vue.capture_multiple(bas);
                                    plateau[bas] = new Carte("__vide__", null, "lol");
                                }
                            }

                        }
                    }
                    if (cible >= i - i % 6 && cible < position_init) {//on vérifie si le survole mm famille en bas
                        for (int gauche = i - 1; gauche >= cible+1; gauche--) {
                            if (gauche>= i - i % 6){
                                if (plateau[gauche].getFamille() == plateau[cible].getFamille()) {
                                    joueur.get(id_joueur).point_par_famille[plateau[gauche].getFamille().getNombre_membre() - 1] = joueur.get(id_joueur).getPoint_emplacement_famille(plateau[gauche].getFamille().getNombre_membre() - 1) + 1;
                                    plateau[gauche].getFamille().mort();
                                    joueur.get(id_joueur).add_Cimetierre(plateau[gauche]);
                                    vue.capture_multiple(gauche);
                                    plateau[gauche] = new Carte("__vide__", null, "lol");
                                }
                            }

                        }
                    }
                    if (cible > position_init && cible <= i - i % 6 + 5) {//on vérifie si le survole mm famille en bas
                        for (int droite = i + 1; droite<= cible-1; droite++) {
                            if (droite <= i-i%6+5 ){
                                if (plateau[droite].getFamille() == plateau[cible].getFamille()) {
                                    joueur.get(id_joueur).point_par_famille[plateau[droite].getFamille().getNombre_membre() - 1] = joueur.get(id_joueur).getPoint_emplacement_famille(plateau[droite].getFamille().getNombre_membre() - 1) + 1;
                                    plateau[droite].getFamille().mort();
                                    joueur.get(id_joueur).add_Cimetierre(plateau[droite]);
                                    vue.capture_multiple(droite);
                                    plateau[droite] = new Carte("__vide__", null, "lol");
                                }
                            }

                        }
                    }

                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    ////////////////////////////  on mange le pion cible et on fiis le tour   ////////////////////////////////////
                    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    System.out.println(famille_prise.getNom());
                    joueur.get(id_joueur).point_par_famille[plateau[cible].getFamille().getNombre_membre()-1] = joueur.get(id_joueur).getPoint_emplacement_famille(plateau[cible].getFamille().getNombre_membre()-1)+1;
                    //ajout de point par famille
                    joueur.get(id_joueur).add_Cimetierre(plateau[cible]);
                    //ajout dans le cimetierre du joueur
                    plateau[cible] = plateau[i];
                    //suppression du plateau
                    plateau[i] = new Carte("__vide__", null, "lol");
//                    plateau[i].getFamille().mort();
                    if (debut){ // on regarde si cest le premier tour pour eviter de mettre l image d'une carte capturée sur la case de départ du pion à bouger
                        vue.pDeplacement(i,cible);
                        debut=false;
                    }else vue.vueCapture(i,cible);
                        return true;

                }

                //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                /////////////////////////  Vérification de si famille vide et donc compagon   ////////////////////////////////
                //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                if (famille_prise.getMembre_vivant() == 0){

                }
            }
        }

        return false;
    }

    /*
     public void effetCompagnon(int num) {
         switch (this.jeu.getCarte_de_compagnons().get(num).effet) {
             default:
                 break;
         }
         //effet n°1 : detruit une carte du jeu
         //effet n°2 : tue un personnage du jeu en particulier
         //effet n°3 : switch les places de deux cartes
         // effet n°4 : ajoute une carte de la famille au choix dans la liste de manger
         //effet n°5 : si tu a un personnage precis du jeu dans ton manger, il compte deux points
         //effet n°6 : pioche deux copmpagnon, joue en un et deffause l'autre
         //effet n°7 : joue un nouveau tour
         //effet n°8 : choisi entre deux personnage precis et les enleve du jeu
         //effet n°9 : declarer une famille et deviens une carte qui compte 2 pour cette familler
     }
     */


    public boolean getPossibilité(){
        boolean retour = false;
        for (int i = 0; i < 36; i++) {
            if (plateau[i].deplacement) {
                ArrayList<String> possibilité = new ArrayList<String>();
                for (int haut = i - 6; haut >= 0; haut = haut - 6) {//prend les possibilités du dessus
                    if (plateau[haut].getNom() != "__vide__") {
                        possibilité.add(plateau[haut].getNom());

                    }
                }

                for (int bas = i + 6; bas <= 35; bas = bas + 6) {//prend les possibilités du dessous
                    if (plateau[bas].getNom() != "__vide__") {
                        possibilité.add(plateau[bas].getNom());

                    }
                }

                for (int droite = i + 1; droite < i - i % 6 + 6; droite++) {//prend les possibilités a droite
                    if (plateau[droite].getNom() != "__vide__") {
                        possibilité.add(plateau[droite].getNom());

                    }
                }

                for (int gauche = i - 1; gauche >= i - i % 6; gauche--) {//prend les possibilités a gauche
                    if (plateau[gauche].getNom() != "__vide__") {
                        possibilité.add(plateau[gauche].getNom());

                    }
                }
                if (possibilité.size() != 0){
                    retour = true;
                }
            }
        }
        return retour;
    }

}
