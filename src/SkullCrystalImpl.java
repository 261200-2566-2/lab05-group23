public class SkullCrystalImpl implements SkullCrystal {
    private double maxMana;
    private double spellpower;

    @Override
    public void cancelEnemyAttack() {
        System.out.println("Enemy attack canceled.");
    }
    @Override
    public void upMagicStat() {
        maxMana += 20;
        spellpower += 20;
    }

}
