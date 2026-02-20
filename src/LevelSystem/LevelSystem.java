public class LevelSystem {
    public int levelFromXp(int xp) {
        if (xp < 0) throw new IllegalArgumentException("xp must be >= 0");
        if (xp <= 99) return 1;
        if (xp <= 249) return 2;
        if (xp <= 499) return 3;
        if (xp <= 899) return 4;
        return 5;
    }
}
