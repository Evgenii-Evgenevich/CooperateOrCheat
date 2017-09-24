/**
 * Created by EE on 23.09.2017.
 */


import java.util.Collection;

public class OneGame {

    public Collection<Agent> agents;

    public OneGame(int iNumCheaters, int iNumCooperators, int iNumMonkeys, int iNumCopyists, int iNumCoins) {
        for (int i = 0; i < iNumCheaters; ++i) {
            agents.add(new CheaterAgent(iNumCoins));
        }

        for (int i = 0; i < iNumCooperators; ++i) {
            agents.add(new CooperatorAgent(iNumCoins));
        }

        for (int i = 0; i < iNumMonkeys; ++i) {
            agents.add(new MonkeyAgent(iNumCoins));
        }

        for (int i = 0; i < iNumCopyists; ++i) {
            agents.add(new CopyistAgent(iNumCoins));
        }
    }

    public void game(Agent leftAgent, Agent rightAgent) {
        if (leftAgent != rightAgent && leftAgent != null && rightAgent != null) {
            // the step of the left agent
            boolean leftRes = leftAgent.step(rightAgent);

            // the step of the right agent
            boolean rightRes = rightAgent.step(leftAgent);

            // ending of the step of a left agent
            leftAgent.endStep(rightAgent, rightRes);

            // ending of the step of a right agent
            rightAgent.endStep(leftAgent, leftRes);

            if (leftRes && rightRes) {
                // if both put on a coin
                // then both get two
                leftAgent.addCoins(2);
                rightAgent.addCoins(2);

            } else if (leftRes && !rightRes) {
                // if the left agent put a coin and the right agent does not it
                // then the left agent is fined one coin and the right agent gets three
                leftAgent.addCoins(-1);
                rightAgent.addCoins(3);

            } else if (!leftRes && rightRes) {
                // if the left agent does not put a coin and the right agent does it
                // then the left agent gets three coins and the right agent is fined one
                leftAgent.addCoins(3);
                rightAgent.addCoins(-1);

            } else if (!leftRes && !rightRes) {
                // if both do not put coins
                // then each is fined for one coin
                leftAgent.addCoins(-1);
                rightAgent.addCoins(-1);
            }
        }
    }

    // a round of the game in which everyone plays with each agent
    public void round() {
        for (Agent agentI : agents) {
            for (Agent agentJ : agents) {
                game(agentI, agentJ);
            }
        }
    }

    // at the end of a round
    // removes agents who have the negative number of coins
    // returns the of remaining agents
    public int endRound() {
        for (Agent agent : agents) {
            if (agent.getCoins() < 0) {
                agents.remove(agent);
            }
        }

        return agents.size();
    }
}



