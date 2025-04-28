package Revic;
import java.lang.reflect.Method;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class challenge8_ex28 {
    public static ArrayList<String> cities(String k, String l, String m){
      ArrayList<String> x = new ArrayList<>();
      x.add(k);
      x.add(l);
      x.add(m);
     // System.out.println(x);
      return x;
  }
public static HashMap newCountry(String a,int b,  ArrayList<String> cities ){
    HashMap m4 = new HashMap();

    m4.put("Country", a);
    m4.put("Visits", b);
    m4.put("Cities", cities);
   System.out.println("You visited "+ m4.get("Country")+" " + m4.get("Visits")+ " times"+ " and you've been to "+cities);
    return m4;
}

public static ArrayList map(String a, int b , ArrayList<String> cities){
  
   ArrayList<String> travelList = new ArrayList<>();
   ArrayList<String> traveList1 = new ArrayList<>();
   ArrayList<HashMap> travelLog = new ArrayList<>();
   HashMap<String, String> map1 = new HashMap<>();
   HashMap<String, Integer> map2= new HashMap<>();
   HashMap<String, List> map3 = new HashMap<>();
HashMap m1  = new HashMap();
HashMap m2 = new HashMap();
HashMap m3 = new HashMap();
//HashMap m4 = new HashMap();
travelList.add(0, "Paris");
travelList.add(1, "Lille");
travelList.add(2, "Dijon");
traveList1.add(0, "Berlin");
traveList1.add(1, "Hamburg");
traveList1.add(2, "Stuttgart");
m1.put("Country", "France");
m1.put("Visits", 12);
m1.put("Cities", travelList);
m2.put("Country", "Germany");
m2.put("Visits", 5);
m2.put("Cities", traveList1);
travelLog.add(m1);
travelLog.add(m2);
travelLog.add(newCountry(a,b, cities));
//  travelLog.add(m3);
//System.out.println(travelLog);

return travelLog;
}



   
    public static void main(String[] args) {
     map("England", 4, cities("Everton", "Wembley", "Oxford"));
         }
    }

