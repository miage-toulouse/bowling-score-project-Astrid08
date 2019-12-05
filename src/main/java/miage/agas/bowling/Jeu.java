package miage.agas.bowling;

import java.util.ArrayList;

public class Jeu {
    int[][] parties;
    int score ;

    public Jeu () { }

    public int calculerScorePartie(int [][] jeu) {
        int score = 0 ;
        int i = 0;
        Partie partie;
        while (i < jeu.length) {
            partie = new Partie(jeu[i]);
            partie.typePartie(jeu[i]);
            if (partie.type == Partie.Type.Normal){
                score = score + jeu[i][0] + jeu[i][1];
            } else if (partie.type == Partie.Type.Spare) {
                score = score + jeu[i][0] + jeu[i][1] + jeu[i+1][0];
            } else if (partie.type == Partie.Type.Strike) {
                score = score + jeu[i][0] + jeu[i+1][0] + jeu[i+1][1];
            }
            i++;
        }
        return score;
    }



}
