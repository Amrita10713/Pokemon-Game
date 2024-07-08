public abstract class Item {
    private String name;
    private String type;
    private Effect effect;

    public Item(String name, String type, Effect effect) {
        this.name = name;
        this.type = type;
        this.effect = effect;
    }

    public abstract void use(Pokemon target);
}