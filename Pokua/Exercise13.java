import java.util.Random;

public class Exercise13 {
    public static void main(String[] args) {
        Random rand = new Random();
        int toss = rand.nextInt(2);

        if (toss == 0) {
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }
    }

    }
