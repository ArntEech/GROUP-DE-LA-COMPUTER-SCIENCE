import java.util.Scanner;
public class Project5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("""
                *******************************************************************************
                          |                   |                  |                     |
                 _________|________________.=""_;=.______________|_____________________|_______
                |                   |  ,-\"_,=\"\"     `\"=.|                  |
                |___________________|__\"=._o`\"-._        `\"=.______________|___________________
                          |                `\"=._o`\"=._      _`\"=._                     |
                 _________|_____________________:=._o \"=._.\"_.-=\"'\"=.__________________|_______
                |                   |    __.--\" , ; `\"=._o.\" ,-\"\"\"-._ \".   |
                |___________________|_._\"  ,. .` ` `` ,  `\"-._\"-._   \". '__|___________________
                          |           |o`\"=._` , \"` `; .\". ,  \"-._\"-._; ;              |
                 _________|___________| ;`-.o`\"=._; .\" ` '`.\"\\` . \"-._ /_______________|_______
                |                   | |o;    `\"-.o`\"=._``  '` \" ,__.--o;   |
                |___________________|_| ;     (#) `-.o `\"=.`_.--\"_o.-; ;___|___________________
                ____/______/______/___|o;._    \"      `\".o|o_.--\"    ;o;____/______/______/____
                /______/______/______/_\"=._o--._        ; | ;        ; ;/______/______/______/_
                ____/______/______/______/__\"=._o--._   ;o|o;     _._;o;____/______/______/____
                /______/______/______/______/____\"=._o._; | ;_.--\"o.--\"_/______/______/______/_
                ____/______/______/______/______/_____\"=.o|o_.--\"\"___/______/______/______/____
                /______/______/______/______/______/______/______/______/______/______/_____ /
                *******************************************************************************
                """);
        System.out.println("Welcome to Treasure Island");
        System.out.println("Your mission is to find the treasure.");

        System.out.println("You're at a crossroad. Where do you want to go? Type \"left\" or \"right");
        String direction = input.next().toLowerCase();

        if(direction.equals("left")){
            System.out.println("You've come to a lake. There is an island in the middle of the lake. Type \"wait\" to wait for a boat. Type \"swim\" to swim across.'");
            String waitOrSwim = input.next().toLowerCase();
            if(waitOrSwim.equals("wait")){
                System.out.println("You arrive at the island unharmed. There is a house with 3 doors. One red, one yellow and one blue. Which colour do you choose?");
                String door = input.next().toLowerCase();
                if(door.equals("yellow")){
                    System.out.println("You found the treasure! You Win!");
                }else if(door.equals("red")){
                    System.out.println("It's a room full of fire. Game Over.");
                }else if(door.equals("blue")){
                    System.out.println("You enter a room of beasts. Game Over.");
                }else {
                    System.out.println("You chose a door that doesn't exist. Game Over.");
                }
            }else {
                System.out.println("You get attacked by an angry trout. Game Over.");
            }
        }else {
            System.out.println("You fell into a hole. Game Over.");
        }

    }
}