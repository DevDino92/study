import java.util.HashMap;
import java.util.Map;

public class marathon {
    public static void main(String[] args) {
        String[] participant={"leo", "kiki", "eden"};
        String[] completion={"leo", "kiki"};
       
        System.out.println(Solution.solution(participant,completion));
    }

    public class Solution {
        public static String solution(String[] participant, String[] completion) {
            String answer = "";
             Map<String, Integer> map = new HashMap<>();
            
            
            for(String name : participant){
                map.put(name, map.getOrDefault(name,0) + 1);
            }
            for(String name : completion){
                map.put(name, map.get(name) - 1);
            }
    
            for(String key : map.keySet()){
                if(0 < map.get(key)){
                    answer = key;
                    break;
                }
            }

            return answer;
        }
    }
}