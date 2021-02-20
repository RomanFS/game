package org.abc;

import org.abc.characters.Hero;
import org.abc.characters.Zombie;

import java.util.Scanner;

public class Main {
    private boolean gameStopped = false;
    private int steps = 1;
    private Hero hero;
    private Zombie zombie;

    public static void main(String[] args) {
        Main main = new Main();
        main.initGame();
    }

    void initGame() {
        hero = new Hero();
        zombie = new Zombie();

        System.out.println("GAME START");

        while (hero.getHp() > 0) {
            if (gameStopped) {
                break;
            }

            if (zombie.getHp() <= 0) {
                break;
            }

            update();
        }

        System.out.println("GAME OVER!");
    }

    void update() {

        if (steps > 0) {
            useStep();
            steps -= 1;
        } else {
            attackHero();
            steps += 1;
        }

        System.out.printf("Hero hp: %f", hero.getHp());
        System.out.println();
        System.out.printf("Zombie hp: %f", zombie.getHp());
        System.out.println();
    }

    void attackHero() {
        zombie.attack(hero);
    }

    void useStep() {
        int option = selectOption();

        switch (option) {
            case 0: endGame();
                break;
            case 1: hero.attack(zombie);
                break;
            case 2: hero.heal();
                break;
        }
    }

    int selectOption() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        return num;
    }

    void endGame() {
        gameStopped = true;
    }
}
