/**
 * Created by EE on 24.09.2017.
 */

// the naive strategy: always put a coin on the stake hoping to get two if the opponent does the same
public class CooperatorAgent implements Agent {

    private int iNumCoins = 0;

    public CooperatorAgent(int iNumCoins) {
        this.iNumCoins = iNumCoins;
    }

    public String getStrategy() {
        return "naive";
    }

    public boolean step(Agent opponent) {
        // always cooperate
        return true;
    }

    public void endStep(Agent opponent, boolean isCooperate) {}

    public void addCoins(int iNumCoins) {
        this.iNumCoins += iNumCoins;
    }

    public int getCoins() {
        return this.iNumCoins;
    }
}
