package Armes;

public class Sword extends Weapon {

    private static final double DAMAGE = 20;
    private static final double PRICE = 50;
    private static final String NAME = "Sword";
    private static final double MONSTER_DAMAGE_RATIO = 1.5;
    private static final double OBSTACLE_DAMAGE_RATIO = 1.5;


    public Sword() {
        super(DAMAGE, PRICE, NAME, MONSTER_DAMAGE_RATIO, OBSTACLE_DAMAGE_RATIO);
    }

    public String asciiArt() {
        return
                "      /\\\n" +
                        "     /__\\\n" +
                        "    |    |\n" +
                        "    |    |\n" +
                        "    |    |\n" +
                        "    |    |\n" +
                        "    |____|\n" +
                        "    |____|\n" +
                        "      ||\n" +
                        "      ||\n" +
                        "      ||\n" +
                        "      ||\n" +
                        "      ||\n" +
                        "     /__\\\n";
    }
}
