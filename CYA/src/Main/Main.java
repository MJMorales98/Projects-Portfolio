package Main;

import java.util.*;
import Obj.Hammer;
import Obj.Sword;
import Obj.bowArrow;

class Main{
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        Cell.decis_one(in);
    }

    public static void main2(String args) {

        Hammer w1 = new Hammer();
        Sword w2 = new Sword();
        bowArrow w3 = new bowArrow();

        try{
            System.out.println("'You'll need something to defend yourself with. Here take this.' The man hands you a glowing rod.\n"
            + "It's an magical item that can become three different kinds of weapons.\n"
            + "it can be a either a Hammer, a Sword, or a Bow.\n"
            + "Would you like to know more about the weapon types?\n"
            + "Type (1) for YES or (2) for NO\n");
            int winfo = in.nextInt();
            if(winfo == 1){
                System.out.println("The " + w1.name() + " is a solid weapon that has a " + w1.reach() + " range attack.\n"
                 + "The " + w2.name() + " is a sharp and slender blade with a " + w2.reach() + " for most enemies.\n"
                 + "The " + w3.name() + " is a mystic item that doesn't require physical arrows to fire. It is for enemies that are " + w3.reach() + " away.\n"
                 + "Now you know the basics. Just a split second decision will allow you to harness your weapon of choice for any given situation.\n"
                 + "Now lets get you out of here!\n");
                Corridor.fight(in);
            }else{
                System.out.println("Fair enough, you must know how each of those work anyway.\n");
                Corridor.fight(in);
            }
        }catch(NoSuchElementException ex){
            System.out.println("You must want to get out of here Lets go!\n");
            in.next();
            Corridor.fight(in);
        }
    }

    public static void main3(String[] args) {
        Outdoors.Exterior(in);
    }

    public static void finale(String[] args){
        System.out.println("After burying the man who saved you from the tower. You go through his bag and find a map and compass.\n"
         + "He's marked the location of the campe and has drawn arrows on how to get back to your home.\n"
         + "With your Key from Lily and the glowing rod, you set off for your home, and hopefully more answers.\n"
         + " ████████╗██╗░░██╗███████╗  ███████╗███╗░░██╗██████╗░\n"
         + " ╚══██╔══╝██║░░██║██╔════╝  ██╔════╝████╗░██║██╔══██╗\n"
         + " ░░░██║░░░███████║█████╗░░  █████╗░░██╔██╗██║██║░░██║\n"
         + " ░░░██║░░░██╔══██║██╔══╝░░  ██╔══╝░░██║╚████║██║░░██║\n"
         + " ░░░██║░░░██║░░██║███████╗  ███████╗██║░╚███║██████╔╝\n"
         + " ░░░╚═╝░░░╚═╝░░╚═╝╚══════╝  ╚══════╝╚═╝░░╚══╝╚═════╝░\n");
    }
}