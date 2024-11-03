package Personnage;

import Destroy.Destructible;

public class Warrior extends Character {
    private static final double SPECIAL_DAMAGE = 20;
    private double energy;

    public Warrior(String name, double health, String characterClass, double energy) {
        super(name, health, characterClass);
        this.energy = energy;
    }

    @Override
    public String asciiArt() {
        return "⚔️ Warrior " + getName();
    }

    @Override
    public void specialAttack(Destructible target) {
        if (this.energy >= 10) {
            this.energy -= 10;
            target.hit(SPECIAL_DAMAGE);
            System.out.println(getName() + " uses berserker attack and deals " + SPECIAL_DAMAGE + " damages!");
        } else {
            System.out.println(getName() + " doesn't have enough energy");
        }
    }
}