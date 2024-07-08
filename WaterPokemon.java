public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense, "Water");
    }

    @Override
    public void attack(Pokemon target) {
        // implement the logic for the Water-type Pokémon's attack
        // for example, you could apply a random move from the Pokémon's move set
        Move move = getRandomMove();
        System.out.println(this.getName() + " uses " + move.getName() + " on " + target.getName());
        move.applyEffect(target);
    }

    private Move getRandomMove() {
        // implement the logic to select a random move from the Pokémon's move set
        // for example, you could return a random move from a list of moves
        return new SpecialMove("Water Gun", "Water", 40, 100, null);
    }
}