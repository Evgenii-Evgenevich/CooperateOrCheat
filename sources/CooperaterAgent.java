/**
 * Created by EE on 23.09.2017.
 */


public class CooperaterAgent implements Agent {

    private int iNumCoins = 0;

    public CooperaterAgent() {
        iNumCoins = 0;
    }

    public boolean step(Agent opponent) {
        // always cooperate
        return true;
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

