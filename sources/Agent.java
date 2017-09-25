/**
 * Created by EE on 23.09.2017.
 */


public interface Agent {

    // returns the strategy of the agent
    public String getStrategy();

    // the step
    // [return] Do Agent Cooperate Opponent ? true : false
    public boolean step(Agent opponent);

    // the end of the step
    public void endStep(Agent opponent, boolean isCooperate);

    // add coins to the agent
    public void addCoins(int iNumCoins);

    // returns the number of remaining coins of the agent
    public int getCoins();

}
