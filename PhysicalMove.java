public class PhysicalMove extends Move {
    public PhysicalMove(String name, String type, int power, int accuracy, Effect effect) {
        super(name, type, power, accuracy, "Physical", effect);
    }

    @Override
    public void applyEffect(Pokemon target) {
        // implement the logic for applying the physical move's effect to the target Pokémon
        // for example, you could apply the move's power as damage to the target
        target.takeDamage(this.power);
        // if the move has an effect, apply it as well
        if (this.effect!= null) {
            this.effect.applyEffect(target);
        }
    }
}