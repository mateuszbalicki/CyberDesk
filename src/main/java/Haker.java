public class Haker extends Agent {
    public Haker(String name, int healthLevel, String rank) {
        super(name, healthLevel, rank);
    }

    @Override
    public void useAbility() throws Exception {
        System.out.println("Włamuję się do mainframe'u...");
    }
}
