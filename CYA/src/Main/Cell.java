package Main;

import java.util.*;

public class Cell{
    public static void decis_one(Scanner in){ 
        try{
            System.out.println("You awaken in a dark room lying on a cold, hard floor.\n"
                 + "A faint moonlight barely illuminates the room as your eyes begin to adjust to the darkness.\n"
                 + "You see that you're in a small cell made of stone. To your left is a door.\n"
                 + "Above you is a small barred window. What do you do?\n"
                 + "Choose one of the options:\n"
                 + "1) Open the door.\n"
                 + "2) Look out the window\n"
                 + "3) Call for help\n");
                 int choice = in.nextInt();
                 switch(choice) { 
                     case 1:
                         System.out.println("The large wooden door is locked from the outside.\n");
                         
                         System.out.println("What do you want to do?\n");                    
                         decis_two(in);
                         break;
                     case 2:
                         System.out.println("You get on your feet and tip-toe to the window.\n"
                         + "All you can make out through the moonlight is a treeline.\n");

                         System.out.println("What do you want to do?\n");
                         decis_three(in);
                         break;
                     case 3:
                         System.out.println("Hoarsely, you call out for help and hear silence.\n"
                         + "After` a few moments you can hear faint moans and shuffling outside the window.\n");
                         
                         System.out.println("You wait for a few seconds and can hear shuffling outside the window\n"
                         + "getting closer and closer. You can make out the silhouette of someone in the window.\n"
                         + " 'I've been looking everywhere for you.' a gruff voice exclaims.\n");
                         charInfo(in);
                         break;
                 }
            if(choice > 3){
                System.out.println("Please enter one of the options.\n");
                decis_one(in);
            }
        }catch(NoSuchElementException ex){
             System.out.println("Error, not a number!\n");
             in.next();
             decis_one(in);
        }
    }

    public static void decis_two(Scanner in){
        try{
            System.out.println("1) Look out the window\n"
             + "2) Call for help\n");
            int choice2 = in.nextInt();
            switch(choice2) {
                case 1:  System.out.println("You get on your feet and tip-toe to the window.\n"
                + "All you can takeout through the moonlight is a treeline.\n");
                System.out.println("Unsure of your options, you huddle in a corner of the cell.\n"
                + "After what feels like hours you can hear a shuffling coming from outside the window.\n"
                + " You can make out the silhouette of someone in the window. 'I've been looking everywhere for you' a gruff voice exclaims.\n");
                charInfo(in);
                    break;
                case 2: System.out.println("Hoarsely, you call out for help and hear silence.\n"
                 + "After a few moments you can hear faint moans and shuffling outside the window.\n");
                System.out.println("You wait for a few seconds and can hear shuffling outside the window\n"
                + "getting closer and closer. You can make out the silhouette of someone in the window.\n"
                + " 'I've been looking everywhere for you.' a gruff voice exclaims.\n");
                charInfo(in);
                    break;
            }

            if(choice2 > 2){
                System.out.println("Please enter one of the options\n");
                decis_two(in);
            }

        }catch(NoSuchElementException ex){
            System.out.println("Burdened with fear you stand unable to do anything.\n"
            + "You see a silhouette block out the moonlight from the window. Its a man!\n");
            charInfo(in);
        }
    }   

    public static void decis_three(Scanner in){

        try{
            System.out.println("1) Open the door.\n"
                 + "2) Call for help\n");
            int choice3 = in.nextInt();
            switch(choice3){
                case 1: 
                    System.out.println("The large wooden door is locked from the outside\n");
                    System.out.println("Unsure of your options, you huddle in a corner of the cell.\n"
                        + "After what feels like hours you can hear a shuffling coming from outside the window.\n"
                        + " You can make out the silhouette of someone in the window. 'I've been looking everywhere for you' a gruff voice exclaims.\n");
                    charInfo(in);
                        break;
                case 2: 
                    System.out.println("Hoarsely, you call out for help and hear silence.\n"
                    + "After a few moments you can hear faint moans and shuffling outside the window.");
                    System.out.println("You wait for a few seconds and can hear shuffling outside the window\n"
                    + "getting closer and closer. You can make out the silhouette of someone in the window.\n"
                    + " 'I've been looking everywhere for you.' a gruff voice exclaims.\n");
                    charInfo(in);
                        break;
            }

            if(choice3 > 2){
                System.out.println("Please enter one of the options.\n");
                decis_three(in);
            }
        }catch(NoSuchElementException ex){
            System.out.println("Burdened with fear you stand unable to do anything.\n"
             + "You see a silhouette block out the moonlight from the window. Its a man!\n");
            charInfo(in);
        }

    }
    
    public static void charInfo(Scanner in){
        LinkedHashMap<String, String> userInfo = new LinkedHashMap<String, String>();

        in.nextLine();

        String name;
        String location;
        
        System.out.println("The man rips out the bars from the window with an unnatural strength and climbs into the room.\n"
         + "'You must be the princess' he exclaims. 'I wasn't given a lot of info for finding you besides a location.'\n"
         + "Who are you anyway?\n"
         + "Please enter your name:\n");
        name = in.nextLine();

        System.out.println("'Let's be on our way then,' he says to you.\n"
         + "'They're paying me a lot of money to get you back to...'\n"
         + "'Where are you from again?'\n"
         + "Enter where you are from:\n");
        location = in.nextLine();

        userInfo.put("Alright then ", name); userInfo.put("from ", location);
        
        Set<String> keys = userInfo.keySet();

        for(String key : keys){
            System.out.println(key + "" + userInfo.get(key));
        }

        System.out.println("Lets be on our way then.\n");

        Main.main2(location);    
    }
}