public class SpecialMove extends Move {
    public SpecialMove(String name, String type, int power, int accuracy, Effect effect) {
        super(name, type, power, accuracy, "Special", effect);
    }

    @Override
    public void applyEffect(Pokemon target) {
        // implement the logic for applying the special move's effect to the target Pokémon
        // for example, you could apply the move's power as damage to the target
        target.takeDamage(this.getPower());
        // if the move has an effect, apply it as well
        if (this.getEffect() != null) {
            this.getEffect().applyEffect(target);
        }
    }
}