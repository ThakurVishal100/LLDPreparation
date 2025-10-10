package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Aman");
        System.out.println(map.get(2));
//        map.put(1,"krish");   //   overRide

//        map.put(2,"Aman");
//        map.put(2,"krishna");
//        map.put(null,"Arthav");
//        map.put(4,null);
        //   print map
//        System.out.println("Map"+ map);
//
//        System.out.println(map.get(null));
//        System.out.println(map.get(4));
//        //    iterate
//        for(Integer key:map.keySet()){
//            System.out.println("Key:"+key+","+"Value:"+map.get(key));
//        }
    }
}
