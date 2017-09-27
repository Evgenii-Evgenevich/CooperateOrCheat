/**
 * Created by EE on 24.09.2017.
 */

import java.util.*;

// the imitation strategy: at the first step put coin on the stake and next copy the previous step of the opponent
public class CopyistAgent implements Agent {

    Map<Agent, Boolean> lastSteps = null;

    private int iNumCoins = 0;

    public CopyistAgent(int iNumCoins) {
        this.lastSteps = new HashMap<Agent, Boolean>();
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
            // copy the previous step of opponent
            return value.booleanValue();
        }
    }

    public void endStep(Agent opponent, boolean isCooperate) {
        Boolean value = lastSteps.get(opponent);
        if (value == null) {
            this.lastSteps.put(opponent, new Boolean(isCooperate));
        }
        else {
            this.lastSteps.replace(opponent, new Boolean(isCooperate));
        }
    }

    public void addCoins(int iNumCoins) {
        this.iNumCoins += iNumCoins;
    }

    public int getCoins() {
        return this.iNumCoins;
    }
}

