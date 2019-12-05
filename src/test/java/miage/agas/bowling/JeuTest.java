package miage.agas.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeuTest {
    Jeu jeu;

    @Before
    public void setUp() throws Exception {
        // given : création d'un type Jeu

        jeu = new Jeu();

    }

    @Test
    public void testcalculerScorePartieNormale() {
        // when : quand on utilise le tableau parties créé ci-dessous : jeu normal
        int [][] parties = { {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3} } ;
        jeu.parties = parties;
        int score = jeu.calculerScorePartie(jeu.parties);

        // then : le score obtenu est 30
        assertEquals(30, score);
    }

    @Test
    public void testcalculerScorePartieSpare() {
        // when : quand on utilise le tableau parties créé ci-dessous : jeu avec Spare
        int[][] jeuavecSpare = { {2,8}, {1,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3} };
        jeu.parties = jeuavecSpare;
        int score = jeu.calculerScorePartie(jeu.parties);

        // then : le score obtenu est 39
        assertEquals(39, score);
    }

    @Test
    public void testcalculerScorePartieStrike() {
        // when : quand on utilise le tableau parties créé ci-dessous : jeu avec Spare
        int[][] jeuavecSpare = { {10}, {3,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3}, {0,3} };
        jeu.parties = jeuavecSpare;
        int score = jeu.calculerScorePartie(jeu.parties);

        // then : le score obtenu est 46
        assertEquals(46, score);
    }
}