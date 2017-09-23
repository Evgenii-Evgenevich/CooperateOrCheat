/**
 * Created by EE on 23.09.2017.
 */


public interface Agent {

    // [return] Do Agent Cooperate Opponent ? true : false
    public boolean step(Agent opponent);

    public void endStep(Agent opponent, boolean isCooperate);

    public void addCoins(int iNumCoins);

    public int getCoins();

}
