public class Pokeball extends Item {
    protected int catchRate;

    public Pokeball(String name, int catchRate) {
        super(name, "Pokeball", null);
        this.catchRate = catchRate;
    }

    public void use(Pokemon target) {
        // Attempt to catch a wild Pokémon
    }
}