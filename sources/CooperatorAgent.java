/**
 * Created by EE on 24.09.2017.
 */

public class CooperatorAgent implements Agent {

    private int iNumCoins = 0;

    public CooperatorAgent(int iNumCoins) {
        this.iNumCoins = iNumCoins;
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
