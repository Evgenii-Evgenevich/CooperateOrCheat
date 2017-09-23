/**
 * Created by EE on 23.09.2017.
 */

import java.util.Random;

public class MonkeyAgent implements Agent {

    private Random random = null;

    private int iNumCoins = 0;

    public MonkeyAgent(int iNumCoins) {
        this.random = new Random();
        this.iNumCoins = iNumCoins;
    }

    public boolean step(Agent opponent) {
        // random
        return random.nextBoolean();
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

