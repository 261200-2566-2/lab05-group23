public class MagicWandImpl implements MagicWand {
    private double maxMana;
    private double spellpower;
    private double currentMana;
    private double nextDamageReduction;

    @Override
    public void castSpecialDefenseSpell(String specialSpellName) {
        if (specialSpellName.equals("lightbarrier")) {
            System.out.println("Special Defense Spell (Light Barrier) activated.");
            setNextDamageReduction(4 * 0.1 * spellpower);
            currentMana -= 10;
        }
    }

    @Override
    public void castSpecialAttackSpell(String specialSpellName, Mage target) {
        if (specialSpellName.equals("superexplosion")) {
            double damage = 4 * 0.1 * spellpower;
            System.out.println("Special Attack Spell (Super Explosion) activated. Damage: " + damage);
            target.receiveDamage(damage);
            currentMana -= 10;
        }
    }
    private void setNextDamageReduction(double reduction) {
        this.nextDamageReduction = reduction;
    }
    @Override
    public void upMagicStat() {
        maxMana += 20;
        spellpower += 20;
    }
}
