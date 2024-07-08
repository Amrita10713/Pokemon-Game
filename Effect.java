public abstract class Effect {
    private String name;
    private int duration; // duration of the effect in turns

    public Effect(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public abstract void applyEffect(Pokemon target);

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }
}
