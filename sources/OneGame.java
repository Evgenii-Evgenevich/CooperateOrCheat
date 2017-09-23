/**
 * Created by EE on 23.09.2017.
 */


import java.util.Collection;

public class OneGame {

    public Collection<Agent> agents;

    public OneGame(int iNumCheaters, int iNumCooperators, int iNumMonkeys, int iNumCopyAgents, int iNumCoins) {

        for (int i = 0; i < iNumCheaters; ++i) {
            agents.add(new CheaterAgent(iNumCoins));
        }

        for (int i = 0; i < iNumCooperators; ++i) {
            agents.add(new CooperatorAgent(iNumCoins));
        }

        for (int i = 0; i < iNumMonkeys; ++i) {
            agents.add(new MonkeyAgent(iNumCoins));
        }

        for (int i = 0; i < iNumCopyAgents; ++i) {
            agents.add(new CopyAgent(iNumCoins));
        }
    }

    public void game(Agent leftAgent, Agent rightAgent) {

        if (leftAgent != rightAgent && leftAgent != null && rightAgent != null) {

            boolean leftRes = leftAgent.step(rightAgent);

            boolean rightRes = rightAgent.step(leftAgent);

            leftAgent.endStep(rightAgent, rightRes);
            rightAgent.endStep(leftAgent, leftRes);

            if (leftRes && rightRes) {
                leftAgent.addCoins(1);
                rightAgent.addCoins(1);
            } else if (leftRes && !rightRes) {
                leftAgent.addCoins(-2);
                rightAgent.addCoins(3);
            } else if (!leftRes && rightRes) {
                leftAgent.addCoins(3);
                rightAgent.addCoins(-2);
            } else if (!leftRes && !rightRes) {
                leftAgent.addCoins(-1);
                rightAgent.addCoins(-1);
            }
        }
    }

    public int round() {

        for (Agent agentI : agents) {
            for (Agent agentJ : agents) {
                game(agentI, agentJ);
            }
        }

        for (Agent agent : agents) {
            if (agent.getCoins() < 0) {
                agents.remove(agent);
            }
        }

        return agents.size();
    }
}



