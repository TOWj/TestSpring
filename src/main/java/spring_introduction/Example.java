package spring_introduction;


import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        String s = "ababababa";
        String t = "bbaaaa";
        int[] array = {7, 2, 5, 1, 6, 4};
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        if (map.size() == 1){
            return map.get(s.charAt(0));
        }
        for (Integer value : map.values()){
            if (value % 2 == 0){
                res += value;
            }else{
                res += value - 1;

            }
        }
        if (res < s.length()){
            res += 1;
        }
        return res;
    }
}



