import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> repetition = new HashMap();
        repetition.put("Java",2);
        repetition.put("PHP",5);
        repetition.put("C++",1);
        repetition.put("HTML",4);
        for (Map.Entry<String, Integer> entry : repetition.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue
//                    ());
            for(int i =0; i<entry.getValue(); i++){
                System.out.print(entry.getKey());
            }
            System.out.print(" ");
        }
    }
}