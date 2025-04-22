import java.util.HashMap;

public class Exercise27 {
    public static void  main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        hashMap.put("Harry",81);
        hashMap.put("Ron",78);
        hashMap.put("Hermione",99);
        hashMap.put("Draco", 74);
        hashMap.put("Neville", 62);

        HashMap<String, Integer> ratings = new HashMap<String, Integer>();

        for(int i: hashMap.values()){
            if (i>=91 && i<=100){
                ratings.put("Outstanding",i);
            }else if (i>=81 && i<=90){
                ratings.put("Exceeds Expectation",i);
            }else if(i>=71 && i<=80){
                ratings.put("Acceptable",i);
            }else {
                ratings.put("Fail",i);
            }
        }

    }
}
