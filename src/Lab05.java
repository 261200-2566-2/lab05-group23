public class Lab05 {
    public static void main(String[] args) {

        Druid druid = new DruidImpl();
        Necromancer necromancer = new NecromancerImpl();

        SkullCrystal necromancerSkullCrystal = new SkullCrystalImpl();
        necromancer.equippedSkullCrystal(necromancerSkullCrystal);


        System.out.println("HP of Druid: " + druid.getCurrentHP());
        System.out.println("HP of Necromancer: " + necromancer.getCurrentHP());


        druid.castNaturalPower("thunder", necromancer);
        necromancer.cancelEnemyAttack();
        necromancer.castDefenseSpell("barrier");
        druid.castAttackSpell("explosion", necromancer);

        //necromancer.summonSpirit("darkspirit");
        necromancer.spiritAttack("darkspirit", druid);

        System.out.println("Final HP of Druid: " + druid.getCurrentHP());
        System.out.println("Final HP of Necromancer: " + necromancer.getCurrentHP());
    }
}
