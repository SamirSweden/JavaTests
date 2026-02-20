import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RarityRulesTest {

    private final  RarityRules rules = new RarityRules();

    @Test
    void isRateOrBetter() {
        assertFalse(rules.isRateOrBetter(RarityRules.Rarity.COMMON));
        assertTrue(rules.isRateOrBetter(RarityRules.Rarity.EPIC));
        assertTrue(rules.isRateOrBetter(RarityRules.Rarity.RARE));
        assertTrue(rules.isRateOrBetter(RarityRules.Rarity.LEGENDARY));
    }
}

// if element === common return false else return true 
