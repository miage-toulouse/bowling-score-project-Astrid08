package miage.agas.bowling;

public class Partie {
    public enum Type {
            Strike,
            Spare,
            Normal
            };
    public int[] scorePartie;
    public Type type;

    public Partie(int[] scorePartie) {
        this.scorePartie = scorePartie;
    }

    public void typePartie(int[] mapartie) {
        if (mapartie[0] == 10 || mapartie[1] == 10) {
            this.type = Type.Strike ;
        } else if (mapartie.length == 2) {
            if (mapartie[0] + mapartie[1] < 10) {
                this.type = Type.Normal ;
            }
            else if (mapartie[0] + mapartie[1] == 10) {
                this.type = Type.Spare ;
            }
        }

        // cas du dernier jeu avec un strike ou spare à faire
    }


}
