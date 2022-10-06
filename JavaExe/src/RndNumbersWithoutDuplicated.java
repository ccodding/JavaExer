import java.util.HashSet;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            int r = randomNumberGenerator.generate(20);
            numbers.add(r);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
