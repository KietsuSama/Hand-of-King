package src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Lucas on 30/10/2017.
 */
public class Controller {
    private View vue ;
    private HandOfKing jeu = new HandOfKing();
     ArrayList<Joueur> joueur = new ArrayList<>();
    ArrayList<Famille> liste_famille = new ArrayList<Famille>();
    int joueurActif = 0; // 0 ou 1
    Carte[] plateau = new Carte[36];
    private int style = 1;

    public Controller(){}



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

    public void init_Joueur(){
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();

        joueur.add(j1);
        joueur.add(j2);
    }

    public void set_Plateau(){

        plateau[20] = jeu.getCartes()[0];
        plateau[1] = jeu.getCartes()[1];
        plateau[21] = jeu.getCartes()[2];
        plateau[6] = jeu.getCartes()[3];
        plateau[28] = jeu.getCartes()[4];
        plateau[33] = jeu.getCartes()[5];
        plateau[12] = jeu.getCartes()[6];
        plateau[0] = jeu.getCartes()[7];
        plateau[22] = jeu.getCartes()[8];
        plateau[29] = jeu.getCartes()[9];
        plateau[7] = jeu.getCartes()[10];
        plateau[34] = jeu.getCartes()[11];
        plateau[13] = jeu.getCartes()[12];
        plateau[2] = jeu.getCartes()[13];
        plateau[30] = jeu.getCartes()[14];
        plateau[8] = jeu.getCartes()[15];
        plateau[14] = jeu.getCartes()[16];
        plateau[15] = jeu.getCartes()[17];
        plateau[23] = jeu.getCartes()[18];
        plateau[3] = jeu.getCartes()[19];
        plateau[35] = jeu.getCartes()[20];
        plateau[16] = jeu.getCartes()[21];
        plateau[31] = jeu.getCartes()[22];
        plateau[9] = jeu.getCartes()[23];
        plateau[32] = jeu.getCartes()[24];
        plateau[4] = jeu.getCartes()[25];
        plateau[24] = jeu.getCartes()[26];
        plateau[17] = jeu.getCartes()[27];
        plateau[25] = jeu.getCartes()[28];
        plateau[26] = jeu.getCartes()[29];
        plateau[10] = jeu.getCartes()[30];
        plateau[5] = jeu.getCartes()[31];
        plateau[18] = jeu.getCartes()[32];
        plateau[27] = jeu.getCartes()[33];
        plateau[19] = jeu.getCartes()[34];
        plateau[11] = jeu.getCartes()[35];

    vue=new View(plateau);

    }

    public void jouer(int id_joueur){
        //jouer
        joueurActif = id_joueur;
        boolean fin=false;
            for (int i = 0; i < 36; i++) {
                if (plateau[i].deplacement == true && !fin) { // on se positionne sur le pion que l'on peut deplacer
                    ArrayList<Carte> possibilité = new ArrayList<Carte>(); //liste des possibilités
                    for (int haut = i - 6; haut >= 0; haut = haut - 6) {//prend les possibilités du dessus
                        if (plateau[haut].getNom() != "__vide__") {
                            possibilité.add(plateau[haut]);
                        }
                    }

                    for (int bas = i + 6; bas <= 35; bas = bas + 6) {//prend les possibilités du dessous
                        if (plateau[bas].getNom() != "__vide__") {
                            possibilité.add(plateau[bas]);
                        }
                    }

                    for (int droite = i + 1; droite<= i - i % 6 + 6; droite++) {//prend les possibilités a droite
                        if (plateau[droite].getNom() != "__vide__") {
                            possibilité.add(plateau[droite]);
                        }
                    }

                    for (int gauche = i - 1; gauche >= i - i % 6; gauche--) {//prend les possibilités a gauche
                        if (plateau[gauche].getNom() != "__vide__") {
                            possibilité.add(plateau[gauche]);
                        }
                    }
                    System.out.print("les possibilités sont :  "); //affiche les possibilité
                    for (int ii =0; ii < possibilité.size() ; ii++) {
                        System.out.print("  N°"+ii+" " + possibilité.get(ii).getNom()+";");
                    }
                    System.out.println("");

                    Scanner reader = new Scanner(System.in);  // on demande l'indice de la possibilité
                    System.out.print("choisissez le numero de la possibilité (N°0; N°1; N°2;...) :    ");
                    int n = reader.nextInt();
                    while (n > possibilité.size()-1 || n < 0){ //verification de l'indice
                        System.out.print("choisissez le numero de la possibilité de la liste du dessus          ");
                        n = reader.nextInt();
                    }
                    for (int w = 0; w < plateau.length; w++) { //parcours du plateau pour enlever la carte correspondant a celle de la liste de possibilité
                        if (plateau[w] == possibilité.get(n)) {
                            joueur.get(id_joueur).point_par_famille[plateau[w].getFamille().getNombre_membre()-1] = joueur.get(id_joueur).getPoint_emplacement_famille(plateau[w].getFamille().getNombre_membre()-1)+1;
                            //ajout de point par famille
                            joueur.get(id_joueur).add_Cimetierre(plateau[w]);
                            //ajout dans le cimetierre du joueur
                            plateau[w] = plateau[i];
                            //suppression du plateau
                            plateau[i] = new Carte("__vide__", null, "lol");
                            fin = true;
                        }
                    }
                }
            }
        System.out.println("");
    }

    public boolean getPossibilité(){
        boolean retour = false;
        for (int i = 0; i < 36; i++) {
            if (plateau[i].deplacement == true) {
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
