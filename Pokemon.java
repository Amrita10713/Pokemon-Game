public abstract class Pokemon {
    private String name;
    private int hp;
    private int attack;
    private int defense;
    private String type;

    public Pokemon(String name, int hp, int attack, int defense, String type) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public String getType() {
        return type;
    }

    public abstract void attack(Pokemon target);

    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }
}