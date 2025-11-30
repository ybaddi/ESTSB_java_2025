import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainDict {

    public static void main(String[] args) {
        List list = Arrays.asList(2,5,"Bonjour",true,'c',"3"
                ,"b",false,10);

        HashMap<String,Integer> hm = new HashMap<>();
        for(Object item : list){
            String type = item.getClass().toString();
            // System.out.println(type);
            if(hm.containsKey(type)){
                hm.put(type, hm.get(type)+1);
            }else{
                hm.put(type, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue
                    ());
        }

        var x = Map.entry(3, "JavaScript");
        var y = Map.entry(2, "HTML");
        var z = Map.entry(1, "CSS");
        Map<Integer, String> map = Map.ofEntries(x,y,z);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue
                    ());
        }
    }
}
