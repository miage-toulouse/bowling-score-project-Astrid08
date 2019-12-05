package miage.agas.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartieTest {
    Partie partie;

    @Before
    public void setUp() throws Exception {
        // given : création d'un tableau d'entiers et d'un type Partie
        int [] lancers = {0,3} ;
        partie = new Partie(lancers);

    }

    @Test
    public void typePartie() {
        // when : quand le nombre de quilles tombées pour chaque lancer est 0 et 3
        partie.typePartie(partie.scorePartie);

        // then : le type attendu est Normal
        assertTrue(partie.type == Partie.Type.Normal);

    }
}