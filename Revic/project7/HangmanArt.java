package Revic.project7;

public class HangmanArt {
    public static void logo(){
        System.out.println("╔╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╗\n" + //
                        "╠╬╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╬╣\n" + //
                        "╠╣         _       _    _                   _             _              _   _         _                   _          ╠╣\n" + //
                        "╠╣        / /\\    / /\\ / /\\                /\\ \\     _    /\\ \\           /\\_\\/\\_\\ _    / /\\                /\\ \\     _  ╠╣\n" + //
                        "╠╣       / / /   / / // /  \\              /  \\ \\   /\\_\\ /  \\ \\         / / / / //\\_\\ / /  \\              /  \\ \\   /\\_\\╠╣\n" + //
                        "╠╣      / /_/   / / // / /\\ \\            / /\\ \\ \\_/ / // /\\ \\_\\       /\\ \\/ \\ \\/ / // / /\\ \\            / /\\ \\ \\_/ / /╠╣\n" + //
                        "╠╣     / /\\ \\__/ / // / /\\ \\ \\          / / /\\ \\___/ // / /\\/_/      /  \\____\\__/ // / /\\ \\ \\          / / /\\ \\___/ / ╠╣\n" + //
                        "╠╣    / /\\ \\___\\/ // / /  \\ \\ \\        / / /  \\/____// / / ______   / /\\/________// / /  \\ \\ \\        / / /  \\/____/  ╠╣\n" + //
                        "╠╣   / / /\\/___/ // / /___/ /\\ \\      / / /    / / // / / /\\_____\\ / / /\\/_// / // / /___/ /\\ \\      / / /    / / /   ╠╣\n" + //
                        "╠╣  / / /   / / // / /_____/ /\\ \\    / / /    / / // / /  \\/____ // / /    / / // / /_____/ /\\ \\    / / /    / / /    ╠╣\n" + //
                        "╠╣ / / /   / / // /_________/\\ \\ \\  / / /    / / // / /_____/ / // / /    / / // /_________/\\ \\ \\  / / /    / / /     ╠╣\n" + //
                        "╠╣/ / /   / / // / /_       __\\ \\_\\/ / /    / / // / /______\\/ / \\/_/    / / // / /_       __\\ \\_\\/ / /    / / /      ╠╣\n" + //
                        "╠╣\\/_/    \\/_/ \\_\\___\\     /____/_/\\/_/     \\/_/ \\/___________/          \\/_/ \\_\\___\\     /____/_/\\/_/     \\/_/       ╠╣\n" + //
                        "╠╬╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╦╬╣\n" + //
                        "╚╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╩╝");
    }
   // public static void stages(){
   static String stage1 =
                "  +---+\n" + //
                "  |   |\n" + //
                "  O   |\n" + //
                " /|\\  |\n" + //
                " / \\  |\n" + //
                "      |\n" + //
                "=========\n";
   static  String stage2 =           
                "  +---+\n" + //
                "  |   |\n" + //
                "  O   |\n" + //
                " /|\\  |\n" + //
                " /    |\n" + //
                "      |\n" + //
                "=========\n";
   static String stage3 =
                "  +---+\n" + //
                "  |   |\n" + //
                "  O   |\n" + //
                " /|\\  |\n" + //
                "      |\n" + //
                "      |\n" + //
                "=========\n";
   static String stage4=
                "  +---+\n" + //
                "  |   |\n" + //
                "  O   |\n" + //
                " /|   |\n" + //
                "      |\n" + //
                "      |\n" + //
                "=========\n";
    static String stage5 =
                "  +---+\n" + //
                "  |   |\n" + //
                "  O   |\n" + //
                "  |   |\n" + //
                "      |\n" + //
                "      |\n" + //
                "=========\n";

   static  String stage6 =
                "  +---+\n" + //
                "  |   |\n" + //
                "  O   |\n" + //
                "      |\n" + //
                "      |\n" + //
                "      |\n" + //
                "=========\n";
   static  String stage7 =
                "  +---+\n" + //
                "  |   |\n" + //
                "      |\n" + //
                "      |\n" + //
                "      |\n" + //
                "      |\n" + //
                "=========";
              //      }     
    public static void main(String[] args){
                    System.out.println(HangmanArt.stage1);
                    System.out.println(HangmanArt.stage2);
                    System.out.println(HangmanArt.stage3);
                    System.out.println(HangmanArt.stage4);
                    System.out.println(HangmanArt.stage5);
                    System.out.println(HangmanArt.stage6);
                    System.out.println(HangmanArt.stage7);


                }
}
