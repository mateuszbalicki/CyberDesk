public class Komandos extends Agent implements Localization {
    private int amunicja;

    public Komandos(String name, int healthLevel, String rank, int amunicja) {
        super(name, healthLevel, rank);
        this.amunicja = amunicja;
    }

    @Override
    public void useAbility() throws NoAmmoException {
        if (amunicja <= 0) throw new NoAmmoException("Komandos nie ma czym strzelać!");
        else amunicja -= 1;
    }

    public int[] getCoordinates() {
        return new int[]{10, 20};
    }
}
