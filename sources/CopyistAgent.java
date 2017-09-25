/**
 * Created by EE on 24.09.2017.
 */

import java.util.Map;

// the imitation strategy:
public class CopyistAgent implements Agent {

    Map<Agent, Boolean> lastSteps;

    private int iNumCoins = 0;

    public CopyistAgent(int iNumCoins) {
        this.iNumCoins = iNumCoins;
    }

    public String getStrategy() {
        return "imitation";
    }

    public boolean step(Agent opponent) {
        Boolean value = lastSteps.get(opponent);

        if (value == null) {
            // cooperate at the first step
            return true;
        }
        else {
            // copy the last step of opponent
            return value.booleanValue();
        }
    }

    public void endStep(Agent opponent, boolean isCooperate) {
        this.lastSteps.remove(opponent);
        this.lastSteps.put(opponent, new Boolean(isCooperate));
    }

    public void addCoins(int iNumCoins) {
        this.iNumCoins += iNumCoins;
    }

    public int getCoins() {
        return this.iNumCoins;
    }
}

