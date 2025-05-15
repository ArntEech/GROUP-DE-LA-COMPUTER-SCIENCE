public class Exercise18 {
    public static void main(String[] args) {
        int sum = 0;

        // Sum of all Even numbers from 1 to 100
        for(int i = 0; i<=100;i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("Sum: "+sum);
    }
}
