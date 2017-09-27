# Cooperate Or Cheat
The Game Of Cooperation 

---

  The system has N-agents. Each agent has a starting amount of money M coins. Agents can interact with each other in the following scenario:
        
  At the beginning of the game each agent puts zero or one coin on the stake. Opponents do not see how many coins each of them put. Then the following happens: 
  1. If both put on a coin then both get two. 
  2. If both do not put coins then each is fined for one coin. 
  3. If one of the players put a coin and the other does not then the player who puts the coin is fined one and the player who does not put the coin gets three.

The agents can be different strategies:
  - The naive strategy: always put a coin on the stake hoping to get two if the opponent does the same
  - The greedy strategy: never put coins hoping to get three if the opponent does the opposite
  - The random strategy: randomly put coins

To take the rounds of the game in which each agent plays with each. At the end of a round the agents with a negative amount in the account die. If less than two agents, the game ends.

---

Realization: \
CooperatorAgent is an agent that plays the naive strategy (always cooperates) \
CheaterAgent is an agent that plays the greedy strategy (always cheats) \
MonkeyAgent is an agent that play the random strategy (stupid monkey) \
CopyistAgent is an agent that play the imitation strategy (new) \
OneGame is a game is played by the agents 

---

I added the imitation strategy for the agents (CopyistAgent). \
The imitation strategy: at the first step put coin on the stake and next copy the previous step of the opponent. \
I think the imitation strategy is a more optimal strategy than that proposed three.

The random strategy is the most nonoptimal strategy. \
The naive strategy is a good strategy if you are not alone. \
The greedy strategy only wins the first rounds. 

The Cooperator Agents and/or the Copyist Agents may play this game endlessly even if there are the few Cheater Agents.

---






