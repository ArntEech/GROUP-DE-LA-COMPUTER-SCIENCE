package Revic;
import java.util.Random;
import java.util.Scanner;
public class project3_RockPaperScissors {
    public static void main(String[] args) {
        Random rm=new Random();
        System.out.println("Welcome to the rock 🪨 paper 📜 scissors ✀  game. In this game the are two players: You and I(the computer). Have fun 😊");
        Scanner sc=new Scanner(System.in);
        System.out.println("What do you want to choose ? Rock, paper or scissors");
        String choose=sc.nextLine().toLowerCase();
        String pick="";
        String[] val={"Rock", "Paper","Scissors"};
        if(choose.equals("scissors")||choose.equals("rock")||choose.equals("paper")){
            pick =choose.toLowerCase();
        }
        else{
            System.out.println("Must choose either rock, paper or scissors.");
        }
String var="new";
        if(choose.equals("scissors")||choose.equals("rock")||choose.equals("paper")){
            if(choose.equals("paper")){
                var ="  \n" + //
                                        "    _______\n" + 
                                        "---'   ____)____\n" + 
                                        "          ______)\n" + 
                                        "          _______)\n" + 
                                        "         _______)\n" + 
                                        "---.__________)";
            }
            if(choose.equals("rock")){
                var = "\n" + //
                                        "    _______\n" + 
                                        "---'   ____)\n" + 
                                        "      (_____)\n" + 
                                        "      (_____)\n" + 
                                        "      (____)\n" + 
                                        "---.__(___)";
            }
            if(choose.equals("scissors")){
                var="\n" + //
                                        "    _______\n" + 
                                        "---'   ____)____\n" + 
                                        "          ______)\n" + 
                                        "       __________)\n" + 
                                        "      (____)\n" + 
                                        "---.__(___)";
            }

            System.out.println("You chose: "+var);
        }
        else{
            System.out.print("");
        }

            String set= val[rm.nextInt(3)];
            String select=set.toLowerCase();
            String game="new";
            if(choose.equals("scissors")||choose.equals("rock")||choose.equals("paper")){
                if(select.equals("paper")){
                    game ="  \n" + //
                                            "    _______\n" + //
                                            "---'   ____)____\n" + //
                                            "          ______)\n" + //
                                            "          _______)\n" + //
                                            "         _______)\n" + //
                                            "---.__________)";
                }
                if(select.equals("rock")){
                    game = "\n" + //
                                            "    _______\n" + //
                                            "---'   ____)\n" + //
                                            "      (_____)\n" + //
                                            "      (_____)\n" + //
                                            "      (____)\n" + //
                                            "---.__(___)";
                }
                if(select.equals("scissors")){
                    game="\n" + //
                                            "    _______\n" + //
                                            "---'   ____)____\n" + //
                                            "          ______)\n" + //
                                            "       __________)\n" + //
                                            "      (____)\n" + //
                                            "---.__(___)";
                }
                System.out.println();
            System.out.println("I chose: "+game+"\n");
            }
            
            if(pick.equals("rock")&& select.equals("paper")){
                System.out.println("Yesss!! I won");
            }
            else if(pick.equals("paper")&&select.equals("rock")){
                System.out.println("You won 🥇 ");
            }
            if(pick.equals("rock")&&select.equals("scissors")){
                System.out.println("You won 🥇");
            }
            else if(pick.equals("scissors")&&select.equals("rock")){
                System.out.println("Yessss!! I won");
            }
            if (pick.equals("paper")&& select.equals("scissors")){
                System.out.println("Yesss!! I won");
            }
            else if(pick.equals("scissors")&&select.equals("paper")){
                System.out.println("You won 🥇");
            }
            if(pick.equals(select)){
                System.out.println("No winner or loser! It was a draw. Great game");
            }
        
    }
}
