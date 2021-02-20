package org.abc.characters;

public class Hero {
    private int lvl = 1;
    private double hp = 400 * (lvl * 0.5);
    private double mp = 100;
    private double damage = 30 * (lvl * 0.7);

    void move() {

    }

    public void attack(Zombie zombie) {
        System.out.println("Hero: attack");
        zombie.getHurt(lvl, damage);
    }

    public void heal() {
        System.out.println("Hero: heal");
        hp += (lvl * 0.7) * 50;
        mp -= 25;
    }

    public double getMp() {
        return mp;
    }

    public double getHp() {
        return this.hp;
    }

    public void getHurt(int lvl, double damage) {
        this.hp -= (this.lvl - lvl + 1) * damage;
    }
}
