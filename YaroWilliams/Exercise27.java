
import java.util.HashMap;

public class Exercise27 {
    public static void main(String[] args) {
        HashMap<String , Integer> performance = new HashMap<>();
        performance.put("Harry", 81);
        performance.put("Ron", 78);
        performance.put("Hermione", 99);    
        performance.put("Draco", 74);
        performance.put("Neville", 62);

      //  System.out.println("Performance of students: " + performance);
        
      //performance ratings criteria
    //  ✅ Scores **91 - 100** → 🏅 **"Outstanding"**  
    //  ✅ Scores **81 - 90** → 🌟 **"Exceeds Expectations"**  
    //  ✅ Scores **71 - 80** → 📘 **"Acceptable"**  
    //  ✅ Scores **70 or lower** → ❌ **"Fail"** 

    HashMap<String, String> ratings = new HashMap<>();

        for(String student : performance.keySet()){
            int score = performance.get(student);
            String rating;

            if(score >90 && score <101){
                rating = "Outstanding";
            }else if(score >80 && score <91){
                rating = "Exceeds Expectations";
            }else if(score >70 && score <81){
                rating ="Acceptable";
            }else {
                rating ="Fail";
            } 

            ratings.put(student, rating);
            }

            System.out.printf("%-15s %-10s %-25s%n","Student","Score","Rating");
            System.out.println("---------------------------------------------");
            for(String student : performance.keySet()){
                int score = performance.get(student);
                String rating = ratings.get(student);

                System.out.printf("%-15s %-10d %-25s%n",student,score,rating );
            }
        }
    }
