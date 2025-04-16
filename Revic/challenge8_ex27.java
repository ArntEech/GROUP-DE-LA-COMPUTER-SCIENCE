package Revic;
import java.util.HashMap;
public class challenge8_ex27{
    public static void setd(){
        

    }
    public static void main(String[] args){
        HashMap<String, Integer> scoresData = new HashMap<>();
        scoresData.put("Harry", 81);
        scoresData.put("Ron", 78);
        scoresData.put("Hermione", 99);
        scoresData.put("Draco", 74);
        scoresData.put("Neville", 62);
        //System.out.println(stdinfo);
        //System.out.println( scoresData.keySet());
        //System.out.println();
        HashMap<String, String> stdrate = new HashMap<>();
        // if(stdinfo.get("Ron")>34);
         for(String  a : scoresData.keySet()){
            if(scoresData.get(a)>90){
    stdrate.put(a, "Outstanding");
            }
                else if(scoresData.get(a)>80 && scoresData.get(a)<=90){
                    stdrate.put(a, "Exceeds expectations");
                }
                else if(scoresData.get(a)>70 && scoresData.get(a)<=80){
                    stdrate.put(a, "Acceptable");
                }
                else {
                    stdrate.put(a, "Fail");
                }

         }
        }

    }
