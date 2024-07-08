public abstract class Move {
    protected String name;
    protected String type;
    protected int power;
    protected int accuracy;
    protected String moveType;
    protected Effect effect;

    public Move(String name, String type, int power, int accuracy, String moveType, Effect effect) {
        this.name = name;
        this.type = type;
        this.power = power;
        this.accuracy = accuracy;
        this.moveType = moveType;
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public String getMoveType() {
        return moveType;
    }

    public Effect getEffect() {
        return effect;
    }

    public abstract void applyEffect(Pokemon target);
}