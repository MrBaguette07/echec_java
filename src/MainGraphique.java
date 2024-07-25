import java.awt.Font;
import MG2D.*;
import MG2D.geometrie.*;

class MainGraphique {
    public static void main(String[] args) throws Exception {

        /*Récupération des saisies de la souris*/

        Plateau plateau = new Plateau();
        System.out.println(plateau);
        Fenetre fenetre = new Fenetre("Jeu d'échec", 800, 800);
        Souris souris = fenetre.getSouris();
        Texte letext = new Texte();
        Point temp_point = new Point();
        Couleur temp_couleur = new Couleur();
        String temp_piece = new String();
        Piece temp_piece2 = new Tour('N', new Position(0, 7));
        boolean valids = false;
        for (int i=7; i >= 0;i--){
            for (int j=7; j>=0;j--) {
                if ((i+j)%2 == 0){
                    Carre CNoir = new Carre (Couleur.GRIS_FONCE, new Point(i*100,j*100), 100, true);
                    fenetre.ajouter(CNoir);
                } else {
                    Carre CBlanc = new Carre (Couleur.BLANC, new Point(i*100,j*100), 100, true);
                    fenetre.ajouter(CBlanc);
                }
            }
        }

        // for (Piece valeur: plateau) {
        //     Texture LaTexture = new Texture ("img/" + valeur.getNomLong() + ".png", new Point(valeur.getPosition().getX()*100,valeur.getPosition().getY()*100), 100, 100);
        //     fenetre.ajouter(LaTexture);
        // }
        for (int i=7; i >= 0;i--){
            for (int j=7; j>=0;j--) {
                if (plateau.getCase(j, i) != null){
                    Texture LaTexture = new Texture ("img/" + plateau.getCase(j,i).getNomLong() + ".png", new Point(plateau.getCase(j,i).getPosition().getX()*100,plateau.getCase(j,i).getPosition().getY()*100), 100, 100);
                    fenetre.ajouter(LaTexture);
                }
            }
        }
        while(true){
            if(souris.getClicGauche()){
                if (plateau.getCase(souris.getPosition().getX()/100, souris.getPosition().getY()/100) != null){
                    fenetre.supprimer(letext);
                    int j = souris.getPosition().getX()/100;
                    int i = souris.getPosition().getY()/100;
                    temp_point = new Point(j*100,i*100);
                    if ((i+j)%2 == 0){
                        temp_couleur = Couleur.GRIS_FONCE;
                    } else {
                        temp_couleur = Couleur.BLANC;
                    }
                    temp_piece = plateau.getCase(j, i).getNomLong();
                    temp_piece2 = plateau.getCase(j, i);
                    valids = true;
                    letext = new Texte (Couleur.VERT,"v", new Font("Serif", Font.PLAIN, 24), new Point((plateau.getCase(j,i).getPosition().getX()*100)+90,(plateau.getCase(j,i).getPosition().getY()*100)+90), 12);
                    fenetre.ajouter(letext);
                    for (Position valeur: plateau.getCase(j, i).getDeplacementPossible(plateau)) {
                        Cercle LesCercles = new Cercle(Couleur.ROUGE, new Point((valeur.getX()*100)+50,(valeur.getY()*100)+50), 50);
                        fenetre.ajouter(LesCercles);
                    }

                    System.out.println(plateau.getCase(j, i).getDeplacementPossible(plateau));
                } else {
                    if (valids == true) {
                        int j = souris.getPosition().getX()/100;
                        int i = souris.getPosition().getY()/100;
                        plateau.removeCase(temp_piece2);
                        temp_piece2.getPosition().setX(j);
                        temp_piece2.getPosition().setY(i);
                        valids = false;
                        plateau.addCase(temp_piece2);
                        Carre CNoir = new Carre (temp_couleur, temp_point, 100, true);
                        fenetre.ajouter(CNoir);
                        Texture LaTexture = new Texture ("img/" + temp_piece + ".png", new Point(j*100,i*100), 100, 100);
                        fenetre.ajouter(LaTexture);
                    }
                }
            }
            fenetre.rafraichir();
        }

    }
        // Texture Roi = new Texture ("img/roi_B.png", new Point(400,0), 100, 100);
        // fenetre.ajouter(Roi);
        // Texture Roi2 = new Texture ("img/roi_N.png", new Point(400,700), 100, 100);
        // fenetre.ajouter(Roi2);
        
        // Texture Reine = new Texture ("img/reine_B.png", new Point(300,0), 100, 100);
        // fenetre.ajouter(Reine);
        // Texture Reine2 = new Texture ("img/reine_N.png", new Point(300,700), 100, 100);
        // fenetre.ajouter(Reine2);
        
        // Texture Tour = new Texture ("img/tour_B.png", new Point(0,0), 100, 100);
        // fenetre.ajouter(Tour);
        // Texture Tour2 = new Texture ("img/tour_N.png", new Point(0,700), 100, 100);
        // fenetre.ajouter(Tour2);
        // Texture Tour3 = new Texture ("img/tour_B.png", new Point(700,0), 100, 100);
        // fenetre.ajouter(Tour3);
        // Texture Tour4 = new Texture ("img/tour_N.png", new Point(700,700), 100, 100);
        // fenetre.ajouter(Tour4);

        // Texture Fou = new Texture ("img/fou_B.png", new Point(200,0), 100, 100);
        // fenetre.ajouter(Fou);
        // Texture Fou2 = new Texture ("img/fou_N.png", new Point(200,700), 100, 100);
        // fenetre.ajouter(Fou2);
        // Texture Fou3 = new Texture ("img/fou_B.png", new Point(500,0), 100, 100);
        // fenetre.ajouter(Fou3);
        // Texture Fou4 = new Texture ("img/fou_N.png", new Point(500,700), 100, 100);
        // fenetre.ajouter(Fou4);

        // Texture Cavalier = new Texture ("img/Cavalier_B.png", new Point(100,0), 100, 100);
        // fenetre.ajouter(Cavalier);
        // Cavalier = new Texture ("img/Cavalier_N.png", new Point(100,700), 100, 100);
        // fenetre.ajouter(Cavalier);
        // Cavalier = new Texture ("img/Cavalier_B.png", new Point(600,0), 100, 100);
        // fenetre.ajouter(Cavalier);
        // Cavalier = new Texture ("img/Cavalier_N.png", new Point(600,700), 100, 100);
        // fenetre.ajouter(Cavalier);

        // for (int i=7; i >= 0;i--){
        //     Texture Pion = new Texture ("img/pion_B.png", new Point(i*100,100), 100, 100);
        //     fenetre.ajouter(Pion);
        // }
        // for (int i=7; i >= 0;i--){
        //     Texture Pion = new Texture ("img/pion_N.png", new Point(i*100,600), 100, 100);
        //     fenetre.ajouter(Pion);
        // }


}