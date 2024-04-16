package study.kuy6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Kata {
    public static String high(String s) {
        List<String> subAnswer = new ArrayList<>(List.of(s.split(" ")));
        List<Integer> score = new ArrayList<>(subAnswer.size());
        for (String string : subAnswer) {
            int sum = 0;
            for (int j = 0; j < string.length(); j++) {
                sum += string.charAt(j) - 96;
            }
            score.add(sum);
        }
        Optional<Integer> maxScore = score.stream()
                .max(Comparator.comparingInt(o -> o));
        int index = 0;
        if(maxScore.isPresent())
             index = score.indexOf(maxScore.get());
        return subAnswer.get(index);
    }
}
