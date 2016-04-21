package sandbox;

import java.util.*;
import java.util.Scanner;

public class text2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        /////////////////////// while (!inPut.equals("sleep") &&
        /////////////////////// !inPut.equals("look")) {
        int gold = 27;
        int health = 100;
        int maxAttackDamage = 15;

        int playerSta = 0;
        int defense = 3;

        int playerDeaths = 0;

        int exp = 9;

        int petHealth = 0;
        // -------------------------------------------------------------------------------------------------------------
        int level = 1;

        int nextLevel = 100;

        int skillP = 0;
        // -------------------------------------------------------------------------------------------------------------

        int maxEnemyHealth = 80;
        int maxEnemyAttack = 15;

        System.out.print("\n Your Name ");
        String name = in.nextLine();
        System.out.print("\n Ok.  And whats your gender?  ");
        String gender = in.nextLine();
        System.out.print("\n Ok.  And whats your eye Color?  ");
        String eyeColor = in.nextLine();

        System.out.println("\n========++ How To Play  ++===========");
        System.out.println(" To Play The Game" + "\n Use the numbers shown to go somewhere"
                + "\n or type exit or    { e } to leave " + "\n Use { lookself } to see what you have on you"
                + "\n If there is something to pickup type { pickup } no space"
                + "\n You can look around type { look } " + "\n Hp is your health. So dont let it get to 0"
                + "\n Go Home and Sleep to heal your health or use food"

                + "\n You need Exp to Level up" + "\n Type { eat } in fights to use food\n");
        in.nextLine();

        // @@@@@@@ITAMS@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        int sword = 0;

        if (sword > 0) {

            int swordAtt = 20;

        }

        // **************************************************************
        int shinyEgg = 0;
        // **************************************************************
        int food = 0;

        // **************************************************************
        int hat = 0;
        if (hat == 1) {
            defense += 3;
        }
        // **************************************************************
        int shard = 0;

        // **************************************************************
        String petName = null;

        // **************************************************************
        boolean travel = false;

        // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        int firePotion = 0, icePotion = 0, windPotion = 0;

        // @@@@@SREEN@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        boolean sreen = true;

        while (sreen) {



            //Clearing the screen++++++++++++++++++++++++++++++++++++++
            for (int i = 0; i < 50; ++i) System.out.println();



            System.out.println("\n\n     ___________________________    ");
            System.out.println("    |%%  %%  OUTSIDE   %%  %%|    ");
            System.out.println("==============================");
            System.out.println(" Where would you like to go?  \n");

            System.out.println("\t" + name + "\n__________\nHP " + health + "\n========\nAtt " + maxAttackDamage
                    + "   Def " + defense + "   Deaths " + playerDeaths + "    Gold " + gold + "    Lv " + level

                    + "\n\nExp " + exp + " // " + nextLevel);
            // @@OutSide@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

            System.out.println("___________________________________________");

            System.out.println("1 Home|2 Shop|3 Travel|4 Garden|5 Lookself ]   ");

            System.out.println("------------------------------------------------------------------------");
            String input = in.nextLine();

            if (input.equals("lookself") || (input.equals("5"))) {
                System.out.println("[Equipment]" + "\n [#}Sword " + sword + "                    [#}Gender    " + gender
                        + "\n [#}Hat " + hat + "                        [#}Eye Color    " + eyeColor + "\n [#}ShinyEgg "
                        + shinyEgg + "\n [#}Food " + food
                        + "\n [#}FirePotion " + firePotion
                        + "\n [#}IcePotion " + icePotion + "\n [#}WindPotion  "
                        + windPotion+ "\n [#}Shard "
                        + shard + "\n [#}Pet " + petName + " Hp " + petHealth
                        + "\n PlayerStats  " + playerSta
                );

                in.nextLine();
            }
            // @@@GARDEN@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            boolean garden = false;
            boolean tree = false;
            boolean nest = false;
            boolean eggChance = false;

            if (input.equals("garden") || (input.equals("4"))) {


//Clearing the screen++++++++++++++++++++++++++++++++++++++
                for (int i = 0; i < 50; ++i) System.out.println();



                //Clearing the screen++++++++++++++++++++++++++++++++++++++
                for (int i = 0; i < 50; ++i) System.out.println();

                garden = true;
                while (garden) {
                    System.out.println("\n\n     ___________________________    ");
                    System.out.println("    |%%  %%  GARDEN   %%  %%|    ");

                    System.out.println("==============================");
                    System.out.println("You find yourself walking in the entrance" + "\n of a beautiful garden .");

                    if (exp >= 100) {
                        level = 2;
                        playerSta = 2;

                        nextLevel = 275;
                    }

                    if (exp >= 100) {
                        level = 2;
                        playerSta = 2;

                        nextLevel = 275;
                    }

                    if (exp >= 275) {
                        level = 3;
                        playerSta = 2;

                        nextLevel = 420;
                    }

                    if (exp >= 420) {
                        level = 4;
                        playerSta = 2;

                        nextLevel = 640;
                    }

                    if (exp >= 640) {
                        level = 5;
                        playerSta = 2;
                        nextLevel = 945;
                    }

                    System.out.println("\t" + name + "\n__________\nHP " + health + "\n========\nAtt " + maxAttackDamage
                            + "   Def " + defense + "   Deaths " + playerDeaths + "    Gold " + gold + "    Lv " + level

                            + "\n\nExp " + exp + " // " + nextLevel);

                    System.out.println("___________________________________________________");

                    System.out.println("Enter [ med ]  for Meditate|1  Train|2  Look|3  Lookself ]   Exit");
                    System.out.println(
                            "-------------------------------------------------------------------------------------");

                    input = in.nextLine();




                    //Clearing the screen++++++++++++++++++++++++++++++++++++++
                    for (int i = 0; i < 50; ++i) System.out.println();




                    if (input.equals("train") || (input.equals("1"))) {

                        System.out.println(playerSta + "Player stats ");







                    }





                    if (input.equals("med")) {
                        System.out.println("\nAs you walk throw you goto your favorite spot"
                                + "\nand you sit down,. As you focus everything Fades"
                                + "\n out at you start to Meditate...");
                        exp += 100;

                        if (health < 99) {
                            health += 3;
                        }

                    }
                    // **************************************************************

                    if (input.equals("lookself") || (input.equals("3"))) {
                        System.out.println("[Equipment]" + "\n [#}Sword " + sword + "                    [#}Gender    " + gender
                                + "\n [#}Hat " + hat + "                        [#}Eye Color    " + eyeColor + "\n [#}ShinyEgg "
                                + shinyEgg + "\n [#}Food " + food
                                + "\n [#}FirePotion " + firePotion
                                + "\n [#}IcePotion " + icePotion + "\n [#}WindPotion  "
                                + windPotion+ "\n [#}Shard "
                                + shard + "\n [#}Pet " + petName + " Hp " + petHealth
                                + "\n PlayerStats  " + playerSta
                        );

                        in.nextLine();
                    }
                    // **************************************************************
                    if (input.equals("look") || (input.equals("2"))) {

                        System.out.println(
                                "\n You see your favorite spot and" + "\n around there you see theres lots trees"
                                        + "\n going out to a big feild." + "\n As you look out to the horizon you see "
                                        + "\n one of the bigist trees you have ever seen....."
                                        + "\n With vines growing up it and a strange"
                                        + "\n shape on the top.\n Would it be possible to climb?   ");
                    }

                    if (input.equals("climb") && eggChance == false) {

                        System.out.println("\nYou set out to the biggist tree you have ever seen."
                                + "\n Maybe if you climb to the top you'll find something.");
                        tree = true;

                    }
                    if (input.equals("exit") || (input.equals("e"))) {
                        garden = false;
                    }

                    while (tree) {
                        System.out.println("\nYou set off on your travels to the Great  Tree.");
                        in.nextLine();
                        System.out.println("\nYou make it to the base of the tree. Its alot bigger"
                                + "\nthen what it seemed. You start your climb.");
                        in.nextLine();

                        System.out.println("As you make it to the top, you see theres a Great Nest."
                                + "\n There is Four big eggs broke on the floor. "
                                + "\nAt the feet of a Big Wild Cat is a egg" + "\nOne Not Broken, ");
                        tree = false;
                        nest = true;
                        input = in.nextLine();
                    }
                    while (nest) {
                        System.out.println("\nYou can fight it." + "\nYes " + "\nNo ");
                        input = in.nextLine();

                        if (input.equals("yes")) {
                            System.out.println("You jumb at the cat and hit it off the tree. ");
                            in.nextLine();

                            System.out.println("you look for the last  egg but you cant find it. ");
                            in.nextLine();
                            if (shinyEgg == 1) {
                                System.out.println("You place the egg you found in the nest. ");
                                System.out.println("As you place it down you see a Big Great Forest Dragon"
                                        + "\n Flying your way. ");
                                in.nextLine();
                                System.out.println("It lands in the tree next to the nest. ");
                                in.nextLine();
                                System.out.println("... Not Shore what to do.. you wait."
                                        + "\n It looks right at you and start come for you.  ");
                                in.nextLine();
                                System.out.println("You on the egg so it wont brake."
                                        + "\n the eForest Dragon jumbs over you and hit the"
                                        + "\n Big Cat that was coming back for you and they"
                                        + "\n both fall out the tree and hit the ground."
                                        + "\n The Great tree is very big but you can still see"
                                        + "\n that its all over.. ");
                                in.nextLine();
                                System.out.println("the egg start to hatch and a baby fragon comes out"
                                        + "\n looks at you and lays next to you in the nest. ");
                                in.nextLine();
                            }
                            in.nextLine();


                            in.nextLine();
                            eggChance = true;
                            nest = false;
                        }

                        if (input.equals("no")) {
                            System.out.println("You dont think its a good idea to fight now."
                                    + "\nthinking you mite want to get down be for it see you.");
                            in.nextLine();
                            System.out
                                    .println("\nit turns its head and jumps at you" + "\nand You fall from the tree. ");
                            in.nextLine();
                            eggChance = true;
                            nest = false;

                        }

                    }

                } // @@<<<<<<<<<This is the home ends
            }
            // @@@HOME@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            boolean home = false;
            if (input.equals("home") || (input.equals("1"))) {


//________________________________________________________________________________________@###
                //Clearing the screen++++++++++++++++++++++++++++++++++++++
                for (int i = 0; i < 50; ++i) System.out.println();






                System.out.println("You walk inside your house. ");

                home = true;

            }

            while (home) {

                System.out.println("\n\n     ___________________________    ");
                System.out.println("    |%%  %%    HOME     %%  %%|    ");
                System.out.println("==============================");
                System.out.println(" Where would you like to go? \n\n ");

                System.out.println("\t" + name + "\n__________\nHP " + health + "\n========\nAtt " + maxAttackDamage
                        + "   Def " + defense + "   Deaths " + playerDeaths + "    Gold " + gold + "    Lv " + level

                        + "\n\nExp " + exp + " // " + nextLevel);

                System.out.println("___________________________________");

                System.out.println("1  Sleep|2  Look|3  Lookself|4  Travel ]   Exit");
                System.out.println("----------------------------------------------------------");

                if (shinyEgg == 1) {
                    System.out.println("[6}Read note");

                }

                input = in.nextLine();

                //________________________________________________________________________________________@###
                //Clearing the screen++++++++++++++++++++++++++++++++++++++
                for (int i = 0; i < 50; ++i) System.out.println();








                if (input.equals("read") || (input.equals("6"))) {
                    System.out.println("hello stranger sorry to burden you");
                    System.out.println("I had to leave something with you ");
                    System.out.println("consider it a gift");
                    System.out.println(" I couldn't continue my journey");
                    System.out.println("just follow your same routine " + "\n and you should see");

                }

                if (input.equals("lookself") || (input.equals("3"))) {
                    System.out.println("[Equipment]" + "\n [#}Sword " + sword + "                    [#}Gender    " + gender
                            + "\n [#}Hat " + hat + "                        [#}Eye Color    " + eyeColor + "\n [#}ShinyEgg "
                            + shinyEgg + "\n [#}Food " + food
                            + "\n [#}FirePotion " + firePotion
                            + "\n [#}IcePotion " + icePotion + "\n [#}WindPotion  "
                            + windPotion+ "\n [#}Shard "
                            + shard + "\n [#}Pet " + petName + " Hp " + petHealth
                            + "\n PlayerStats  " + playerSta
                    );


                    in.nextLine();
                }

                if (input.equals("travel") || (input.equals("4"))) {
                    home = false;
                    travel = true;

                }



                if (input.equals("sleep") || (input.equals("1"))) {



                    System.out.println("\nYou fall right asleep");
                    health = 100;
                }




                if (input.equals("look") && shinyEgg == 0 || (input.equals("2") && shinyEgg == 0)) {
                    System.out.println("\n You see a small shiny egg shape object"
                            + "\n on the floor. It looks to big to be from a" + "\n  bird..");
                }

                if (input.equals("pickup") && shinyEgg == 0) {
                    System.out.println(
                            "You walk up to the Shiny egg and pick it up." + "\nThere most be a good place for this."
                                    + "\n \n You see a note on the floor by the door. ");
                    shinyEgg = 1;
                }

                if (input.equals("exit") || (input.equals("e"))) {
                    home = false;
                }

            } // @@<<<<<<<<<This is the home ends

            // @@@SHOP@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            boolean shop = false;


            if (input.equals("shop") || (input.equals("2"))) {
                shop = true;



                //Clearing the screen++++++++++++++++++++++++++++++++++++++
                for (int i = 0; i < 50; ++i) System.out.println();



                System.out.println("\nYou walk down the road to the shop.");

            }

            while (shop) {
                System.out.println("\n\n     __________________________    ");
                System.out.println("    |%%  %%    SHOP     %%  %%|    ");
                System.out.println("==============================");

                System.out.println("\t" + name + "\n__________\nHP " + health + "\n========\nAtt " + maxAttackDamage
                        + "   Def " + defense + "   Deaths " + playerDeaths + "    Gold " + gold + "    Lv " + level

                        + "\n\nExp " + exp + " // " + nextLevel);

                System.out.println("==============================");

                System.out.println("\tHi, what would you like to buy?\n " + "\n 1[}Sword $100.00 "
                        + "\n 2[}Hat $110.00 " + "\n 3[@}Food $25.00 "

                        + "\n 4[*}FirePotion $130" + "\n 5[*}IcePotion $220" + "\n 6[*}WindPotion  $200"
                        + "\n 8[*}Shard  $10 " + "\n [7}Lookself " + "\n\t [}EXIT\n\n ");
                input = in.nextLine();

                // **************************************************************

                if (input.equals("lookself") || (input.equals("7"))) {
                    System.out.println("[Equipment]" + "\n [#}Sword " + sword + "                    [#}Gender    " + gender
                            + "\n [#}Hat " + hat + "                        [#}Eye Color    " + eyeColor + "\n [#}ShinyEgg "
                            + shinyEgg + "\n [#}Food " + food
                            + "\n [#}FirePotion " + firePotion
                            + "\n [#}IcePotion " + icePotion + "\n [#}WindPotion  "
                            + windPotion+ "\n [#}Shard "
                            + shard + "\n [#}Pet " + petName + " Hp " + petHealth
                            + "\n PlayerStats  " + playerSta
                    );

                    in.nextLine();
                }
                // **************************************************************

                if (input.equals("sword") || (input.equals("1"))) {

                    if (gold > 99 && sword < 2) {
                        System.out.println("This Sword should workout nice.");
                        gold -= 100;
                        sword += 1;
                    }
                }
                // **************************************************************

                if (input.equals("food") || (input.equals("3"))) {

                    if (gold > 25 && food < 9) {
                        System.out.println("This food will work well to heal in " + "\na fight. You give 25$ for some"
                                + "\n premium travel food.");
                        gold -= 25;
                        food += 1;
                    }
                }
                // **************************************************************

                if (input.equals("hat") && hat < 1 || (input.equals("2") && hat < 1)) {

                    if (gold > 110 && hat < 1) {
                        System.out.println("This hat will work well  ");
                        gold -= 110;
                        hat += 1;
                    }
                    if (hat == 1) {
                        defense = defense + 3;
                    }
                }

                // **************************************************************
                if (input.equals("firepotion") || (input.equals("4"))) {

                    if (gold > 130 && firePotion < 9) {
                        System.out.println("You buy a FirePotion.");
                        gold -= 130;
                        firePotion += 1;
                    }
                }
                // **************************************************************
                if (input.equals("windpotion") || (input.equals("6"))) {

                    if (gold > 200 && windPotion < 9) {
                        System.out.println("You buy a windPotion.");
                        gold -= 130;
                        windPotion += 1;
                    }
                }
                // **************************************************************
                if (input.equals("icepotion") || (input.equals("5"))) {

                    if (gold > 220 && icePotion < 9) {
                        System.out.println("You buy a icePotion.");
                        gold -= 220;
                        icePotion += 1;
                    }
                }
                // **************************************************************
                if (input.equals("shard") || (input.equals("8"))) {

                    if (gold > 10 && shard < 9) {
                        System.out.println("You buy a Shard.");
                        gold -= 10;
                        shard += 1;
                    }
                }
                // **************************************************************
                else if (input.equals("exit") || (input.equals("e"))) {
                    shop = false;
                }
            } // @@<<<<<<<<<This is the home ends

            // @@@TRAVEL@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
            // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

            String[] enemies = { "Wolf", "Tiger", "Bear" };

            boolean fight = false;

            if (input.equals("travel") || (input.equals("3"))) {


//Clearing the screen++++++++++++++++++++++++++++++++++++++
                for (int i = 0; i < 50; ++i) System.out.println();





                System.out.println("\nYou head out past the villige" + "\n to see what you can find.");

                travel = true;
            }

            while (travel) {
                boolean forest = false;
                boolean forest2 = false;
                boolean forest3 = false;
                boolean forest4 = false;
                boolean forest5 = false;
                boolean battle = false;

                System.out.println("\n\n     ___________________________    ");
                System.out.println("    |%%  %%   TRAVEL   %%  %%|    ");
                System.out.println("==============================");

                System.out.println("\n\t" + name + "\nHP " + health + "\tAtt " + maxAttackDamage + "\tDef " + defense
                        + "\tDeaths " + playerDeaths + "\nGold " + gold + "\t\t\t\tLv " + level + "\n\nExp " + exp
                        + " // " + nextLevel);

                System.out.println("						* - --===)))(((===-- - *");
                int enemyHealth = rand.nextInt(maxEnemyHealth);
                enemyHealth += 20;
                String enemy = enemies[rand.nextInt(enemies.length)];
                System.out.println("						" +enemy + " Hp " + enemyHealth + " appeared! ");
                System.out.println("						* - --===)))(((===-- - *");

                System.out.println("___________________________________________");
                System.out.println("[1}Fight" + "\t [2}Travel Forest " + "\t [3}Lookself " + "\t\tEXIT");
                System.out.println("------------------------------------------------------------------------");

                input = in.nextLine();




//Clearing the screen++++++++++++++++++++++++++++++++++++++
                for (int i = 0; i < 50; ++i) System.out.println();





                if (input.equals("lookself") || (input.equals("3"))) {
                    System.out.println("[Equipment]" + "\n [#}Sword " + sword + "                    [#}Gender    " + gender
                            + "\n [#}Hat " + hat + "                        [#}Eye Color    " + eyeColor + "\n [#}ShinyEgg "
                            + shinyEgg + "\n [#}Food " + food
                            + "\n [#}FirePotion " + firePotion
                            + "\n [#}IcePotion " + icePotion + "\n [#}WindPotion  "
                            + windPotion+ "\n [#}Shard "
                            + shard + "\n [#}Pet " + petName + " Hp " + petHealth
                            + "\n PlayerStats  " + playerSta
                    );

                    in.nextLine();
                }
                if (input.equals("forest") || (input.equals("2"))) {
                    travel = false;
                    forest = true;
                }

                if (input.equals("exit") || (input.equals("e"))) {
                    travel = false;

                }

                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                String[] petEnemies = { " Old Samurai Ghost ", " PokeMan Trainer and his Charizard "  };

                while (forest) {
                    int maxPetEnemyHealth = 150;

                    int petEnemyHealth = rand.nextInt(maxPetEnemyHealth);
                    String petEnemy = petEnemies[rand.nextInt(petEnemies.length)];

                    System.out.println("\n\n You Walk in the forest. ");
                    System.out.println("@ = = = = ");
                    System.out.println("[1} To Go Back  [2} To Go Forword");
                    System.out.println(petEnemy + "hp " + petEnemyHealth  +"  Jumps Out");
                    System.out.println("\n[ throw } for battle");

                    input = in.nextLine();



                    if (input.equals("throw")) {
                        battle = true;
                        while (battle) {

                            System.out.println("\n\t" + name + "\nHP " + health + "\tAtt " + maxAttackDamage + "\tDef " + defense
                                    + "\tDeaths " + playerDeaths + "\nGold " + gold + "\t\t\t\tLv " + level + "\n\nExp " + exp
                                    + " // " + nextLevel);
                            System.out.println( petEnemy + "hp " + petEnemyHealth  );
                            System.out.println("Your Pet " + petName + " Hp " + petHealth );



                            if(petName == "Wolf") {
                                System.out.println("Slash    Bite");
                            }
                            if(petName == "Tiger") {
                                System.out.println("Pray    Bite");
                            }
                            if(petName == "Bear") {
                                System.out.println("Mall    Bite");
                            }



                            input = in.nextLine();
                            if (petName == null) {
                                System.out.println( petEnemy + "  hits you with a full blow. Not Smart to fight without a companion"  );
                                health = 15;
                                battle = false;
                                forest = false;
                                travel = true;
                            }
                        }
                    }


                    if (input.equals("1")) {
                        forest = false;
                        travel = true;
                    }

                    if (input.equals("2")) {
                        forest2 = true;
                        forest = false;

                    }

                    // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                    // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                    while (forest2) {

                        System.out.println(" You Walk in the forest. ");
                        System.out.println("= @ = = = ");
                        System.out.println("[1} To Go Back  [2} To Go Forword");
                        System.out.println("");

                        input = in.nextLine();

                        if (input.equals("1")) {
                            forest2 = false;
                            forest = true;
                        }

                        if (input.equals("2")) {

                            forest3 = true;
                            forest2 = false;

                        }

                        // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                        // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                        while (forest3) {

                            System.out.println(" You Walk in the forest. ");
                            System.out.println("= = @ = = ");
                            System.out.println("[1} To Go Back  [2} To Go Forword");
                            System.out.println("");

                            input = in.nextLine();

                            if (input.equals("1")) {
                                forest3 = false;
                                forest2 = true;
                            }

                            if (input.equals("2")) {

                                forest4 = true;
                                forest3 = false;

                            }
                            // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                            // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                            while (forest4) {

                                System.out.println(" You Walk in the forest. ");
                                System.out.println("= = = @ = ");
                                System.out.println("[1} To Go Back  [2} To Go Forword");
                                System.out.println("");

                                input = in.nextLine();

                                if (input.equals("1")) {
                                    forest4 = false;
                                    forest3 = true;
                                }

                                if (input.equals("2")) {

                                    forest5 = true;
                                    forest4 = false;

                                }

                                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                                while (forest5) {

                                    System.out.println(" You Walk in the forest. ");
                                    System.out.println("= = = = @ ");
                                    System.out.println("[1} To Go Back ");
                                    System.out.println("");

                                    input = in.nextLine();

                                    if (input.equals("1")) {
                                        forest5 = false;
                                        forest4 = true;
                                    }



                                }}}
                    }
                }
                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
                // %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

                // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                int damageDealt = rand.nextInt(maxAttackDamage);
                int eDamageDealt = rand.nextInt(maxEnemyAttack);

                // @@@@@@FIGHT@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

                if (input.equals("fight") || (input.equals("1"))) {



                    //Clearing the screen++++++++++++++++++++++++++++++++++++++
                    for (int i = 0; i < 50; ++i) System.out.println();



                    System.out.println("\tYou walk up to fight. ");
                    fight = true;
                }

                while (fight) {

                    damageDealt = rand.nextInt(maxAttackDamage);
                    eDamageDealt = rand.nextInt(maxEnemyAttack);

                    System.out.println("!#%FIGHT!#%!#%!#%!#%!#%");
                    System.out.println("\n\t" + name + "\nHP " + health + "\tAtt " + maxAttackDamage + "\tDef "
                            + defense + "\tDeaths " + playerDeaths + "\nGold " + gold + "\t\t\t\tLv " + level
                            + "\n\nExp " + exp + " // " + nextLevel);

                    System.out.println("\n* - --===)))(((===-- - *");
                    System.out
                            .println("The " + enemy + " Hp " + enemyHealth + "\n Kick" + "\n Punch" + "\n [1}Lookself");

                    System.out.println("* - --===)))(((===-- - *");

                    if (shard > 0 && input.equals("throw")) {
                        System.out.println("You throw a shard at the beast and it sits in the air in between you too."
                                + "\n A lite is glows from it and forms around the beast.");
                        int catching = rand.nextInt(10);
                        shard -= 1;

                        if (catching > 7) {

                            System.out.println("\nYou dont see the beast. Just the shard laying on the ground"
                                    + "\n You take the shard. ");
                            petName = enemy;
                            petHealth = enemyHealth;
                            fight = false;
                        }
                    }
                    if (sword > 1) {
                        System.out.println("Slash");

                    }

                    System.out.println("\t EXIT\n");

                    input = in.nextLine();


                    //Clearing the screen++++++++++++++++++++++++++++++++++++++
                    for (int i = 0; i < 50; ++i) System.out.println();




                    if (input.equals("exit") || (input.equals("e"))) {
                        fight = false;
                    }

                    // **************************************************************

                    if (input.equals("lookself") || (input.equals("1"))) {
                        System.out.println("[Equipment]" + "\n [#}Sword " + sword + "                    [#}Gender    " + gender
                                + "\n [#}Hat " + hat + "                        [#}Eye Color    " + eyeColor + "\n [#}ShinyEgg "
                                + shinyEgg + "\n [#}Food " + food
                                + "\n [#}FirePotion " + firePotion
                                + "\n [#}IcePotion " + icePotion + "\n [#}WindPotion  "
                                + windPotion+ "\n [#}Shard "
                                + shard + "\n [#}Pet " + petName + " Hp " + petHealth);

                    }
                    // **************************************************************

                    // @@@Kick@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

                    if (input.equals("kick") || (input.equals("kic"))) {

                        // ENEMY ATT
                        eDamageDealt -= rand.nextInt(defense);
                        health -= eDamageDealt;
                        // PLAYER ATT
                        enemyHealth -= damageDealt;

                        System.out.println("\t#You kick for " + damageDealt);
                        System.out.println("\t!!#! " + enemy + " hit back for " + eDamageDealt + "\n");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                    }

                    // @@@Punch@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

                    if (input.equals("punch") || (input.equals("pun"))) {

                        // ENEMY ATT
                        eDamageDealt -= rand.nextInt(defense);
                        health -= eDamageDealt;

                        // IF PLAYER HAS SWORD
                        if (sword > 0) {
                            damageDealt += 3;
                        }

                        // PLAYER ATT
                        enemyHealth -= damageDealt;

                        System.out.println("\t! !**! !You Punch for " + damageDealt);
                        System.out.println("\t! !##! ! " + enemy + " hit back for " + eDamageDealt + "\n");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    }

                    // @@@SLASH@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                    // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

                    if (input.equals("slash") && sword > 1 || (input.equals("sla") && sword > 1)) {

                        // ENEMY ATT
                        eDamageDealt -= rand.nextInt(defense);
                        health -= eDamageDealt;

                        damageDealt += 15;
                        enemyHealth -= damageDealt;
                        System.out.println("\t! !**! !You pull out your Sword " + "\nand run at the " + enemy + "."
                                + "\nAs you get close you jump at him" + "\ngrab your other Sword and SlAsHiNG"
                                + "\n him for" + damageDealt + "\n");

                        System.out.println("\t! !##! ! " + enemy + " hit back for " + eDamageDealt + "\n");
                        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    }

                    if (input.equals("eat") && food > 0) {

                        System.out.println("You pull out the food you been " + "\nholding and eat some. Then put "
                                + "\nwhat you can back up.\n");
                        health += 25;
                        food -= 1;

                    }

                    if (enemyHealth < 1) {
                        // =============GOLD
                        // DROP=========================================================
                        System.out.println("\n\n! !##! ! The " + enemy + " Died ! !##! ! ");
                        int maxGoldDrop = 55;
                        int goldDrop = +rand.nextInt(maxGoldDrop);

                        System.out.println("You gain " + goldDrop + " Gold from it dealth!\n");
                        gold += goldDrop;
                        // ======================================================================
                        // =============EXP
                        // DROP=========================================================

                        int maxExpDrop = 15;
                        int expDrop = +rand.nextInt(maxExpDrop);

                        System.out.println("You gain " + expDrop + " Exp from it death!\n");
                        exp += expDrop;
                        // ======================================================================

                        fight = false;

                    }
                    if (exp >= 100) {
                        level = 2;
                        maxAttackDamage = 18;
                        nextLevel = 275;
                    }

                    if (exp >= 100) {
                        level = 2;
                        maxAttackDamage = 18;
                        nextLevel = 275;
                    }

                    if (exp >= 275) {
                        level = 3;
                        maxAttackDamage = 20;
                        nextLevel = 420;
                    }

                    if (exp >= 420) {
                        level = 4;
                        maxAttackDamage = 21;
                        nextLevel = 640;
                    }

                    if (exp >= 640) {
                        level = 5;
                        maxAttackDamage = 23;
                        nextLevel = 945;
                    }
                    if (health < 1) {

                        System.out.println(" ! !##! !. . The " + enemy + " hits you to the ground."
                                + "\n You Know you cant Keep Fighting. So" + "\n you retreat .."
                                + "\n Bleed Dripping from your Mouth.." + "\n You most find a place to rest and heal.");
                        fight = false;
                        health = 0;
                        playerDeaths += 1;

                    }

                }

            }

            if (exp >= 100) {
                level = 2;
                maxAttackDamage = 18;
                nextLevel = 275;
            }

            if (exp >= 100) {
                level = 2;
                maxAttackDamage = 18;
                nextLevel = 275;
            }

            if (exp >= 275) {
                level = 3;
                maxAttackDamage = 20;
                nextLevel = 420;
            }

            if (exp >= 420) {
                level = 4;
                maxAttackDamage = 21;
                nextLevel = 640;
            }

            if (exp >= 640) {
                level = 5;
                maxAttackDamage = 23;
                nextLevel = 945;
            }

        }

    }

}