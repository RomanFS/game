package org.abc.characters;

public class Zombie {
    int lvl = 1;
    double hp = 250 * (lvl * 0.5);
    double mp = 50;
    private double damage = 30 * (lvl * 0.7);

    public void move() {

    }

    public void attack(Hero hero) {
        System.out.println("Zombie: attack");
        hero.getHurt(lvl, damage);
    }

    public double getHp() {
        return this.hp;
    }

    public void getHurt(int lvl, double damage) {
        this.hp -= (this.lvl - lvl + 1) * damage;
    }
}
