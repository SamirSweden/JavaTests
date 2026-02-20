import java.util.Objects;

public class CharacterSheet {

    private final String name;
    private final String clazz;
    private final int hp;
    private final int mana;
    private final int strength;

    public CharacterSheet(String name, String clazz, int hp, int mana,
                          int strength) {
        this.name = Objects.requireNonNull(name, "name");
        this.clazz = Objects.requireNonNull(clazz, "clazz");
        if (hp < 0 || mana < 0 || strength < 0)
            throw new IllegalArgumentException("stats must be >= 0");
        this.hp = hp;
        this.mana = mana;
        this.strength = strength;
    }

     // getters
    public String getName() { return name; }
    public String getClazz() { return clazz; }
    public int getHp() { return hp; }
    public int getMana() { return mana; }
    public int getStrength() { return strength; }
}
