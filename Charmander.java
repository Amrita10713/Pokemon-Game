public class Charmander extends Pokemon {
    public Charmander(String name, int hp, int attack, int defense, String type) {
        super(name, hp, attack, defense, type);
    }

    @Override
    public void attack(Pokemon target) {
        System.out.println(this.getName() + " uses Ember on " + target.getName() + "!");
        target.takeDamage(this.getAttack());
    }
}
