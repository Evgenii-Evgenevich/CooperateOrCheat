/**
 * Created by EE on 23.09.2017.
 */

// the greedy strategy: never put coins hoping to get three if the opponent does the opposite
public class CheaterAgent implements Agent {

    private int iNumCoins = 0;

    public CheaterAgent(int iNumCoins) {
        this.iNumCoins = iNumCoins;
    }

    public boolean step(Agent opponent) {
        // always cheat
        return false;
    }

    public String getStrategy() {
        return "greedy";
    }

    public void endStep(Agent opponent, boolean isCooperate) {}

    public void addCoins(int iNumCoins) {
        this.iNumCoins += iNumCoins;
    }

    public int getCoins() {
        return this.iNumCoins;
    }
}



