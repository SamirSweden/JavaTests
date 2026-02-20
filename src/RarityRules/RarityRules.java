public class RarityRules {

    public enum  Rarity {
        COMMON,
        RARE,
        EPIC,
        LEGENDARY
    }

    public boolean isRateOrBetter(Rarity rarity){
        return  rarity == Rarity.RARE ||
                rarity == Rarity.EPIC ||
                rarity == Rarity.LEGENDARY;
    }
}
