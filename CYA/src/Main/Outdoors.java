package Main;

import java.util.*;

import Npc.Fiend;
import Npc.Friend;
import Npc.Monsters;
import Obj.Hammer;
import Obj.Sword;
import Obj.bowArrow;

class Outdoors{

    static Hammer w1 = new Hammer();
    static Sword w2 = new Sword();
    static bowArrow w3 = new bowArrow();

    public static void Exterior(Scanner in) {

        Monsters Wolf = new Monsters("Werewolf", "swipes");

        try{
            System.out.println("You leave the tower with the man and stand just outside in a small clearing surrounded by forest.\n"
            + "'We need to be careful now, there's all kinds of beasts in these woods.'\n"
            + "As he finishes his sentence, a low howling can be heard all around.\n"
            + "'Look out!' he exclaims.\n"
            + "You only have time for one quick attack.\n"
            + "How do you attack?\n"
            + "Press (1) for Hammer, (2) for Sword, or (3) for the Bow.\n");
            int wAttack3 = in.nextInt();

            switch(wAttack3){
                case 1:
                    System.out.println("The " + Wolf.name + " is too fast for a Hammer strike.\n"
                    + "It pounces you and " + Wolf.strike + " at your face.\n"
                    + "The man grabs the werewolf off of you and breaks its neck.\n");
                    Forest(in);
                        break;
                case 2:
                    System.out.println("You swing your sword wildly overhead and it " + w2.attackType() + " the " + Wolf.name + " in two halves.\n");
                    Forest(in);
                        break;
                case 3:
                    System.out.println("You ready an arrow from the bow but can't see where the noise is coming from.\n"
                    + "A " + Wolf.name + "pounces on you and " + Wolf.strike + " at your back.\n"
                    + "The man grabs the werewolf off of you and breaks its neck.\n");
                    Forest(in);
                        break;
            }

            if(wAttack3 > 3){
                System.out.println("Please choose one of the options.");
                Exterior(in);
            }
        }catch(NoSuchElementException ex){
            System.out.println("Overwhelmed by everything you drop down and curl into a ball on the ground.\n"
            + "The " + Wolf.name + " pounces on the man. He quickly outmaneuvers it and breaks the werewolfs neck.\n");
            in.next();
            Forest(in);    
        }
    }

    public static void Forest(Scanner in) {

        Monsters Basilisk = new Monsters("Basilisk", "bite");
        
        try{
            System.out.println("'That was a close one, lets keep going' he says to you.\n"
            + "After a few hours walking through the forest, you and the man decide to take a quick rest.\n"
            + "The man goes behind some bushes to do his business while you stay alert and look out for any threats.\n"
            + "A few minutes go by and the man doesn't return. You hear rustling in the tree tops but there isn't anything up there.\n"
            + "'Hello' you cry out. You grab the glowing rod and get ready for a fight. A faint shimmering appears in the trees above you and\n"
            + " you see a large scaley body flying towards you.\n"
            + "How do you attack?\n"
            + "Press (1) for Hammer,(2) for Sword, (3) for the Bow.\n");
            int wAttack4 = in.nextInt();

            switch(wAttack4){
                case 1:
                    System.out.println("A blow from the hammer collides with the " + Basilisk.name + " and cracks its powerful scales before it can " + Basilisk.strike + " you.\n");
                    Camp(in);
                        break;
                case 2:
                    System.out.println("A overhead swing towards the beast collides and " + w2.attackType() + " into the " + Basilisk.name + " head, firmly lodging itself in its skull.\n");
                    Camp(in);
                        break;
                case 3:
                    System.out.println("You're too slow pulling back the bow string and the " + Basilisk.name + " opens its wide mouth to " + Basilisk.strike + " you\n");
                    Camp(in);
                        break;
            }

            if(wAttack4 > 3){
                System.out.println("Please choose one of the options.");
                Forest(in);
            }
        }catch(NoSuchElementException ex){
            System.out.println("You become paralyzed with fear and can't move. The man jumps into the mouth of the " + Basilisk.name + " before it can " + Basilisk.strike + " you.\n"
            + "You watch as the Basilisk writhes around as if it was choking on something. It lies still after a few moments and the man emerges covered in goo.\n"
            + "He looks at you and then the beast and says 'Perhaps we should make camp.\n");
            in.next();
            Camp(in);
        }
    }

    /**
     * @param in
     */
    public static void Camp(Scanner in) {

        int finAtt = 0;

        Friend fairy = new Friend("Lily", "Small Key");
        Fiend elf = new Fiend("Elven Assassin", "Dagger", "Thrusts");
        
        System.out.println("The man picks a spot to sleep for the night and spreads some stones with carvings in them around the perimeter.\n"
         + "'These are so nothing tries to kill us in our sleep' he says to you.\n"
         + "With a campfire setup, the man is fast asleep and you stare into the sky.\n"
         + "You a hear a faint twinkling and a small woman flies towards you from out of the moonlight.\n"
         + "'Who are you' you ask it. In a high voice it says, I am " + fairy.name + " and I have a gift for you.\n"
         + "She drops a " + fairy.item + " into your hand and it grows larger into a regular key.\n"
         + "As soon as you look back up the fairy is gone.");
        
        System.out.println("Unsure of what to do with the key you curl up on your bedroll and go to sleep.\n"
         + "The morning sunlight and the sound of movement wake you up.\n"
         + "You look over at the man and see that he is coughing and choking on his own blood.\n"
         + "You run over to him to try to help, but it's too late. The man shoves you aside with his dying breath as a figure lunges towards you \n"
         + " and buries a knife into the mans chests. You run to your items and grab the glowing rod. The figure pulls off a hood and pulls the knife out of the man.\n"
         + "The " + elf.name + " turns to face you with a thin, bloody " + elf.weapon + " dripping blood. She leans down and begins to run towards you.\n");

        try{
            System.out.println("How will you attack?\n"
            + "Press (1) for Hammer, (2) for Sword, (3) for Bow\n");
            finAtt = in.nextInt();

            switch(finAtt){
                case 1:
                    System.out.println("You swing, but the hammer only " + w1.attackType() + " the earth in front of you as the \n"
                     + elf.name + elf.hit + " her " + elf.weapon + " into your chest. You feel warmth flowing down your chest and then darkness.\n"
                     + " G A M E  O V E R\n");
                        break;
                case 2:
                    System.out.println("The " + elf.name + " dashes towards you and you swing all around with the sword, but she is too fast.\n"
                     + " she dashes all around and " + elf.hit + " her " + elf.weapon + " into your back. You gasp and feel warmth run over your body, then darkness.\n"
                     + " G A M E  O V E R");
                        break;
                case 3:
                    System.out.println("As the " + elf.name + " dashes towards you, you take a quick breath and let loose an arrow. She is quick\n "
                     + " but not quick enough. The glowing arrow plants itself in her cheek, below her left eye. She drops the " + elf.weapon + " and lies dead.\n");
                        break;
            }

                if(finAtt > 3){
                    System.out.println("Your nerves freeze up and the elf kills you.\n");
                return;
                 }

        }catch(NoSuchElementException ex){
            System.out.println("Anxiety overcomes you and you fumble the glowing rod and the Elven Assassin thrusts her blade into your heart.\n"
             + "G A M E  O V E R");
            return;
        }

        if(finAtt == 3){
            Main.finale(null);
        }
    }     
}