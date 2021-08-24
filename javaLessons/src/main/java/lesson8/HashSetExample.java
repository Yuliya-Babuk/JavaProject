package lesson8;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    static void Run() {
        String[] wordsArray = {"Love", "Earth", "Moon", "Sea", "Love", "Faith", "Fate", "Hope", "Dream", "Love"
                , "Faith", "Air",};
        Set<String> wordsArrayUnique = new LinkedHashSet<>(List.of(wordsArray));
        for (String s : wordsArrayUnique) {
            int count = Collections.frequency(List.of(wordsArray), s);
            System.out.println(s + " repeats " + count + " times");
        }
        System.out.println(wordsArrayUnique);
    }
}
