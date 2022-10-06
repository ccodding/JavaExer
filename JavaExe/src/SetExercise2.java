import java.util.HashSet;
import java.util.Set;

public class SetExercise2 {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        Set<Character> characters = new HashSet<>();
        int cnt = 0;
        while (cnt < 30) {
            characters.add(alphabetGenerator.generate(0));
            cnt += 1;
        }
        System.out.println(characters);
        System.out.println(characters.size());
    }
}