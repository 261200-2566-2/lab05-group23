public class MageImpl implements Mage {
    double maxHP = 100;
    double maxMana = 100;
    double currentHP = maxHP;
    double currentMana = maxMana;
    double spellpower = 100;
    BookOfSpell equippedBookOfSpell;
    MagicWand equippedMagicWand;
    SkullCrystal equippedSkullCrystal;
    double damageReduction;
    double specialDefenseDamage;
    double nextDamageReduction;

    @Override
    public void castAttackSpell(String spellName, Mage target) {
        if (spellName.equals("explosion")) {
            double damage = 2 * 0.1 * spellpower;
            System.out.println("Explosion spell activated. Damage: " + damage);
            target.receiveDamage(damage);
            currentMana -= 10;
        }
    }

    @Override
    public void castDefenseSpell(String spellName) {
        if (spellName.equals("barrier")) {
            System.out.println("Barrier activated.");
            currentMana -= 10;
            setDamageReduction(1 * 0.1 * spellpower);
        }
    }

    @Override
    public void castSpecialAttackSpell(String spellName, Mage target) {
        if (equippedMagicWand != null) {
            equippedMagicWand.castSpecialAttackSpell(spellName, target);
        }
    }

    @Override
    public void upgradeSpell(String spellName, Mage target) {
        if (equippedBookOfSpell != null) {
            equippedBookOfSpell.upgradeSpell(spellName, target);
        }
    }

    @Override
    public double getCurrentHP() {
        return currentHP;
    }

    @Override
    public void receiveDamage(double damage) {
        if (equippedSkullCrystal != null) {
            damage = 0;
        } else {
            damage -= damageReduction;
            damage -= specialDefenseDamage;
            damage -= nextDamageReduction;
            damage = Math.max(0, damage);
            currentHP -= damage;
        }
    }

    @Override
    public void setDamageReduction(double reduction) {
        this.damageReduction = reduction;
    }

    @Override
    public void setNextDamageReduction(double reduction) {
        this.nextDamageReduction = reduction;
    }

    @Override
    public void castSpecialDefenseSpell(String specialSpellName) {
        if (equippedMagicWand != null) {
            equippedMagicWand.castSpecialDefenseSpell(specialSpellName);
        }
    }
    @Override
    public void equippedSkullCrystal(SkullCrystal skullCrystal) {
        this.equippedSkullCrystal = skullCrystal;
        upMagicStat();
    }

    @Override
    public void equippedMagicWand(MagicWand magicWand) {
        this.equippedMagicWand = magicWand;
        upMagicStat();
    }

    @Override
    public void equippedBookOfSpell(BookOfSpell bookOfSpell) {
        this.equippedBookOfSpell = bookOfSpell;
        upMagicStat();
    }
    @Override
    public void upMagicStat() {

    }
    @Override
    public void cancelEnemyAttack() {
        if (equippedSkullCrystal != null) {
            equippedSkullCrystal.cancelEnemyAttack();
        }
        equippedSkullCrystal = null;
    }

}
