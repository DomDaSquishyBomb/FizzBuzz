public class Multiples {
    public static void main(String[] args) {
        int i = 999;
        int count = 0;

        while (i > 2) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
            count++;
            }
            i--;

        }

        System.out.println(count);

    }
}
