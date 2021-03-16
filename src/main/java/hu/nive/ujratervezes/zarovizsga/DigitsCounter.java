package hu.nive.ujratervezes.zarovizsga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitsCounter {

    public int getCountOfDigits(String s) {

        if (s != null && !s.isEmpty()) {

            List<Integer> szamok = new ArrayList<>();
            char[] ch = s.toCharArray();

            for (char c : ch) {
                if (!szamok.contains(Character.getNumericValue(c))) {
                    if (c<97 && c != ' ') {
                        szamok.add(Character.getNumericValue(c));
                    }
                }
            }

            return szamok.size();
        } else {
            return 0;
        }

    }

}
