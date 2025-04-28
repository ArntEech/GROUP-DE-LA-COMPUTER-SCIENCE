import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Exercise28 {
    public static void main(String[] args){
        // create a list called travel log that stores the various trvel logs
        List<HashMap<String, Object>> travelLog = new ArrayList<>(); 

        //Adding the first travel record 
        HashMap<String, Object> france = new HashMap<>();
        france.put("Country", "France");
        france.put("Visits", 12);
        france.put("Cities", List.of("Paris", "Lille", "Dijon"));
        travelLog.add(france);

        //Adding the second travel record
        HashMap<String, Object> germany = new HashMap<>();
        germany.put("Country", "Germany");
        germany.put("Visits", 5);
        germany.put("Cities", List.of("Berlin", "Hamburg", "Stuttgart"));
        travelLog.add(germany);

        //System.out.println(travelLog);
        //adding a country
        addNewCountry(travelLog, "Russia", 2, List.of("Moscow", "Saint Petersburg"));
        System.out.println(travelLog);


    }
    public static void addNewCountry(List<HashMap<String, Object>>travelLog, String country, int visits, List<String> cities){
        HashMap<String, Object> newCountry = new HashMap<>();
        newCountry.put("Coutry",country);
        newCountry.put("Visits", visits);
        newCountry.put("Cities", cities);
        travelLog.add(newCountry);

        System.out.println("You've visited "+country+" "+visits+" times");
        System.out.println("You've been to "+String.join(" and ", cities)+". ");
    }
}

