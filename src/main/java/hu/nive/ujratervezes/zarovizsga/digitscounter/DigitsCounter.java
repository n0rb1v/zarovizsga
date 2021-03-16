package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class DigitsCounter {
    public int getCountOfDigits(String s) {
        if (s == null) {
            return 0;
        }

        Set<Character> ss = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            ss.add(s.charAt(i));
        }
        return ss.size();
    }
}
