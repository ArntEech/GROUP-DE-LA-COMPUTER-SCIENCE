package Revic;
import java.util.Scanner;
public class project5_TreasureIsland {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello , what is your name ? ");
        String name = sc.next();
        System.out.println("\n" + //
                        "*******************************************************************************\n" + //
                        "          |                   |                  |                     |\n" + //
                        " _________|________________.=\"\"_;=.______________|_____________________|_______\n" + //
                        "|                   |  ,-\"_,=\"\"     `\"=.|                  |\n" + //
                        "|___________________|__\"=._o`\"-._        `\"=.______________|___________________\n" + //
                        "          |                `\"=._o`\"=._      _`\"=._                     |\n" + //
                        " _________|_____________________:=._o \"=._.\"_.-=\"'\"=.__________________|_______\n" + //
                        "|                   |    __.--\" , ; `\"=._o.\" ,-\"\"\"-._ \".   |\n" + //
                        "|___________________|_._\"  ,. .` ` `` ,  `\"-._\"-._   \". '__|___________________\n" + //
                        "          |           |o`\"=._` , \"` `; .\". ,  \"-._\"-._; ;              |\n" + //
                        " _________|___________| ;`-.o`\"=._; .\" ` '`.\"\\` . \"-._ /_______________|_______\n" + //
                        "|                   | |o;    `\"-.o`\"=._``  '` \" ,__.--o;   |\n" + //
                        "|___________________|_| ;     (#) `-.o `\"=.`_.--\"_o.-; ;___|___________________\n" + //
                        "____/______/______/___|o;._    \"      `\".o|o_.--\"    ;o;____/______/______/____\n" + //
                        "/______/______/______/_\"=._o--._        ; | ;        ; ;/______/______/______/_\n" + //
                        "____/______/______/______/__\"=._o--._   ;o|o;     _._;o;____/______/______/____\n" + //
                        "/______/______/______/______/____\"=._o._; | ;_.--\"o.--\"_/______/______/______/_\n" + //
                        "____/______/______/______/______/_____\"=.o|o_.--\"\"___/______/______/______/____\n" + //
                        "/______/______/______/______/______/______/______/______/______/______/_____ /\n" + //
                        "*******************************************************************************\n" + //
                        "");
                        System.out.println("Welcome to Treasure Island, "+name + ". Your mission is to find the treasure.Good luck");
System.out.println("I have an offer for you . But first, are you a male 👨 or a female 👩. Type your gender here  ? ");
String sex = sc.next().toLowerCase();
if(sex.equals("male")){
    System.out.println("You have to find your treasure in the bottom part of the Island , as it is designated for males. Are you ready to begin the search?(Yes or No )");
String stat = sc.next().toLowerCase();
                if(stat.equals("yes")){
     System.out.println("You are now on the bottom Island. You can go foward , backward, left or right. Which direction do you want to take ? ");
    String loc = sc.next().toLowerCase();
    if(loc.equals("right")){
     System.out.println("                       o                    \n" + //
                  "                       _---|         _ _ _ _ _ \n" + //
                  "                    o   ---|     o   ]-I-I-I-[ \n" + //
                  "   _ _ _ _ _ _  _---|      | _---|    \\ ` ' / \n" + //
                  "   ]-I-I-I-I-[   ---|      |  ---|    |.   | \n" + //
                  "    \\ `   '_/       |     / \\    |    | /^\\| \n" + //
                  "     [*]  __|       ^    / ^ \\   ^    | |*|| \n" + //
                  "     |__   ,|      / \\  /    `\\ / \\   | ===| \n" + //
                  "  ___| ___ ,|__   /    /=_=_=_=\\   \\  |,  _|\n" + //
                  "  I_I__I_I__I_I  (====(_________)___|_|____|____\n" + //
                  "  \\-\\--|-|--/-/  |     I  [ ]__I I_I__|____I_I_| \n" + //
                  "   |[]      '|   | []  |`__  . [  \\-\\--|-|--/-/  \n" + //
                  "   |.   | |' |___|_____I___|___I___|---------| \n" + //
                  "  / \\| []   .|_|-|_|-|-|_|-|_|-|_|-| []   [] | \n" + //
                  " <===>  |   .|-=-=-=-=-=-=-=-=-=-=-|   |    / \\  \n" + //
                  " ] []|`   [] ||.|.|.|.|.|.|.|.|.|.||-      <===> \n" + //
                  " ] []| ` |   |/////////\\\\\\\\\\\\\\\\\\\\.||__.  | |[] [ \n" + //
                  " <===>     ' ||||| |   |   | ||||.||  []   <===>\n" + //
                  "  \\T/  | |-- ||||| | O | O | ||||.|| . |'   \\T/ \n" + //
                  "   |      . _||||| |   |   | ||||.|| |     | |\n" + //
                  "../|' v . | .|||||/____|____\\|||| /|. . | . ./\n" + //
                  ".|//\\............/...........\\........../../\n"+
                  "\n");
                 System.out.println("You have been directed to a castle . Do you want to search for the treasure there ? (Yes or no)");
String say= sc.next().toLowerCase();
            if(say.equals("yes")){
    System.out.println("Searching in the castle for the treasure...\n Oops. The treasure is not in the castle .Sorry . You may have to searh elsewhere ");
}
        else{
    System.out.println("Where do you want to search ? There are three other areas . The church, the house and the temple ");
    String sfind= sc.next().toLowerCase();
    if(sfind.equals("church")||sfind.equals("house")||sfind.equals("temple")){
        System.out.println("Okay. Let's go to "+ sfind);
    }
    else{
System.out.println("You have exited the game. Please start over.");
    }
    if(sfind.equals("temple")){
System.out.println("  )\\         O_._._._A_._._._O         /(\n" + //
        "                \\`--.___,'=================`.___,--'/\n" + //
        "                 \\`--._.__                 __._,--'/\n" + //
        "                   \\  ,. l`~~~~~~~~~~~~~~~'l ,.  /\n" + //
        "       __            \\||(_)!_!_!_.-._!_!_!(_)||/            __\n" + //
        "       \\\\`-.__        ||_|____!!_|;|_!!____|_||        __,-'//\n" + //
        "        \\\\    `==---='-----------'='-----------`=---=='    //\n" + //
        "        | `--.                                         ,--' |\n" + //
        "         \\  ,.`~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~',.  /\n" + //
        "           \\||  ____,-------._,-------._,-------.____  ||/\n" + //
        "            ||\\|___!`=======\"!`=======\"!`=======\"!___|/||\n" + //
        "            || |---||--------||-| | |-!!--------||---| ||\n" + //
        "  __O_____O_ll_lO_____O_____O|| |'|'| ||O_____O_____Ol_ll_O_____O__\n" + //
        "  o H o o H o o H o o H o o |-----------| o o H o o H o o H o o H o\n" + //
        " ___H_____H_____H_____H____O =========== O____H_____H_____H_____H___\n" + //
        "                          /|=============|\\\n" + //
        "()______()______()______() '==== +-+ ====' ()______()______()______()\n" + //
        "||{_}{_}||{_}{_}||{_}{_}/| ===== |_| ===== |\\{_}{_}||{_}{_}||{_}{_}||\n" + //
        "||      ||      ||     / |==== s(   )s ====| \\     ||      ||      ||\n" + //
        "======================()  =================  ()======================\n" + //
        "----------------------/| ------------------- |\\----------------------\n" + //
        "                     / |---------------------| \\\n" + //
        "-'--'--'           ()  '---------------------'  ()\n" + //
        "                   /| ------------------------- |\\    --'--'--'\n" + //
        "       --'--'     / |---------------------------| \\    '--'\n" + //
        "                ()  |___________________________|  ()           '--'-\n" + //
        "  --'-          /| _______________________________  |\\\n" + //
        " --'           / |__________________________________| \\\n"+
        "You're now at the temple do you want to search the temple ?(yes or no ) ");
    
    String temp = sc.next().toLowerCase();
if(temp.equals("yes")){
    System.out.println("Searching temple...\n Oops. the tresure isn't here . Search elsewhere" );
}else{
    System.out.println("Alright . You can move on");
}
    }
if(sfind.equals("church")){
    System.out.println("\n" + //
                "                                      .\n" + //
                "                                    .' '.\n" + //
                "                                  .'  |  `.\n" + //
                "                                .'    |    `.\n" + //
                "                              .`---.._|_..---'.\n" + //
                "                               ||    |=|    ||\n" + //
                "                               ||_.-'|=|`-._||\n" + //
                "                               ||`-._|=|_.-'||\n" + //
                "                          _____||    |=|    ||__\n" + //
                "            ____________.'     `-.   |=|  .'_.'\\/`.\n" + //
                "          .'       _  .' _______  `-.|_|.' .'\\.'`./`.\n" + //
                "        .'     _   _.'      _   _        .'\\.' `._`./`.\n" + //
                "      .' _       _.' __          __    .'\\.'  ___`._`./`.\n" + //
                "    .'        _ .'   _____           .'\\.'         `._`./`.\n" + //
                "  .'  _  _    .'       ______      .'\\.'  __         `._`./`.\n" + //
                ".'`--...__ _.'            ______ .'\\.'           __    `._`./`.\n" + //
                " `--...__ .'   ____            .'\\.'           _         `._`./`.\n" + //
                " |      .`--...__            .'\\.'     _               ____`._`./`.\n" + //
                " | /`-._ `--...__`--...___ .'\\.'              _______       _`._`./`.\n" + //
                " | | ) ( |       `--...____\\.'     _     _  .'      .`.        `._`./\n" + //
                " | |)   (| /`-._             |            .'      .'   `.     _ |\n" + //
                " | |(--| | | )( |  /`-._`--._|____       /      .'       `.     |\n" + //
                " | | ) `.| |(  )|  | )( |    | _      _ /      /   .---.  `\\    |\n" + //
                " | `--._ | |/  \\|  |(  )|`-  |         /`--.._/   /     \\  ' _  |\n" + //
                " | `-.   | |)-.(|  |/  \\|    |       __|      |_  |`-   |  |  _ |\n" + //
                " |    `-.| |) |(|  |)-.(|    |  ___  _ |  __  | __| \\`- |  |    |\n" + //
                " '-._    | `--._/  |) |(|    |      __ |      |   | |`- |  | _  |\n" + //
                "     `-._| `--.    `--._/    |  ___    | _    |   | |`- |  |   '|\n" + //
                "         |      `--._        |       _ |    ' |   |O|`- | _| _  |\n" + //
                "         '--._         `--._ |         | _    |_ \"| |`- |. |  __|\n" + //
                "              `--._          |       __|      |   | |`- |. | __ |\n" + //
                "                   `--._     |__       |   _  |\"  | |`- |  |___ |\n" + //
                "                        `--._|_________|_     | _ |  `- |_ |____|\n" + //
                "                                         '--._|___|     |__|"+
                "You're now at the church do you want to search the church ?(yes or no ) ");


String church = sc.next().toLowerCase();
if(church.equals("yes")){
    System.out.println("Searching church...\n Oops. the tresure isn't here . Search elsewhere" );
}else{
    System.out.println("Alright . You can move on");
}
}
if(sfind.equals("house")){
    System.out.println("                 ..'''::::...\n" + //
                "              .::'      `'''':::..\n" + //
                "        '...::'               `.----.\n" + //
                "                              /_.--._\\\n" + //
                "                            ,  |=   |\n" + //
                "                          ,/ \\,|  =-|\n" + //
                "                        ,/ /`\\ \\,   |\n" + //
                "                      ,/ /`___`\\ \\,-|\n" + //
                "                    ,/ /'.-:\";-.`\\ \\|\n" + //
                "                  ,/ /` //_|_|_\\\\ `\\ \\, ,/\\,\n" + //
                "                ,/ /`   ||_|_|_||   `\\;/ /\\ \\,\n" + //
                "              ,/ /`     ||_|_|_||   ,/ /`/\\`\\ \\,\n" + //
                "            ,/ /`    ==_`-------' ,/ /` ~\\/~ `\\ \\,\n" + //
                "          ,/ /` __|     _       ,/ /`         =`\\ \\,\n" + //
                "        ,/ /`==_     __|___-  ,/ /` ==-=|__|     `\\ \\,\n" + //
                "      ,/ /`        --=      ,/ /`            __|-- `\\ \\,\n" + //
                "    ,/ /`  |__ ..----.. = ,/ /`()    .-\"\"\"\"\"-.     ()`\\ \\,\n" + //
                "   / /`|     .'_.-;;-._'./ /; {__} .'.-\"\"\"\"\"-.'.  {__} ;\\ \\\n" + //
                "  |/`  |_| =/.; | || | ;|/` | |::|/.'  _____  '.\\ |::| | `\\|\n" + //
                "       |   |/_|_|_||_|_|_\\| |=\\::/||  /|_|_|\\  || \\::/ |\n" + //
                "       | -=|| | | || | | || |  || || |_|_|_|_| ||  |||_|\n" + //
                "       | , ||-|-|-||-|-|-||=|  JL || |_|_|_|_| ||  JL  |\n" + //
                "       |/_\\||_|_|_||_|_|_||-|'    ||   .:::.   ||=_   _|\n" + //
                "       /_ (|| | | || | | || |  ==_|| /:::::::\\ || __P__|\n" + //
                "       /_\\ \\|-|-|-||-|-|-|| |     || |::(`)::| ||/\\ |  `\\\n" + //
                "      `>/ _\\\\_|_|_||_|_|_||-|-'|__|| \\/`\\+/`\\/ ||||_____|\n" + //
                "      /_/   <-------------' |     ||()\\_/Y\\_/  ||/  || |\n" + //
                "     /  ` \\_ ( ==_  __|-    |_|_  ||   / / \\   || =_|| |\n" + //
                "    `/_) | _ <`   __        |   = ||  /_/ \\_\\  ||   || |\n" + //
                "     >  /     \\ == _  ==_   | -   ||           ||=  || |\n" + //
                "    /_/   ( \\  `\\ _| =__   =|-__|_||-----------||_| || |\n" + //
                "   )-._/ _\\ _,-('    __.;-'-;__     `\"\"\"\"\"\"\"\"\"\"\"    ||`\"-._\n" + //
                "  '-,._   \\__.-`-;''`          ``--'`\"\"'\"\"\"`\"\"\"``-- `--'--. '\n" + //
                "       ```             ``         `\"\"\"\"'\"\"\"\"'\"`\"\"\".--------'"+
                "You're now at the house. Do you want to search the house ? ?(yes or no ) ");
                

String house = sc.next().toLowerCase();
if(house.equals("yes")){
    System.out.println( 
                "Searching... \n"+
                "*******************************************************************************\n" + //
                "          |                   |                  |                     |\n" + //
                " _________|________________.=\"\"_;=.______________|_____________________|_______\n" + //
                "|                   |  ,-\"_,=\"\"     `\"=.|                  |\n" + //
                "|___________________|__\"=._o`\"-._        `\"=.______________|___________________\n" + //
                "          |                `\"=._o`\"=._      _`\"=._                     |\n" + //
                " _________|_____________________:=._o \"=._.\"_.-=\"'\"=.__________________|_______\n" + //
                "|                   |    __.--\" , ; `\"=._o.\" ,-\"\"\"-._ \".   |\n" + //
                "|___________________|_._\"  ,. .` ` `` ,  `\"-._\"-._   \". '__|___________________\n" + //
                "          |           |o`\"=._` , \"` `; .\". ,  \"-._\"-._; ;              |\n" + //
                " _________|___________| ;`-.o`\"=._; .\" ` '`.\"\\` . \"-._ /_______________|_______\n" + //
                "|                   | |o;    `\"-.o`\"=._``  '` \" ,__.--o;   |\n" + //
                "|___________________|_| ;     (#) `-.o `\"=.`_.--\"_o.-; ;___|___________________\n" + //
                "____/______/______/___|o;._    \"      `\".o|o_.--\"    ;o;____/______/______/____\n" + //
                "/______/______/______/_\"=._o--._        ; | ;        ; ;/______/______/______/_\n" + //
                "____/______/______/______/__\"=._o--._   ;o|o;     _._;o;____/______/______/____\n" + //
                "/______/______/______/______/____\"=._o._; | ;_.--\"o.--\"_/______/______/______/_\n" + //
                "____/______/______/______/______/_____\"=.o|o_.--\"\"___/______/______/______/____\n" + //
                "/______/______/______/______/______/______/______/______/______/______/_____ /\n" + //
                "*******************************************************************************\n" + 
                "Yaaaayyyy! You found the treasure!! Well done" );
}
else{
    System.out.println("Alright . You can move on");
}
}
 }
 
    }
    else if(loc.equals("foward")){
        System.out.println("It seems right is invaded with treasure hunters. They have found all the treasure there . Take a different direction");
    }
    else if(loc.equals("backward")){
        System.out.println(" This place this direction leads is inhabitable by humans. No one dared step foot in there . Try again ");
    }
    else if(loc.equals("left")){
        System.out.println("Master, did is where you just came from !! There's nothing there");
    }
}
else {
    System.out.println("Sure then . Let me know when you're ready to begin the search. Byeeee");
}
    }
    else if(sex.equals("female")){
         System.out.println("You're on the wrong Island girl. All hidden treasures here are masculine. However, you can register as a male to play the game");
    }
}

}

