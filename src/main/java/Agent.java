import java.util.Objects;
import java.util.Random;

public abstract class Agent {
    private String name;
    private int healthLevel;
    private String rank;
    private int agentId;
    private static int agentsCount = 0;

    public Agent(String name, int healthLevel, String rank) {
        this.name = name;
        setHealthLevel(healthLevel);
        this.rank = rank;
        agentsCount += 1;
        this.agentId = agentsCount;
    }
    public Agent(String name) {
        this(name,100,"Rekrut");
    }

    public abstract void useAbility() throws Exception;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        if (healthLevel < 0) {
            this.healthLevel = 0;
        } else if (healthLevel > 100) {
            this.healthLevel = 100;
        } else {
            this.healthLevel = healthLevel;
        }
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public int getAgentId() {
        return agentId;
    }

    public static int getAgentsCount() {
        return agentsCount;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "name='" + name + '\'' +
                ", healthLevel=" + healthLevel +
                ", rank='" + rank + '\'' +
                ", agentId=" + agentId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agent agent = (Agent) o;
        return agentId == agent.agentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentId);
    }

    public void zaatakuj(Agent cel, int obrazenia) {
        int noweZdrowie = cel.getHealthLevel() - obrazenia;
        cel.setHealthLevel(noweZdrowie);

        if (cel.getHealthLevel() == 0) {
            System.out.println("Cel " + cel.getName() + " pokonany!");
        }
    }
}
