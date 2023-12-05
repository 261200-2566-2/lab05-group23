public interface Mage {
    void castAttackSpell(String spellName, Mage target);
    void castDefenseSpell(String spellName);
    void castSpecialAttackSpell(String spellName, Mage target);
    void upgradeSpell(String spellName, Mage target);
    double getCurrentHP();
    void receiveDamage(double damage);
    void setDamageReduction(double reduction);
    void setNextDamageReduction(double reduction);
    void castSpecialDefenseSpell(String specialSpellName);
    void equippedSkullCrystal(SkullCrystal skullCrystal);

    void equippedMagicWand(MagicWand magicWand);

    void equippedBookOfSpell(BookOfSpell bookOfSpell);
    void upMagicStat();
    void cancelEnemyAttack();
}
