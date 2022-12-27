package Main;

import java.util.*;

import Npc.Enemy;
import Obj.Hammer;
import Obj.Sword;
import Obj.bowArrow;

public class Corridor{
    public static void fight(Scanner in){

        Enemy enemy = new Enemy();
        enemy.setName("Tower Guard");
        enemy.setAttack("strikes");

        Hammer w1 = new Hammer();
        Sword w2 = new Sword();
        bowArrow w3 = new bowArrow();
        
        try{
            System.out.println("Watch out there is a " + enemy.getName() + "!\n"
            + "How will you attack?\n"
            + "Press (1) for Hammer, (2) for Sword, or (3) for Bow.\n");
            int wAttack = in.nextInt();

            switch(wAttack){
                case 1:
                    System.out.println("Your hammer " + w1.attackType() + " the guard.\n");
                    fight2(in);
                        break;
                case 2:
                    System.out.println("Your sword " + w2.attackType() + " the guard in two!\n");
                    fight2(in);
                        break;
                case 3:
                    System.out.println("Your arrow " + w3.attackType() + " the guards chest!\n");
                    fight2(in);
                        break; 
            }

            if(wAttack > 3){
                System.out.println("Choose one of the options!\n");
                fight(in);
            }
        }catch(NoSuchElementException ex){
            System.out.println("Choose one of the options!");
            in.next();
            fight(in);
        }
    }

    public static void fight2(Scanner in) {

        Enemy enemy2 = new Enemy();
        enemy2.setName("Tower Guards");
        enemy2.setAttack("strike");

        Hammer w1 = new Hammer();
        Sword w2 = new Sword();
        bowArrow w3 = new bowArrow();

        try{
            System.out.println("More " + enemy2.getName() + " are running toward us from the other end of this Corridor.\n"
            + "How will you attack them?\n"
            + "Press (1) for Hammer, (2) for Sword, or (3) for Bow\n");
            int wAttack2 = in.nextInt();

            switch(wAttack2){
                case 1:
                    System.out.println("You brace your self for attacks from the guard and wait until they reach you.\n"
                    + "Your hammer swings " + w1.attackType() + " each guard as they near you. The enemies " + enemy2.getAttack() + " at you\n"
                    + " but you manage to take them all out.\n");
                    corrEnd(null);
                        break;
                case 2:
                    System.out.println("You ready your Sword and meet the " + enemy2.getName() + " halfway.\n"
                    + "You quickly deflect each " + enemy2.getAttack() + " skillfully and each swipe " + w2.attackType() + " the guards with ease.\n");
                    corrEnd(null);
                        break;
                case 3:
                    System.out.println("Pulling back the bow-string makes a glowing arrow appear. You take aim at\n"
                     + " the " + enemy2.getName() + " and fire. The arrow " + w3.attackType() + " through multiple guards.\n");
                    corrEnd(null);
                        break;
            }

            if(wAttack2 > 3){
                System.out.println("Please choose one of the options!");
                fight2(in);
            }
        }catch(NoSuchElementException ex){
            System.out.println("You wave the glowing rod around and can't seem to get it to work again.\n"
            + " Your rescuer jumps in and fights off all the guards.");
            in.next();
            corrEnd(null);
        }
    }

    public static void corrEnd(String[] args) {
        System.out.println("That was close, you did pretty good back there for having been locked up for so long.\n"
        + "Let's get outside this tower already.\n");
        Main.main3(args);
    }
}