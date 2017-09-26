# Cooperate Or Cheat
the game of cooperation

    --
    The system has N-agents. Each agent has a starting amount of money M coins. Agents can interact with each other in the following scenario:
    At the beginning of the game, each agent puts either zero or one coin on the stake. Opponents do not see how many coins each of them put. Then the following happens: 
    1. If both put on a coin then both get two. 
    2. If both do not put coins then each is fined for one coin. 
    3. If one of the players put a coin and the other does not then the player who puts the coin is fined one and the player who does not put the coin gets three.
    --
    The agents can be different strategies:
    The naive strategy: always put a coin on the stake hoping to get two if the opponent does the same
    The greedy strategy: never put coins hoping to get three if the opponent does the opposite
    --
    To take the rounds of the game in which everyone plays with everyone. At the end of a round the agents with a negative amount in the account die. If less than two agents, the game ends.
    --
    