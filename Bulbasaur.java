public class Bulbasaur extends Pokemon {
    public Bulbasaur(String name, int hp, int attack, int defense, String type) {
        super(name, hp, attack, defense, type);
    }

    @Override
    public void attack(Pokemon target) {
        System.out.println(this.getName() + " uses Razor Leaf on " + target.getName() + "!");
        target.takeDamage(this.getAttack());
    }
}
