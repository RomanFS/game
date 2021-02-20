package org.abc.characters;

public class Entity {
    private int lvl;
    private double hp;
    private double mp;
    private double damage;

    public Entity(int lvl, double hp, double mp, double damage) {
        this.setLvl(lvl);
        this.setHp(hp);
        this.setMp(mp);
        this.setDamage(damage);
    }

    public void attack(Entity entity) {
        //System.out.println("Hero: attack");
        entity.getHurt(lvl, damage);
    }

    public void heal() {
        //System.out.println("Hero: heal");
        hp += (lvl * 0.7) * 50;
        mp -= 25;
    }

    public double getMp() {
        return mp;
    }

    public double getHp() {
        return hp;
    }

    public void getHurt(int lvl, double damage) {
        this.hp -= (this.lvl - lvl + 1) * damage;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setMp(double mp) {
        this.mp = mp;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
