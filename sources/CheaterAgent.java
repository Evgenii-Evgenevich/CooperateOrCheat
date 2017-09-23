/**
 * Created by EE on 23.09.2017.
 */


public class CheaterAgent implements Agent {

    private int iNumCoins = 0;

    public CheaterAgent(int iNumCoins) {
        this.iNumCoins = iNumCoins;
    }

    public boolean step(Agent opponent) {
        // always cheat
        return false;
    }

    public void endStep(Agent opponent, boolean isCooperate) {

    }

    public void addCoins(int iNumCoins) {
        this.iNumCoins += iNumCoins;
    }

    public int getCoins() {
        return iNumCoins;
    }
}



