public interface MagicWand extends MagicItem {
    void castSpecialDefenseSpell(String specialSpellName);
    void castSpecialAttackSpell(String spellName, Mage target);
}
