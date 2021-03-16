package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DigitsCounter {
    public int getCountOfDigits(String s) {
        if (s == null) {
            return 0;
        }
        List<Character> chars = List.of('0','1','2','3','4','5','6','7','8','9');
        Set<Character> ss = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))){
                ss.add(s.charAt(i));
            }
        }
        return ss.size();
    }
}
